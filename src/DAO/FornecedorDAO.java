/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.FornecedorDTO;
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
public class FornecedorDAO {
      Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FornecedorDTO> Fornecedor = new ArrayList<>();

    public void cadastar(FornecedorDTO objfuncionariodto) {
            String sql = "insert into fornecedor (Nome,Endereco,Contato) values(?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
                        pstm.setString(1, objfuncionariodto.getNome());

            pstm.setString(2,objfuncionariodto.getEndereco());

            pstm.setString(3, objfuncionariodto.getContato());

            

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!");
        }
    }

    public ArrayList<FornecedorDTO> PesquisarFornecedor() {
        String sql = "select * from fornecedor";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                FornecedorDTO objfuncionariodto = new FornecedorDTO();
                objfuncionariodto.setNome(rs.getString("Nome"));
                                objfuncionariodto.setEndereco(rs.getString("Endereco"));

                objfuncionariodto.setContato(rs.getString("Contato"));

                
                Fornecedor.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EquipamentoDAO Pesquisar: " + erro);
        }
        return Fornecedor;

    }
public void excluir(FornecedorDTO objrevisãodto){
       String sql= "DELETE FROM fornecedor where Nome = ?";
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
 public void alterar(FornecedorDTO objfuncionariodto) {
        String sql = "Update  equipamento set where Nome = ? , Endereco = ?,Contato =  ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getEndereco());

            pstm.setString(3, objfuncionariodto.getContato());

          
            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alterado");

        } catch (Exception erro) {
        }
    }
}
