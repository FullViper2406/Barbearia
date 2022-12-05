/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.PrecoDTO;
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
public class PrecoDAO {
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PrecoDTO> Preco = new ArrayList<>();

    public void cadastar(PrecoDTO objfuncionariodto) {
        String sql = "insert into preco (Cabelo,Barba,Sobrancelha) values(?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getCabelo());
            pstm.setString(2, objfuncionariodto.getBarba());

            pstm.setString(3, objfuncionariodto.getSobrancelha());
            

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!");
        }
    }

    public ArrayList<PrecoDTO> PesquisarPreco() {
        String sql = "select * from preco";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                PrecoDTO objfuncionariodto = new PrecoDTO();
                objfuncionariodto.setCabelo(rs.getString("Cabelo"));
                objfuncionariodto.setBarba(rs.getString("Barba"));
                objfuncionariodto.setSobrancelha(rs.getString("Sobrancelha"));
                
                Preco.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PrecoDAO Pesquisar: " + erro);
        }
        return Preco;

    }
public void excluir(PrecoDTO objrevisãodto){
       String sql= "DELETE FROM preco where Cabelo = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getCabelo());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
        }     
}
 public void alterar(PrecoDTO objfuncionariodto) {
        String sql = "Update  preco set where Cabelo = ? ,Barba = ?,Sobrancelha = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getCabelo());
            pstm.setString(2, objfuncionariodto.getBarba());

            pstm.setString(3, objfuncionariodto.getSobrancelha());
          
            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alterado");

        } catch (Exception erro) {
        }
    }
}
