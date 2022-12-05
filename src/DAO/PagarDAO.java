/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.PagarDTO;
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
public class PagarDAO {
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PagarDTO> Pagar = new ArrayList<>();

    public void cadastar(PagarDTO objfuncionariodto) {
        String sql = "insert into pagar (Nome,Data,Valor) values(?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getData());

            pstm.setString(3, objfuncionariodto.getValor());
            

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Pago com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Pagamento inválido !!");
        }
    }

    public ArrayList<PagarDTO> PesquisarPagar() {
        String sql = "select * from pagar";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                PagarDTO objfuncionariodto = new PagarDTO();
                objfuncionariodto.setNome(rs.getString("Nome"));
                objfuncionariodto.setData(rs.getString("Data"));
                objfuncionariodto.setValor(rs.getString("Valor"));
                
                Pagar.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PagarDAO Pesquisar: " + erro);
        }
        return Pagar;

    }
public void excluir(PagarDTO objrevisãodto){
       String sql= "DELETE FROM pagar where Nome = ?";
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
 public void alterar(PagarDTO objfuncionariodto) {
        String sql = "Update  pagar set Nome = ? ,Data = ?,Valor = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getNome());
            pstm.setString(2, objfuncionariodto.getData());

            pstm.setString(3, objfuncionariodto.getValor());
          
            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alterado");

        } catch (Exception erro) {
        }
    }
}
