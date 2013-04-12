/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import GatewayMapper.Controller;
import GatewayMapper.ControllerInterface;
import javax.swing.DefaultListModel;

/**
 *
 * @author Aaron
 */
public class GUI extends javax.swing.JFrame {

    ControllerInterface con = new Controller();
    DefaultListModel model1, model2;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
        MainPanel.setVisible(true);
        CustomerPanel.setVisible(false);
        ProductPanel.setVisible(false);
        OrderPanel.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        CustomerMenuButton = new javax.swing.JButton();
        ProductMenuButton = new javax.swing.JButton();
        OrderMenuButton = new javax.swing.JButton();
        MainMenuLabel = new javax.swing.JLabel();
        CustomerPanel = new javax.swing.JPanel();
        CustomerMenuLabel = new javax.swing.JLabel();
        CutomerIDLabel = new javax.swing.JLabel();
        CustomerIDField = new javax.swing.JTextField();
        CustomerNameLabel = new javax.swing.JLabel();
        CustomerNameField = new javax.swing.JTextField();
        CustomerAddressLabel = new javax.swing.JLabel();
        CustomerAddressField = new javax.swing.JTextField();
        CustomerEmailLabel = new javax.swing.JLabel();
        CustomerEmailField = new javax.swing.JTextField();
        CustPhoneLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustPhoneTextArea = new javax.swing.JTextArea();
        AddCustomerButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CustomerJList = new javax.swing.JList();
        ExistingCustLabel = new javax.swing.JLabel();
        AddEditPhoneButton = new javax.swing.JButton();
        SaveCustomerChangeButton = new javax.swing.JButton();
        GetCustomerButton = new javax.swing.JButton();
        EditCustomerButton = new javax.swing.JButton();
        DeleteCustomerbutton = new javax.swing.JButton();
        ProductPanel = new javax.swing.JPanel();
        ProductMenuLabel = new javax.swing.JLabel();
        OrderPanel = new javax.swing.JPanel();
        OrderMenuLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ExitDrop = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MainNavDrop = new javax.swing.JMenuItem();
        CustNavDrop = new javax.swing.JMenuItem();
        ProdNavDrop = new javax.swing.JMenuItem();
        OrdNavDrop = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBounds(new java.awt.Rectangle(200, 50, 950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().setLayout(null);

        CustomerMenuButton.setText("Customers");
        CustomerMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerMenuButtonActionPerformed(evt);
            }
        });

        ProductMenuButton.setText("Products");
        ProductMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductMenuButtonActionPerformed(evt);
            }
        });

        OrderMenuButton.setText("Orders");
        OrderMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderMenuButtonActionPerformed(evt);
            }
        });

        MainMenuLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        MainMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainMenuLabel.setText("Main Menu");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(MainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustomerMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(ProductMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(OrderMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(358, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(MainMenuLabel)
                .addGap(64, 64, 64)
                .addComponent(CustomerMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ProductMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OrderMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        getContentPane().add(MainPanel);
        MainPanel.setBounds(0, 0, 900, 650);

        CustomerMenuLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        CustomerMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerMenuLabel.setText("Customer Menu");

        CutomerIDLabel.setText("Customer ID");

        CustomerIDField.setEditable(false);
        CustomerIDField.setBackground(new java.awt.Color(204, 204, 255));

        CustomerNameLabel.setText("Customer Name");

        CustomerAddressLabel.setText("Customer Address");

        CustomerEmailLabel.setText("Customer Email");

        CustPhoneLabel.setText("Customer Phone Numbers");

        CustPhoneTextArea.setColumns(20);
        CustPhoneTextArea.setRows(5);
        jScrollPane1.setViewportView(CustPhoneTextArea);

        AddCustomerButton.setText("Add Customer");
        AddCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCustomerButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(CustomerJList);

        ExistingCustLabel.setText("Existing Cutomers");

        AddEditPhoneButton.setText("Add / Edit Phone Number");
        AddEditPhoneButton.setEnabled(false);

        SaveCustomerChangeButton.setText("Save Changes");
        SaveCustomerChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveCustomerChangeButtonActionPerformed(evt);
            }
        });

        GetCustomerButton.setText("Get Exisitng Customer List");
        GetCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetCustomerButtonActionPerformed(evt);
            }
        });

        EditCustomerButton.setText("Edit Selected Customer");
        EditCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditCustomerButtonActionPerformed(evt);
            }
        });

        DeleteCustomerbutton.setText("Delete Selected Customer");
        DeleteCustomerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCustomerbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(CustomerMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CustPhoneLabel)
                            .addComponent(CustomerEmailLabel)
                            .addComponent(CutomerIDLabel)
                            .addComponent(CustomerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CustomerNameLabel)
                            .addComponent(CustomerNameField)
                            .addComponent(CustomerAddressLabel)
                            .addComponent(CustomerAddressField)
                            .addComponent(CustomerEmailField)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(AddCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AddEditPhoneButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SaveCustomerChangeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(117, 117, 117)
                        .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CustomerPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(GetCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                    .addComponent(EditCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteCustomerbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(ExistingCustLabel))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(CustomerMenuLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CutomerIDLabel)
                    .addComponent(ExistingCustLabel))
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(GetCustomerButton)
                        .addGap(18, 18, 18)
                        .addComponent(EditCustomerButton)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteCustomerbutton))
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                            .addGroup(CustomerPanelLayout.createSequentialGroup()
                                .addComponent(CustomerIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerAddressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustomerEmailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CustomerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CustPhoneLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(AddCustomerButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddEditPhoneButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveCustomerChangeButton)))))
                .addContainerGap())
        );

        getContentPane().add(CustomerPanel);
        CustomerPanel.setBounds(0, 0, 900, 620);

        ProductMenuLabel.setText("Product Menu");

        javax.swing.GroupLayout ProductPanelLayout = new javax.swing.GroupLayout(ProductPanel);
        ProductPanel.setLayout(ProductPanelLayout);
        ProductPanelLayout.setHorizontalGroup(
            ProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPanelLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(ProductMenuLabel)
                .addContainerGap(198, Short.MAX_VALUE))
        );
        ProductPanelLayout.setVerticalGroup(
            ProductPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProductPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(ProductMenuLabel)
                .addContainerGap(211, Short.MAX_VALUE))
        );

        getContentPane().add(ProductPanel);
        ProductPanel.setBounds(0, 0, 400, 280);

        OrderMenuLabel.setText("Order Menu");

        javax.swing.GroupLayout OrderPanelLayout = new javax.swing.GroupLayout(OrderPanel);
        OrderPanel.setLayout(OrderPanelLayout);
        OrderPanelLayout.setHorizontalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanelLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(OrderMenuLabel)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        OrderPanelLayout.setVerticalGroup(
            OrderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(OrderMenuLabel)
                .addContainerGap(209, Short.MAX_VALUE))
        );

        getContentPane().add(OrderPanel);
        OrderPanel.setBounds(0, 0, 410, 280);

        jMenu1.setText("File");

        ExitDrop.setText("Exit");
        ExitDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitDropActionPerformed(evt);
            }
        });
        jMenu1.add(ExitDrop);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Navigation");

        MainNavDrop.setText("Main Menu");
        MainNavDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainNavDropActionPerformed(evt);
            }
        });
        jMenu2.add(MainNavDrop);

        CustNavDrop.setText("Customers");
        CustNavDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustNavDropActionPerformed(evt);
            }
        });
        jMenu2.add(CustNavDrop);

        ProdNavDrop.setText("Products");
        ProdNavDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdNavDropActionPerformed(evt);
            }
        });
        jMenu2.add(ProdNavDrop);

        OrdNavDrop.setText("Orders");
        OrdNavDrop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrdNavDropActionPerformed(evt);
            }
        });
        jMenu2.add(OrdNavDrop);

        jMenuItem1.setText("jMenuItem1");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainNavDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainNavDropActionPerformed
        MainPanel.setVisible(true);
        CustomerPanel.setVisible(false);
        ProductPanel.setVisible(false);
        OrderPanel.setVisible(false);
    }//GEN-LAST:event_MainNavDropActionPerformed

    private void ExitDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitDropActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitDropActionPerformed

    private void CustomerMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerMenuButtonActionPerformed
        MainPanel.setVisible(false);
        CustomerPanel.setVisible(true);
        ProductPanel.setVisible(false);
        OrderPanel.setVisible(false);
        
        AddCustomerButton.setEnabled(true);
        AddEditPhoneButton.setEnabled(false);
        DeleteCustomerbutton.setEnabled(false);
        EditCustomerButton.setEnabled(false);
        GetCustomerButton.setEnabled(true);
        SaveCustomerChangeButton.setEnabled(false);
    }//GEN-LAST:event_CustomerMenuButtonActionPerformed

    private void OrderMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderMenuButtonActionPerformed
        MainPanel.setVisible(false);
        CustomerPanel.setVisible(false);
        ProductPanel.setVisible(false);
        OrderPanel.setVisible(true);
    }//GEN-LAST:event_OrderMenuButtonActionPerformed

    private void CustNavDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustNavDropActionPerformed
        MainPanel.setVisible(false);
        CustomerPanel.setVisible(true);
        ProductPanel.setVisible(false);
        OrderPanel.setVisible(false);
        
        AddCustomerButton.setEnabled(true);
        AddEditPhoneButton.setEnabled(false);
        DeleteCustomerbutton.setEnabled(false);
        EditCustomerButton.setEnabled(false);
        GetCustomerButton.setEnabled(true);
        SaveCustomerChangeButton.setEnabled(false);
    }//GEN-LAST:event_CustNavDropActionPerformed

    private void OrdNavDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrdNavDropActionPerformed
        MainPanel.setVisible(false);
        CustomerPanel.setVisible(false);
        ProductPanel.setVisible(false);
        OrderPanel.setVisible(true);
    }//GEN-LAST:event_OrdNavDropActionPerformed

    private void ProductMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductMenuButtonActionPerformed
        MainPanel.setVisible(false);
        CustomerPanel.setVisible(false);
        ProductPanel.setVisible(true);
        OrderPanel.setVisible(false);
    }//GEN-LAST:event_ProductMenuButtonActionPerformed

    private void ProdNavDropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdNavDropActionPerformed
        MainPanel.setVisible(false);
        CustomerPanel.setVisible(false);
        ProductPanel.setVisible(true);
        OrderPanel.setVisible(false);
    }//GEN-LAST:event_ProdNavDropActionPerformed

    private void GetCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetCustomerButtonActionPerformed
        model1.clear();
        CustomerJList.setModel(model1);
        con.buildCustomerList();
        for (int i = 0; i < con.getListSize(); i++) {
            model1.addElement(con.getlist(i).getCustomerID() + "-" + con.getlist(i).getName());
        }
        CustomerJList.setModel(model1);

        AddCustomerButton.setEnabled(true);
        AddEditPhoneButton.setEnabled(false);
        DeleteCustomerbutton.setEnabled(false);
        EditCustomerButton.setEnabled(true);
        GetCustomerButton.setEnabled(true);
        SaveCustomerChangeButton.setEnabled(false);
    }//GEN-LAST:event_GetCustomerButtonActionPerformed

    private void EditCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditCustomerButtonActionPerformed
        CustomerIDField.setText(""+con.getlist(CustomerJList.getSelectedIndex()).getCustomerID());
        CustomerNameField.setText(con.getlist(CustomerJList.getSelectedIndex()).getName());
        CustomerAddressField.setText(con.getlist(CustomerJList.getSelectedIndex()).getAdress());
//        PhoneID.setText(""+cg.getlist(jList1.getSelectedIndex()).getPhoneID());
        CustomerEmailField.setText(con.getlist(CustomerJList.getSelectedIndex()).getEmail());
        
        AddCustomerButton.setEnabled(false);
        AddEditPhoneButton.setEnabled(false);
        DeleteCustomerbutton.setEnabled(true);
        EditCustomerButton.setEnabled(true);
        GetCustomerButton.setEnabled(false);
        SaveCustomerChangeButton.setEnabled(true);
    }//GEN-LAST:event_EditCustomerButtonActionPerformed

    private void DeleteCustomerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCustomerbuttonActionPerformed
        int cusID = con.getlist(CustomerJList.getSelectedIndex()).getCustomerID();
        
        con.deleteCustomer(cusID);
        GetCustomerButtonActionPerformed(evt);
        
        CustomerIDField.setText(null);
        CustomerNameField.setText(null);
        CustomerAddressField.setText(null);
        CustPhoneTextArea.setText(null);
        CustomerEmailField.setText(null);
        
        AddCustomerButton.setEnabled(true);
        AddEditPhoneButton.setEnabled(false);
        DeleteCustomerbutton.setEnabled(false);
        EditCustomerButton.setEnabled(true);
        GetCustomerButton.setEnabled(true);
        SaveCustomerChangeButton.setEnabled(false);
    }//GEN-LAST:event_DeleteCustomerbuttonActionPerformed

    private void AddCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCustomerButtonActionPerformed
        String cusName = CustomerNameField.getText();
        String cusAddress  = CustomerAddressField.getText();
        String cusEmail = CustomerEmailField.getText();
        
        
        con.addCustomer(cusName,cusAddress,cusEmail);
        GetCustomerButtonActionPerformed(evt);
        
        CustomerIDField.setText(null);
        CustomerNameField.setText(null);
        CustomerAddressField.setText(null);
        CustPhoneTextArea.setText(null);
        CustomerEmailField.setText(null);
    }//GEN-LAST:event_AddCustomerButtonActionPerformed

    private void SaveCustomerChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveCustomerChangeButtonActionPerformed
        int cusID = Integer.parseInt(CustomerIDField.getText());
        String cusName = CustomerNameField.getText();
        String cusAddress  = CustomerAddressField.getText();
        String cusEmail = CustomerEmailField.getText();
        
        con.saveEditedCustomer(cusID,cusName,cusAddress,cusEmail);
        GetCustomerButtonActionPerformed(evt);
        
        CustomerIDField.setText(null);
        CustomerNameField.setText(null);
        CustomerAddressField.setText(null);
        CustPhoneTextArea.setText(null);
        CustomerEmailField.setText(null);
        
        AddCustomerButton.setEnabled(true);
        AddEditPhoneButton.setEnabled(false);
        DeleteCustomerbutton.setEnabled(false);
        EditCustomerButton.setEnabled(true);
        GetCustomerButton.setEnabled(true);
        SaveCustomerChangeButton.setEnabled(false);
    }//GEN-LAST:event_SaveCustomerChangeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCustomerButton;
    private javax.swing.JButton AddEditPhoneButton;
    private javax.swing.JMenuItem CustNavDrop;
    private javax.swing.JLabel CustPhoneLabel;
    private javax.swing.JTextArea CustPhoneTextArea;
    private javax.swing.JTextField CustomerAddressField;
    private javax.swing.JLabel CustomerAddressLabel;
    private javax.swing.JTextField CustomerEmailField;
    private javax.swing.JLabel CustomerEmailLabel;
    private javax.swing.JTextField CustomerIDField;
    private javax.swing.JList CustomerJList;
    private javax.swing.JButton CustomerMenuButton;
    private javax.swing.JLabel CustomerMenuLabel;
    private javax.swing.JTextField CustomerNameField;
    private javax.swing.JLabel CustomerNameLabel;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JLabel CutomerIDLabel;
    private javax.swing.JButton DeleteCustomerbutton;
    private javax.swing.JButton EditCustomerButton;
    private javax.swing.JLabel ExistingCustLabel;
    private javax.swing.JMenuItem ExitDrop;
    private javax.swing.JButton GetCustomerButton;
    private javax.swing.JLabel MainMenuLabel;
    private javax.swing.JMenuItem MainNavDrop;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JMenuItem OrdNavDrop;
    private javax.swing.JButton OrderMenuButton;
    private javax.swing.JLabel OrderMenuLabel;
    private javax.swing.JPanel OrderPanel;
    private javax.swing.JMenuItem ProdNavDrop;
    private javax.swing.JButton ProductMenuButton;
    private javax.swing.JLabel ProductMenuLabel;
    private javax.swing.JPanel ProductPanel;
    private javax.swing.JButton SaveCustomerChangeButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
