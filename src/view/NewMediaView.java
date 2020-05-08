/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Media;
import controller.MediaRegister;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcelo
 */
public class NewMediaView extends javax.swing.JFrame {
     private Media media = new Media();
     private NewMediaView mediaDetails;
   // private final RentProcessView clientDetails;
     
    // here is going to bring all clients details to the rent page:
    public void setMedia(Media media){
        this.media = media;
        jTextTitle.setText(media.getTitle());
        //jTextDirector.setText(media.getDirector());
        //jTextBand.setText(media.getBand());
        //jTextStudio.setText(media.getStudio());
        jTextYear.setText(String.valueOf(media.getYearOfRelease()));
        jTextPrice.setText(String.valueOf(media.getPrice()));
        
        /*int opMembership = media.getMediaFormat().getBytes();
        switch(opMembership){
            //edit page
            case 1: // Dvd
                jRadioBDvd.setSelected(true);
            break;
            
            case 2: // Cd
            jRadioBCd.setSelected(true);
            break;
             
            case 3: //Blueray
                jRadioBBlueray.setSelected(true);
            break;
                
        }
        */
        jTextidMedia.setVisible(true);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(true);
        jTextidMedia.setText(media.getIdMedia());
        
    }
    /**
     * Creates new form RentProcessView
     */
    public NewMediaView(NewMediaView mediaDetails) {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        initComponents();
        jTextidMedia.setVisible(true);
        jTextidMedia.setEditable(false);
        jLidMedia.setVisible(true);
        
       this.mediaDetails = mediaDetails;
    }
    /**
     * Creates new form MediaItens
     */
    public NewMediaView() {
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

        jSeparator2 = new javax.swing.JSeparator();
        buttonGroupMediaF = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLidMedia = new javax.swing.JLabel();
        jTextidMedia = new javax.swing.JTextField();
        jLTitle = new javax.swing.JLabel();
        jLYear = new javax.swing.JLabel();
        jLMediaF = new javax.swing.JLabel();
        jTextTitle = new javax.swing.JTextField();
        jTextYear = new javax.swing.JTextField();
        jLPrice = new javax.swing.JLabel();
        jTextPrice = new javax.swing.JTextField();
        jLDirector = new javax.swing.JLabel();
        jTextDirector = new javax.swing.JTextField();
        jLBand = new javax.swing.JLabel();
        jTextBand = new javax.swing.JTextField();
        jLStudio = new javax.swing.JLabel();
        jTextStudio = new javax.swing.JTextField();
        jLDescription = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLAvailability = new javax.swing.JLabel();
        jTextAvailability = new javax.swing.JTextField();
        jBSave = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jRadioBDvd = new javax.swing.JRadioButton();
        jRadioBCd = new javax.swing.JRadioButton();
        jRadioBBlueray = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jRadioBMusic = new javax.swing.JRadioButton();
        jRadioBTv = new javax.swing.JRadioButton();
        jRadioBLives = new javax.swing.JRadioButton();
        jRadioBBoxSet = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("*** Ultra-Vision Media ***");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("NEW MEDIA"));

        jLidMedia.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLidMedia.setText("ID Media: ");

        jTextidMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextidMediaActionPerformed(evt);
            }
        });

        jLTitle.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLTitle.setText("Title: ");

        jLYear.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLYear.setText("Year of Release:");

        jLMediaF.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLMediaF.setText("Media Format:");

        jLPrice.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLPrice.setText("Price:");

        jTextPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPriceActionPerformed(evt);
            }
        });

        jLDirector.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLDirector.setText("Director:");

        jLBand.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLBand.setText("Band: ");

        jTextBand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBandActionPerformed(evt);
            }
        });

        jLStudio.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLStudio.setText("Studio: ");

        jLDescription.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLDescription.setText("Description:");

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        jLAvailability.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLAvailability.setText("Availability:");

        jBSave.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jBSave.setText("Save");
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonGroupMediaF.add(jRadioBDvd);
        jRadioBDvd.setText("DVD");

        buttonGroupMediaF.add(jRadioBCd);
        jRadioBCd.setText("CD");

        buttonGroupMediaF.add(jRadioBBlueray);
        jRadioBBlueray.setText("BLUERAY");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLabel1.setText("Titles:");

        jRadioBMusic.setText("Music");
        jRadioBMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBMusicActionPerformed(evt);
            }
        });

        jRadioBTv.setText("TV");

        jRadioBLives.setText("Live");

        jRadioBBoxSet.setText("BoxSet");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLDirector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                                            .addComponent(jLBand, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(6, 6, 6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(jTextDirector)
                                    .addComponent(jTextBand)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLYear)
                                    .addComponent(jLStudio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextStudio)
                                    .addComponent(jTextYear)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLMediaF)
                                        .addGap(196, 196, 196)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLidMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextidMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioBMusic)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioBTv)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioBLives)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioBBoxSet))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioBDvd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioBCd)
                                        .addGap(16, 16, 16)
                                        .addComponent(jRadioBBlueray)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2)
                            .addGap(37, 37, 37)
                            .addComponent(jBSave))
                        .addComponent(jLDescription)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLAvailability))
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextPrice)
                                .addComponent(jTextAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLidMedia)
                                    .addComponent(jTextidMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLTitle)
                                    .addComponent(jTextTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLDirector)
                                    .addComponent(jTextDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLBand)
                                    .addComponent(jTextBand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLStudio)
                                    .addComponent(jTextStudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLYear)
                                    .addComponent(jTextYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLMediaF)
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioBDvd)
                                    .addComponent(jRadioBCd)
                                    .addComponent(jRadioBBlueray))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jRadioBMusic)
                                    .addComponent(jRadioBTv)
                                    .addComponent(jRadioBLives)
                                    .addComponent(jRadioBBoxSet)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLPrice)
                            .addComponent(jTextPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jBSave))))
                .addContainerGap())
        );

        jMenu1.setText("Home");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextidMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextidMediaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextidMediaActionPerformed

    private void jTextPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPriceActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        // TODO add your handling code here:
        //Here is gonna save the medias details
        
        media.setTitle(jTextTitle.getText());
        //media.setDirector(jTextDirector.getText());
        //media.setBand(jTextBand.getText());
        //media.setStudio(jTextStudio.getText());
       // media.setYearOfRelease(jTextYear.getText());
        //media.setMediaFormat(buttonGroupMediaF.getSelection());
        //media.setPrice(jTextPrice.getText());
        
          //goupButton code:
          /*MediaFormat mediaF = new MediaFormat();
          mediaF.setPlanType(p);
          
        if ( jRadioBML.isSelected()) { 
            p.setIdPlan(1);
        }else if (jRadioBVL.isSelected()) {
            p.setIdPlan(3);
        }else if (jRadioBTv.isSelected()) {
            p.setIdPlan(2);
        }else if (jRadioBPr.isSelected()) {
            p.setIdPlan(4);
            
        }else{
            JOptionPane.showMessageDialog(this, "Select a plan");
        }
        if (p.getIdPlan()!= 0) {
            String msg = "Client was registed";
            boolean sucess = false;
            if (client.getIdMembership() == null) {
                sucess = ClientDAO.insert(client);
            }else{
                 sucess = ClientDAO.update(client);
                 msg = "Client was updated";
            }
            
            if (sucess) {
                JOptionPane.showMessageDialog(this, msg);
                
                if (clientList != null) {
                   clientList.createClientList();
                }
                dispose();
                
            }else{
                JOptionPane.showMessageDialog(this, "Error in register a client");
            }
               
        }
        
        */
    }//GEN-LAST:event_jBSaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextBandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextBandActionPerformed

    private void jRadioBMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBMusicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBMusicActionPerformed

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
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMediaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMediaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupMediaF;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLAvailability;
    private javax.swing.JLabel jLBand;
    private javax.swing.JLabel jLDescription;
    private javax.swing.JLabel jLDirector;
    private javax.swing.JLabel jLMediaF;
    private javax.swing.JLabel jLPrice;
    private javax.swing.JLabel jLStudio;
    private javax.swing.JLabel jLTitle;
    private javax.swing.JLabel jLYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLidMedia;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioBBlueray;
    private javax.swing.JRadioButton jRadioBBoxSet;
    private javax.swing.JRadioButton jRadioBCd;
    private javax.swing.JRadioButton jRadioBDvd;
    private javax.swing.JRadioButton jRadioBLives;
    private javax.swing.JRadioButton jRadioBMusic;
    private javax.swing.JRadioButton jRadioBTv;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextAvailability;
    private javax.swing.JTextField jTextBand;
    private javax.swing.JTextField jTextDirector;
    private javax.swing.JTextField jTextPrice;
    private javax.swing.JTextField jTextStudio;
    private javax.swing.JTextField jTextTitle;
    private javax.swing.JTextField jTextYear;
    private javax.swing.JTextField jTextidMedia;
    // End of variables declaration//GEN-END:variables
}
