/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author breno
 */
public class ClienteDAO {
      Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> Cliente = new ArrayList<>();

    public void cadastar(ClienteDTO objfuncionariodto) {
        String sql = "insert into cliente (Nome,Contato,Horario,Data) values(?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getContato());

            pstm.setString(3, objfuncionariodto.getHorario());
            pstm.setString(4, objfuncionariodto.getData());
            

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!");
        }
    }

    public ArrayList<ClienteDTO> PesquisarCliente() {
        String sql = "select * from cliente";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ClienteDTO objfuncionariodto = new ClienteDTO();
                objfuncionariodto.setNome(rs.getString("Nome"));
                objfuncionariodto.setContato(rs.getString("Contato"));
                objfuncionariodto.setHorario(rs.getString("Horario"));
                                objfuncionariodto.setData(rs.getString("Data"));

                
                Cliente.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar: " + erro);
        }
        return Cliente;

    }
public void excluir(ClienteDTO objrevisãodto){
       String sql= "DELETE FROM cliente where Nome = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getNome());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
        }     
}
 public void alterar(ClienteDTO objfuncionariodto) {
        String sql = "Update  cliente set where Nome = ? ,Contato = ?,Horario = ?,Data = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getContato());

            pstm.setString(3, objfuncionariodto.getHorario());
            pstm.setString(4, objfuncionariodto.getData());
          
            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alterado");

        } catch (Exception erro) {
        }
    }
}
