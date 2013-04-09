package Presentation;

import GatewayMapper.Controller;
import Resources.Product;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Kris
 */
public class UserFrame extends javax.swing.JFrame {

    DefaultListModel model1, model2;
    Controller control = new Controller();

    public UserFrame() {
        initComponents();
        model1 = new DefaultListModel();
        model2 = new DefaultListModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        listAllProducts = new javax.swing.JList();
        buttonEditProduct = new javax.swing.JButton();
        jFrame2 = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSearchResult = new javax.swing.JList();
        buttonSearchProducts = new javax.swing.JButton();
        textFieldSearchName = new javax.swing.JTextField();
        textFieldSearchID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jFrame3 = new javax.swing.JFrame();
        buttonAddNewProd = new javax.swing.JButton();
        textFieldNewProdID = new javax.swing.JTextField();
        textFieldNewProdName = new javax.swing.JTextField();
        textFieldNewProdVolume = new javax.swing.JTextField();
        textFieldNewProdQuantity = new javax.swing.JTextField();
        textFieldNewProdDescription = new javax.swing.JTextField();
        textFieldNewProdPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFrame4 = new javax.swing.JFrame();
        textFieldEditProdID = new javax.swing.JTextField();
        textFieldEditProdName = new javax.swing.JTextField();
        textFieldEditProdVolume = new javax.swing.JTextField();
        textFieldEditProdQuantity = new javax.swing.JTextField();
        textFieldEditProdDescription = new javax.swing.JTextField();
        textFieldEditProdPrice = new javax.swing.JTextField();
        buttonSaveProdChanges = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jFrame1.setMinimumSize(new java.awt.Dimension(500, 500));

        listAllProducts.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(listAllProducts);

        buttonEditProduct.setText("Edit product");
        buttonEditProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(buttonEditProduct)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonEditProduct)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jFrame2.setMinimumSize(new java.awt.Dimension(547, 430));

        listSearchResult.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listSearchResult);

        buttonSearchProducts.setText("Search");
        buttonSearchProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchProductsActionPerformed(evt);
            }
        });

        jLabel1.setText("Product Name:");

        jLabel2.setText("Product ID:");

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textFieldSearchID)
                        .addComponent(textFieldSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonSearchProducts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jFrame2Layout.createSequentialGroup()
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(58, 58, 58)
                        .addGroup(jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textFieldSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(76, 76, 76)
                        .addComponent(buttonSearchProducts)))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jFrame3.setMinimumSize(new java.awt.Dimension(400, 300));

        buttonAddNewProd.setText("Add item to Data Base");
        buttonAddNewProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddNewProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel4.setText("Quantity:");

        jLabel5.setText("Price:");

        jLabel6.setText("ID:");

        jLabel7.setText("Volume:");

        jLabel8.setText("Description:");

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNewProdDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(textFieldNewProdID)
                            .addComponent(textFieldNewProdVolume))
                        .addGap(42, 42, 42)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFieldNewProdName)
                            .addComponent(textFieldNewProdQuantity)
                            .addComponent(textFieldNewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(buttonAddNewProd)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNewProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNewProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNewProdVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNewProdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldNewProdDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNewProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(70, 70, 70)
                .addComponent(buttonAddNewProd)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jFrame4.setMinimumSize(new java.awt.Dimension(420, 420));

        textFieldEditProdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEditProdIDActionPerformed(evt);
            }
        });

        textFieldEditProdVolume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEditProdVolumeActionPerformed(evt);
            }
        });

        buttonSaveProdChanges.setText("Save");
        buttonSaveProdChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveProdChangesActionPerformed(evt);
            }
        });

        jLabel9.setText("Name:");

        jLabel10.setText("Quantity:");

        jLabel11.setText("Price:");

        jLabel12.setText("ID:");

        jLabel13.setText("Volume:");

        jLabel14.setText("Description:");

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(21, 21, 21)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldEditProdVolume, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(textFieldEditProdID, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEditProdDescription, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonSaveProdChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldEditProdName)
                    .addComponent(textFieldEditProdQuantity)
                    .addComponent(textFieldEditProdPrice))
                .addGap(85, 85, 85))
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEditProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEditProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(28, 28, 28)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEditProdVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEditProdQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(35, 35, 35)
                .addGroup(jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEditProdDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEditProdPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(buttonSaveProdChanges)
                .addGap(54, 54, 54))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Show all Products");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search products");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("New Product");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (control.getAllProducts()) {
            jFrame1.setVisible(true);
            int counter = 0;
            model1.clear();
            while (counter < control.getProductListsize()) {
                model1.addElement(control.showProducts(counter));
                counter++;
            }
            listAllProducts.setModel(model1);
        } else {
            JOptionPane.showMessageDialog(this, "Could not fetch products!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jFrame2.setVisible(true);
        model2.clear();
        listAllProducts.setModel(model2);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void buttonSearchProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchProductsActionPerformed
        String name = textFieldSearchName.getText();
        int ID = 0;
        if (!textFieldSearchID.getText().equals("")) {
            ID = Integer.parseInt(textFieldSearchID.getText());
        }
        if (name.isEmpty() && ID > 0) {
            if (control.searchForProduct(ID)) {
                int counter = 0;
                model2.clear();
                while (counter < control.getProductListsize()) {
                    model2.addElement(control.showProducts(counter));
                    counter++;
                }
                listSearchResult.setModel(model2);

            }
        }
            if (!name.isEmpty()) {
                if (control.searchForProduct(name)) {
                    int counter = 0;
                    model2.clear();
                    while (counter < control.getProductListsize()) {
                        model2.addElement(control.showProducts(counter));
                        counter++;
                    }
                    listSearchResult.setModel(model2);
                } else {
                    JOptionPane.showMessageDialog(this, "Could not find product!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if (ID > 0) {
                    if (control.searchForProduct(ID)) {
                        int counter = 0;
                        model2.clear();
                        while (counter < control.getProductListsize()) {
                            model2.addElement(control.showProducts(counter));
                            counter++;
                        }
                        listSearchResult.setModel(model2);
                    } else {
                        JOptionPane.showMessageDialog(this, "Could not find product!", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        
        textFieldSearchName.setText("");
        textFieldSearchID.setText("");
    }//GEN-LAST:event_buttonSearchProductsActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       jFrame3.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void buttonAddNewProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddNewProdActionPerformed
      if(!textFieldNewProdName.equals("") && !textFieldNewProdID.equals("")&& !textFieldNewProdVolume.equals("") &&
              !textFieldNewProdQuantity.equals("") && !textFieldNewProdDescription.equals("") &&
              !textFieldNewProdPrice.equals("")){
          int ID = Integer.parseInt(textFieldNewProdID.getText());
          String name = textFieldNewProdName.getText();
          int volume = Integer.parseInt(textFieldNewProdVolume.getText());
          int quantity = Integer.parseInt(textFieldNewProdQuantity.getText());
          String description = textFieldNewProdDescription.getText();
          int price = Integer.parseInt(textFieldNewProdPrice.getText());
          if(control.addProduct(ID, name, volume, quantity, description, price)){
             JOptionPane.showMessageDialog(this, "Product added!", "ADDED", JOptionPane.INFORMATION_MESSAGE); 
          }else{
              JOptionPane.showMessageDialog(this, "Could not add product!", "Error", JOptionPane.ERROR_MESSAGE);
          }
         
      }else{
          JOptionPane.showMessageDialog(this, "One or more fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }//GEN-LAST:event_buttonAddNewProdActionPerformed

    private void buttonEditProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditProductActionPerformed
        Product editProd;
        editProd = (Product) listAllProducts.getSelectedValue();
        jFrame4.setVisible(true);
        textFieldEditProdID.setText(""+editProd.getProductID());
        textFieldEditProdID.setEditable(false); //want to avoid serious errors here with tuple key, so for now can't edit ID
        textFieldEditProdName.setText(editProd.getName());
        textFieldEditProdVolume.setText(""+editProd.getVolume());
        textFieldEditProdQuantity.setText(""+editProd.getQuantity());
        textFieldEditProdDescription.setText(editProd.getDescription());
        textFieldEditProdPrice.setText(""+editProd.getPrice());
    }//GEN-LAST:event_buttonEditProductActionPerformed

    private void textFieldEditProdVolumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEditProdVolumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEditProdVolumeActionPerformed

    private void textFieldEditProdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEditProdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEditProdIDActionPerformed

    private void buttonSaveProdChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveProdChangesActionPerformed
        int ID = Integer.parseInt(textFieldEditProdID.getText());
        String name = textFieldEditProdName.getText();
        int volume = Integer.parseInt(textFieldEditProdVolume.getText());
        int quantity = Integer.parseInt(textFieldEditProdQuantity.getText());
        String description = textFieldEditProdDescription.getText();
        int price = Integer.parseInt(textFieldEditProdPrice.getText());
        
        if(!textFieldEditProdName.equals("") && !textFieldEditProdID.equals("")&& !textFieldEditProdVolume.equals("") &&
              !textFieldEditProdQuantity.equals("") && !textFieldEditProdDescription.equals("") &&
              !textFieldEditProdPrice.equals("")) {                        
            if(control.editProduct(ID, name, volume, quantity, description, price)) {
                JOptionPane.showMessageDialog(this, "Product edited!", "SAVED!", JOptionPane.INFORMATION_MESSAGE);
            }else{
              JOptionPane.showMessageDialog(this, "Could not save product!", "ERROR", JOptionPane.ERROR_MESSAGE);
          }
        }else {
            JOptionPane.showMessageDialog(this, "One or more fields are empty!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonSaveProdChangesActionPerformed

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
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddNewProd;
    private javax.swing.JButton buttonEditProduct;
    private javax.swing.JButton buttonSaveProdChanges;
    private javax.swing.JButton buttonSearchProducts;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listAllProducts;
    private javax.swing.JList listSearchResult;
    private javax.swing.JTextField textFieldEditProdDescription;
    private javax.swing.JTextField textFieldEditProdID;
    private javax.swing.JTextField textFieldEditProdName;
    private javax.swing.JTextField textFieldEditProdPrice;
    private javax.swing.JTextField textFieldEditProdQuantity;
    private javax.swing.JTextField textFieldEditProdVolume;
    private javax.swing.JTextField textFieldNewProdDescription;
    private javax.swing.JTextField textFieldNewProdID;
    private javax.swing.JTextField textFieldNewProdName;
    private javax.swing.JTextField textFieldNewProdPrice;
    private javax.swing.JTextField textFieldNewProdQuantity;
    private javax.swing.JTextField textFieldNewProdVolume;
    private javax.swing.JTextField textFieldSearchID;
    private javax.swing.JTextField textFieldSearchName;
    // End of variables declaration//GEN-END:variables
}
