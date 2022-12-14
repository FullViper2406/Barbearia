/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.EquipamentoDTO;
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
public class EquipamentoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<EquipamentoDTO> Equipamento = new ArrayList<>();

    public void cadastar(EquipamentoDTO objfuncionariodto) {
        String sql = "insert into equipamento (Id,Equipamento,Fornecedor,Funcionario) values(?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
                        pstm.setString(1, objfuncionariodto.getId());

            pstm.setString(2,objfuncionariodto.getEquipamento());

            pstm.setString(3, objfuncionariodto.getFornecedor());
                        pstm.setString(4, objfuncionariodto.getFuncionario());

            

            pstm.execute();
            pstm.close();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !!");

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cadastro inválido !!");
        }
    }

    public ArrayList<EquipamentoDTO> PesquisarEquipamento() {
        String sql = "select * from equipamento";
        conn = new ConexaoDAO().conectaBD();

        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                EquipamentoDTO objfuncionariodto = new EquipamentoDTO();
                objfuncionariodto.setId(rs.getString("Id"));
                                objfuncionariodto.setEquipamento(rs.getString("Equipamento"));

                objfuncionariodto.setFornecedor(rs.getString("Fornecedor"));
                                objfuncionariodto.setFuncionario(rs.getString("Funcionario"));

                
                Equipamento.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EquipamentoDAO Pesquisar: " + erro);
        }
        return Equipamento;

    }
public void excluir(EquipamentoDTO objrevisãodto){
       String sql= "DELETE FROM equipamento where Id = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getId());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
        }     
}
 public void alterar(EquipamentoDTO objfuncionariodto) {
        String sql = "Update  equipamento set  Equipamento = ? ,where Id = ?,Fornecedor= ?,Funcionario = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getId());
            pstm.setString(2, objfuncionariodto.getEquipamento());

            pstm.setString(3, objfuncionariodto.getFornecedor());
                        pstm.setString(4, objfuncionariodto.getFuncionario());

          
            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alterado");

        } catch (Exception erro) {
        }
    }
}
