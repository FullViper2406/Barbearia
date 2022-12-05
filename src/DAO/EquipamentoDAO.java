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
        String sql = "insert into equipamento (Equipamento,Id,Fornecedor,Funcionario) values(?,?,?,?)";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getEquipamento());
            pstm.setString(2, objfuncionariodto.getId());

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
                objfuncionariodto.setEquipamento(rs.getString("Equipamento"));
                objfuncionariodto.setId(rs.getString("Id"));
                objfuncionariodto.setFornecedor(rs.getString("Fornecedor"));
                                objfuncionariodto.setFornecedor(rs.getString("Funcionario"));

                
                Equipamento.add(objfuncionariodto);
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "EquipamentoDAO Pesquisar: " + erro);
        }
        return Equipamento;

    }
public void excluir(EquipamentoDTO objrevisãodto){
       String sql= "DELETE FROM equipamento where Equipamento = ?";
           conn= new ConexaoDAO().conectaBD();
           try{
       pstm= conn.prepareStatement(sql);
       pstm.setString(1,objrevisãodto.getEquipamento());
                            pstm.execute();
                            pstm.close();



     JOptionPane.showMessageDialog(null, "Deletado");

        } catch (Exception erro) {
        }     
}
 public void alterar(EquipamentoDTO objfuncionariodto) {
        String sql = "Update  equipamento set where Equipamento = ? ,Id = ?,Fornecedor= ?,Funcionario = ?";
        conn = new ConexaoDAO().conectaBD();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objfuncionariodto.getEquipamento());
            pstm.setString(2, objfuncionariodto.getId());

            pstm.setString(3, objfuncionariodto.getFornecedor());
                        pstm.setString(3, objfuncionariodto.getFuncionario());

          
            pstm.execute();
            pstm.close();

            JOptionPane.showMessageDialog(null, "Alterado");

        } catch (Exception erro) {
        }
    }
}
