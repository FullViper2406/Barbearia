/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import DAO.EquipamentoDAO;
import DTO.EquipamentoDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class AlterarE extends javax.swing.JFrame {

    /**
     * Creates new form AlterarE
     */
    public AlterarE() {
        initComponents();
   //centralizar a tela
                setLocationRelativeTo(null);
    }
// variáveis 
String Equipamento,Id,Fornecedor,Funcionario;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jEquipamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jFornecedor = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Equipamento");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 29, -1, -1));
        getContentPane().add(jEquipamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 57, -1, -1));
        getContentPane().add(jId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel3.setText("Fornecedor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 85, -1, -1));
        getContentPane().add(jFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jButton3.setBackground(new java.awt.Color(209, 79, 245));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jButton4.setBackground(new java.awt.Color(209, 79, 245));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        jButton1.setBackground(new java.awt.Color(209, 79, 245));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 630, -1, -1));

        jLabel4.setText("Funcionario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        getContentPane().add(jFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 180, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Alterar equipamento
        Equipamento = (jEquipamento.getText());

        Id = jId.getText();

        Fornecedor = jFornecedor.getText();
                Funcionario = jFuncionario.getText();


        EquipamentoDTO objalunodto = new EquipamentoDTO();
        objalunodto.setEquipamento(Equipamento);

        objalunodto.setId(Id);

        objalunodto.setFornecedor(Fornecedor);
                objalunodto.setFuncionario(Funcionario);

        //mensagem pra campos vazios
        if(jEquipamento.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jId.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jFornecedor.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
 if(jFuncionario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

       EquipamentoDTO objfuncionariodto = new EquipamentoDTO();
        objfuncionariodto.setEquipamento(Equipamento);
        objfuncionariodto.setId(Id);
                       objfuncionariodto.setFornecedor(Fornecedor);
                       objfuncionariodto.setFuncionario(Funcionario);



        EquipamentoDAO objfuncionariodao = new EquipamentoDAO();
        objfuncionariodao.alterar(objfuncionariodto);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //voltar pra tela principal
        new Principal() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //sair do sistema
        System.exit(0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jEquipamento;
    private javax.swing.JTextField jFornecedor;
    private javax.swing.JTextField jFuncionario;
    private javax.swing.JTextField jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
