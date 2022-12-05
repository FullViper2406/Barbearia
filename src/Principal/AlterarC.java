/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import DAO.ClienteDAO;
import DTO.ClienteDTO;
import javax.swing.JOptionPane;

/**
 *
 * @author breno
 */
public class AlterarC extends javax.swing.JFrame {

    /**
     * Creates new form AlterarC
     */
    public AlterarC() {
        initComponents();
         //centralizar a tela
                setLocationRelativeTo(null);
    }
// variáveis 
String Nome,Contato,Horario,Data;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jContato1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jHorario = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jData1 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(209, 79, 245));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jNome.setBackground(new java.awt.Color(209, 79, 245));
        jNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 240, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 79, 245));
        jLabel6.setText("Contato");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jContato1.setBackground(new java.awt.Color(209, 79, 245));
        jContato1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jContato1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, -1));

        jLabel1.setText("Horário");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        try {
            jHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 70, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(209, 79, 245));
        jLabel10.setText("Data");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jData1.setBackground(new java.awt.Color(209, 79, 245));
        jData1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jData1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jData1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 160, -1));

        jButton3.setBackground(new java.awt.Color(209, 79, 245));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Alterar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Alterar Cliente
        Nome = (jNome.getText());

        Contato = jContato1.getText();

        Horario = jHorario.getText();
                Data = jData1.getText();


      
        //mensagem pra campos vazios
        if(jNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jContato1.getText().equals("(  )     -    ")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jData1.getText().equals("    -  -  ")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(jHorario.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
ClienteDTO objfuncionariodto = new ClienteDTO();
        objfuncionariodto.setNome(Nome);
        objfuncionariodto.setContato(Contato);
                       objfuncionariodto.setHorario(Horario);

        objfuncionariodto.setData(Data);


        ClienteDAO objfuncionariodao = new ClienteDAO();
        objfuncionariodao.alterar(objfuncionariodto);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //sair do sistema
        System.exit(0);        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //voltar pra tela principal
        new Principal() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jContato1;
    private javax.swing.JFormattedTextField jData1;
    private javax.swing.JFormattedTextField jHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNome;
    // End of variables declaration//GEN-END:variables
}