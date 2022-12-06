/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import DAO.PagarDAO;
import DTO.PagarDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author breno
 */
public class Dadosp extends javax.swing.JFrame {

    /**
     * Creates new form Dadosp
     */
    public Dadosp() {
        initComponents();
    //centralizar a tela
                setLocationRelativeTo(null);
    }
    //variável

    private String nome;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDadosf = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(new java.awt.Color(209, 79, 245));
        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Carregar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        jDadosf.setBackground(new java.awt.Color(209, 79, 245));
        jDadosf.setForeground(new java.awt.Color(255, 255, 255));
        jDadosf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Data", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jDadosf);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 900, 330));

        jButton3.setBackground(new java.awt.Color(209, 79, 245));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // carregar dados na tabela
        try {
            PagarDAO objfuncionariodao = new PagarDAO();
            DefaultTableModel model = (DefaultTableModel) jDadosf.getModel();
            model.setNumRows(0);
            ArrayList<PagarDTO> Aluno = objfuncionariodao.PesquisarPagar();
            for (int num = 0; num < Aluno.size(); num++) {
                model.addRow(new String[]{
                    Aluno.get(num).getNome(),
                    Aluno.get(num).getData(),
                    Aluno.get(num).getValor(),
                });

            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW: " + erro);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //voltar pra tela principal
        new Principal() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JTable jDadosf;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
