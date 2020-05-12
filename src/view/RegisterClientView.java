/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ClientDAO;
import javax.swing.JOptionPane;
import controller.ClientsRegister;
import Model.PlanType;
import javax.mail.internet.InternetAddress;

/**
 *
 * @author Priscila
 */
public class RegisterClientView extends javax.swing.JFrame {

    private ClientsRegister client = new ClientsRegister();

    // *** Here is going to bring all the clients details to edit page:
    private ClientsListView clientList;

    public void setClient(ClientsRegister client) {
        this.client = client;
        jTextName.setText(client.getName());
        jTextEmail.setText(client.getEmail());
        jTextBankname.setText(client.getBankName());
        jTextCard.setText(String.valueOf(client.getBankCard()));
        jTexBalance.setText(String.valueOf(client.getBalance()));
        jTextBonus.setText(String.valueOf(client.getBonus()));
        jTextStatus.setText(client.getPlanStatus());
        jTextAreaNotes.setText(client.getNotes());

        /* *** Here is a statement of comparation. It is going to check the plan type
        of the client and bring to the edit page. *** */
        int opMembership = client.getPlanType().getIdPlan();
        switch (opMembership) {
            //edit page
            case 1: // music lovers
                jRadioBML.setSelected(true);
                break;

            case 2: //tv lovers
                jRadioBTv.setSelected(true);
                break;

            case 3: //video lovers
                jRadioBVL.setSelected(true);
                break;

            case 4: // premium
                jRadioBPr.setSelected(true);

                break;
        }
        // *** Here is going to block the id field to be editable. ***
        jTextId.setVisible(true);
        jLId.setVisible(true);
        jTextId.setEditable(false);

        jTextId.setText(client.getIdMembership());
        jBSave.setText("update");
    }

    /**
     * Creates new form RegisterClient
     */
    public RegisterClientView(ClientsListView clientList) {
        initComponents();
        // *** Here is going to hide the id field on the RegisterClientView. ***
        jTextId.setVisible(false);
        jTextId.setEditable(false);
        jLId.setVisible(false);

        this.clientList = clientList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        BGroupPlan = new javax.swing.ButtonGroup();
        jPanelRegister = new javax.swing.JPanel();
        jLId = new javax.swing.JLabel();
        jTextId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLEmail = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLBankname = new javax.swing.JLabel();
        jLIban = new javax.swing.JLabel();
        jTextBankname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jBSave = new javax.swing.JButton();
        jLPlan = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLStatus = new javax.swing.JLabel();
        jTextStatus = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLBalance = new javax.swing.JLabel();
        jLBonus = new javax.swing.JLabel();
        jTexBalance = new javax.swing.JTextField();
        jTextBonus = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jRadioBVL = new javax.swing.JRadioButton();
        jRadioBML = new javax.swing.JRadioButton();
        jRadioBTv = new javax.swing.JRadioButton();
        jRadioBPr = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jTextCard = new javax.swing.JFormattedTextField();

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar2.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelRegister.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTS"));
        jPanelRegister.setToolTipText("NEW CLIENT");
        jPanelRegister.setPreferredSize(new java.awt.Dimension(700, 500));

        jLId.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jLId.setText("IDMembership: ");

        jTextId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel1.setText("Name: ");

        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jLEmail.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLEmail.setText("E-mail:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Bank Account Details: ");

        jLBankname.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLBankname.setText("Bank Name: ");

        jLIban.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLIban.setText("BankCard:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Personal Details:");

        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setRows(5);
        jScrollPane1.setViewportView(jTextAreaNotes);

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Notes:");

        jBSave.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jBSave.setText("Register");
        jBSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSaveMouseClicked(evt);
            }
        });
        jBSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSaveActionPerformed(evt);
            }
        });

        jLPlan.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLPlan.setText("Plan Details:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("PlanType: ");

        jLStatus.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLStatus.setText("PlanStatus:");

        jLBalance.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLBalance.setText("Balance: ");

        jLBonus.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLBonus.setText("Bonus:");

        jTexBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTexBalanceActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        BGroupPlan.add(jRadioBVL);
        jRadioBVL.setText("Video Lovers");

        BGroupPlan.add(jRadioBML);
        jRadioBML.setText("Music Lovers");

        BGroupPlan.add(jRadioBTv);
        jRadioBTv.setText("TV Lovers");
        jRadioBTv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioBTvActionPerformed(evt);
            }
        });

        BGroupPlan.add(jRadioBPr);
        jRadioBPr.setText("Premium");

        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            jTextCard.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### #### ####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jTextCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRegisterLayout = new javax.swing.GroupLayout(jPanelRegister);
        jPanelRegister.setLayout(jPanelRegisterLayout);
        jPanelRegisterLayout.setHorizontalGroup(
            jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                            .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextName, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                                .addComponent(jTextEmail)))
                                        .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                            .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLIban, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLBankname, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextBankname, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                                                .addComponent(jTextCard, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)))
                                        .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                            .addComponent(jLId)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3))
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRegisterLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jButton2))
                                    .addComponent(jBSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLPlan)
                            .addComponent(jLabel5)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioBPr)
                                    .addComponent(jRadioBML))
                                .addGap(4, 4, 4)
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioBVL)
                                    .addComponent(jRadioBTv))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addComponent(jLBonus)
                                .addGap(18, 18, 18)
                                .addComponent(jTextBonus, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addComponent(jLBalance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTexBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(126, 126, 126)))
                .addContainerGap())
        );
        jPanelRegisterLayout.setVerticalGroup(
            jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRegisterLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLId)
                                    .addComponent(jTextId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEmail)
                            .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(25, 25, 25)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBankname)
                            .addComponent(jTextBankname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIban)
                    .addComponent(jBSave)
                    .addComponent(jTextCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addComponent(jLPlan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioBVL)
                            .addComponent(jRadioBPr))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioBML)
                            .addComponent(jRadioBTv)))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addComponent(jLStatus)
                        .addGap(18, 18, 18)
                        .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelRegisterLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLBonus)
                            .addComponent(jTextBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLBalance)
                        .addComponent(jTexBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 684, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIdActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextIdActionPerformed

    private void jBSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jBSaveMouseClicked

    private void jTexBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTexBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTexBalanceActionPerformed

    private void jBSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSaveActionPerformed
        // TODO add your handling code here:

        //Here is gonna save the clients details
        client.setName(jTextName.getText());
        try {
            InternetAddress emailAddr = new InternetAddress(jTextEmail.getText());
            emailAddr.validate();
            client.setEmail(jTextEmail.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "E-mail not valid");
            return;
        }
        client.setBankName(jTextBankname.getText());
        //client.setBankCard(Integer.parseInt(jTextCard.getText()));
        //client.setPlanType(jRadioBTvActionPerformed().getText());
        client.setPlanStatus(jTextStatus.getText());
        client.setBalance(Float.parseFloat(jTexBalance.getText()));
        client.setBonus(Integer.parseInt(jTextBonus.getText()));
        client.setNotes(jTextAreaNotes.getText());

        //goupButton code:
        PlanType p = new PlanType();
        client.setPlanType(p);

        if (jRadioBML.isSelected()) {
            p.setIdPlan(1);
        } else if (jRadioBVL.isSelected()) {
            p.setIdPlan(3);
        } else if (jRadioBTv.isSelected()) {
            p.setIdPlan(2);
        } else if (jRadioBPr.isSelected()) {
            p.setIdPlan(4);

        } else {
            JOptionPane.showMessageDialog(this, "Select a plan");
        }
        if (p.getIdPlan() != 0) {
            String msg = "Client was registed";
            boolean sucess = false;
            if (client.getIdMembership() == null) {
                sucess = ClientDAO.insert(client);
            } else {
                sucess = ClientDAO.update(client);
                msg = "Client was updated";
            }

            if (sucess) {
                JOptionPane.showMessageDialog(this, msg);

                if (clientList != null) {
                    clientList.createClientList();
                }
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Error in register a client");
            }

        }

    }//GEN-LAST:event_jBSaveActionPerformed

    private void jRadioBTvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioBTvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioBTvActionPerformed

    private void jTextCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCardActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        // *** Close the register client window without close the program.
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterClientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterClientView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGroupPlan;
    private javax.swing.JButton jBSave;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLBalance;
    private javax.swing.JLabel jLBankname;
    private javax.swing.JLabel jLBonus;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLIban;
    private javax.swing.JLabel jLId;
    private javax.swing.JLabel jLPlan;
    private javax.swing.JLabel jLStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanelRegister;
    private javax.swing.JRadioButton jRadioBML;
    private javax.swing.JRadioButton jRadioBPr;
    private javax.swing.JRadioButton jRadioBTv;
    private javax.swing.JRadioButton jRadioBVL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTexBalance;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextBankname;
    private javax.swing.JTextField jTextBonus;
    private javax.swing.JFormattedTextField jTextCard;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextId;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextStatus;
    // End of variables declaration//GEN-END:variables
}
