package view;

import javax.swing.JFrame;

/**
 *
 * @author Priscila
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBGotoClientR = new javax.swing.JButton();
        jBGotoMediaR = new javax.swing.JButton();
        jBGtoSetMedia = new javax.swing.JButton();
        jBGotoSetClient = new javax.swing.JButton();
        jBClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("*** Ultra-Vision Shop ***");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ULTRA-VISION RENTAL MEDIA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18), new java.awt.Color(102, 0, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBGotoClientR.setText("New Client");
        jBGotoClientR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGotoClientRActionPerformed(evt);
            }
        });
        jPanel1.add(jBGotoClientR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 107, -1));

        jBGotoMediaR.setText("New Media");
        jBGotoMediaR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGotoMediaRActionPerformed(evt);
            }
        });
        jPanel1.add(jBGotoMediaR, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 107, -1));

        jBGtoSetMedia.setText("Setting Media");
        jBGtoSetMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGtoSetMediaActionPerformed(evt);
            }
        });
        jPanel1.add(jBGtoSetMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 107, -1));

        jBGotoSetClient.setText("Setting Clients");
        jBGotoSetClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGotoSetClientActionPerformed(evt);
            }
        });
        jPanel1.add(jBGotoSetClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 107, -1));

        jBClose.setText("Close");
        jBClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCloseActionPerformed(evt);
            }
        });
        jPanel1.add(jBClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/MainView.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 610, 406));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBGtoSetMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGtoSetMediaActionPerformed
        // TODO add your handling code here:
        
        //*** Sent to set media page ****
        MediaListView mediaList = new MediaListView();
        mediaList.setVisible(true);

    }//GEN-LAST:event_jBGtoSetMediaActionPerformed

    private void jBGotoSetClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGotoSetClientActionPerformed
        // TODO add your handling code here:
        
        // **** Sent to clientList page ****
        ClientsListView registerPage = new ClientsListView();
        registerPage.setVisible(true);
    }//GEN-LAST:event_jBGotoSetClientActionPerformed

    private void jBGotoClientRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGotoClientRActionPerformed
        // TODO add your handling code here:
        
        // **** Sent to the Register Client page ****
        RegisterClientView registerPage = new RegisterClientView(null);
        registerPage.setVisible(true);
    }//GEN-LAST:event_jBGotoClientRActionPerformed

    private void jBGotoMediaRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGotoMediaRActionPerformed
        // TODO add your handling code here:
        
        //**** Sent to new media page ****
        NewMediaView media = new NewMediaView();
        media.setVisible(true);
    }//GEN-LAST:event_jBGotoMediaRActionPerformed

    private void jBCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCloseActionPerformed
        // TODO add your handling code here:
        
        // *** Close the register client window without close the program.
        dispose();
    }//GEN-LAST:event_jBCloseActionPerformed

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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBClose;
    private javax.swing.JButton jBGotoClientR;
    private javax.swing.JButton jBGotoMediaR;
    private javax.swing.JButton jBGotoSetClient;
    private javax.swing.JButton jBGtoSetMedia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

// *** REFERENCES: ***
/* Linguagem Tecnic de Programação - Marcelo Santos.
Portal Ceilanda, cursos. https://marcelo.portalceilandia.com.br/site/ltp1/*/
