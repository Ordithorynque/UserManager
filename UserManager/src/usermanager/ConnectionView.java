/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanager;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Formation
 */
public class ConnectionView extends javax.swing.JFrame {

    /**
     * Creates new form ConnectionView
     */
       HashMap<String, String> comptes = new HashMap<String, String>();
    
    public ConnectionView() {
        initComponents();
        
                
        comptes.put("admin","admin1234");
        comptes.put("paul", "paul");
        comptes.put("patrick", "patrick");

    }
    
    public String getIdentifiant(){
    
        return this.tf_Identifiant.getText();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPaneConnection = new javax.swing.JPanel();
        tf_Identifiant = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        pf_Password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        pb_Valider = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_Identifiant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_IdentifiantActionPerformed(evt);
            }
        });

        jLabel1.setText("Identifiant");

        jLabel2.setText("Password");

        pb_Valider.setText("Valider");
        pb_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_ValiderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPaneConnectionLayout = new javax.swing.GroupLayout(jPaneConnection);
        jPaneConnection.setLayout(jPaneConnectionLayout);
        jPaneConnectionLayout.setHorizontalGroup(
            jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneConnectionLayout.createSequentialGroup()
                .addGroup(jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneConnectionLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pf_Password)
                            .addComponent(tf_Identifiant, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(jPaneConnectionLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(pb_Valider)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPaneConnectionLayout.setVerticalGroup(
            jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneConnectionLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_Identifiant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addGroup(jPaneConnectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pf_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(pb_Valider)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneConnection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPaneConnection, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_IdentifiantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_IdentifiantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_IdentifiantActionPerformed

    private void pb_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_ValiderActionPerformed
String ID = comptes.get(tf_Identifiant.getText());

if (ID == null){

    JOptionPane.showMessageDialog(this, "Nom d'utilisateur inconnu", "ERREUR LOGIN", JOptionPane.WARNING_MESSAGE);
}

else if (pf_Password.getText().equals(comptes.get(tf_Identifiant.getText()))){

         //  JOptionPane.showMessageDialog(this,"blah", "CONNECTÉ", JOptionPane.INFORMATION_MESSAGE);

         Utilisateurs vueUtilisateur = new Utilisateurs();
         
        this.dispose();
        vueUtilisateur.setLocationRelativeTo(null);
        
        vueUtilisateur.setVisible(true);

}
        
        else {
        
               JOptionPane.showMessageDialog(this, "Le mot de passe est incorrect", "ERREUR PASSWORD", JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_pb_ValiderActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConnectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConnectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConnectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConnectionView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConnectionView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPaneConnection;
    private javax.swing.JButton pb_Valider;
    private javax.swing.JPasswordField pf_Password;
    private javax.swing.JTextField tf_Identifiant;
    // End of variables declaration//GEN-END:variables


}
