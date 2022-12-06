/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import DAO.PrecoDAO;
import DTO.PrecoDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author breno
 */
public class CadastrarP extends javax.swing.JFrame {
//variáveis
    private String Cabelo,Barba,Sobrancelha;
    /**
     * Creates new form CadastrarP
     */
    public CadastrarP() {
        //variáveis
        initComponents();
        //centralizar a tela
                setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCabelo = new javax.swing.JFormattedTextField();
        jBarba = new javax.swing.JFormattedTextField();
        jSobrancelha = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cabelo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel2.setText("Barba");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setText("Sobrancelha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

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

        jButton3.setBackground(new java.awt.Color(209, 79, 245));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Cadastrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        try {
            jCabelo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jCabelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        try {
            jBarba.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jBarba, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        try {
            jSobrancelha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##,##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jSobrancelha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //voltar pra tela principal
        new Principal() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Cadastrar Preço
        Cabelo = jCabelo.getText();

        Barba = jBarba.getText();

         Sobrancelha= jSobrancelha.getText();

        PrecoDTO objalunodto = new PrecoDTO();
        objalunodto.setCabelo(Cabelo);

        objalunodto.setBarba(Barba);

        objalunodto.setSobrancelha(Sobrancelha);
        //mensagem pra campos vazios
        if(jCabelo.getText().equals("  ,  ")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jBarba.getText().equals("  ,  ")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jSobrancelha.getText().equals("  ,  ")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }


        PrecoDAO objalunodao = new PrecoDAO();
        objalunodao.cadastar(objalunodto);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jBarba;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jCabelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField jSobrancelha;
    // End of variables declaration//GEN-END:variables
}
