/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;
import DAO.FornecedorDAO;
import DTO.FornecedorDTO;
import javax.swing.JOptionPane;
/**
 *
 * @author breno
 */
public class AlterarForn extends javax.swing.JFrame {
    //Variáveis
String Nome,Endereco,Contato;

    /**
     * Creates new form AlterarForn
     */
    public AlterarForn() {
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

        jButton4 = new javax.swing.JButton();
        jNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jEndereco = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jContato1 = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setBackground(new java.awt.Color(209, 79, 245));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, -1, -1));

        jNome.setBackground(new java.awt.Color(209, 79, 245));
        jNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jNome.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(209, 79, 245));
        jLabel2.setText("Nome");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(209, 79, 245));
        jLabel7.setText("Endereço");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jEndereco.setBackground(new java.awt.Color(209, 79, 245));
        jEndereco.setForeground(new java.awt.Color(255, 255, 255));
        jEndereco.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 250, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(209, 79, 245));
        jLabel6.setText("Contato");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        jContato1.setBackground(new java.awt.Color(209, 79, 245));
        jContato1.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jContato1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jContato1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jContato1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContato1ActionPerformed(evt);
            }
        });
        getContentPane().add(jContato1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 200, -1));

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //voltar pra tela principal
        new Principal() .setVisible(true);

        this.dispose();// TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jContato1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContato1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jContato1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Alterar Fornecedor
        Nome = (jNome.getText());
        Endereco = jEndereco.getText();

        Contato = jContato1.getText();

        
        //mensagem pra campos vazios
        if(jNome.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jContato1.getText().equals("(  )     -    ")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }

        if(jEndereco.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Campo  obrigatório,o preencha por favor !!","Aviso",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        FornecedorDTO objfuncionariodto = new FornecedorDTO();
        objfuncionariodto.setNome(Nome);
                objfuncionariodto.setEndereco(Endereco);

        objfuncionariodto.setContato(Contato);


        FornecedorDAO objfuncionariodao = new FornecedorDAO();
        objfuncionariodao.alterar(objfuncionariodto);
    }//GEN-LAST:event_jButton3ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JFormattedTextField jContato1;
    private javax.swing.JFormattedTextField jEndereco;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNome;
    // End of variables declaration//GEN-END:variables
}
