/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import assignment.Item;
import assignment.MyReader;
import assignment.Seller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author xxhackerxx
 */
public class SellerAddItem extends javax.swing.JFrame {

    private Seller seller;

    /**
     * Creates new form AddItem
     */
    public SellerAddItem(Seller seller) {
        this.seller = seller;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ItemTitle = new javax.swing.JLabel();
        ItemDescribtion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ItemCategory = new javax.swing.JLabel();
        MethodOfDelivery = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        describtionField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        categoryField = new javax.swing.JTextField();
        deliveryField = new javax.swing.JComboBox<>();
        fileName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trading System");
        setLocation(new java.awt.Point(380, 180));

        ItemTitle.setFont(new java.awt.Font("HelveticaNeueLT Std Med", 0, 18)); // NOI18N
        ItemTitle.setText("Item Title: ");

        ItemDescribtion.setFont(new java.awt.Font("HelveticaNeueLT Std Med", 0, 18)); // NOI18N
        ItemDescribtion.setText("Item Describtion:");

        jLabel6.setFont(new java.awt.Font("HelveticaNeueLT Std Med", 0, 18)); // NOI18N
        jLabel6.setText("ItemPrice");

        ItemCategory.setFont(new java.awt.Font("HelveticaNeueLT Std Med", 0, 18)); // NOI18N
        ItemCategory.setText("Item Category: ");

        MethodOfDelivery.setFont(new java.awt.Font("HelveticaNeueLT Std Med", 0, 18)); // NOI18N
        MethodOfDelivery.setText("Method of Delivery: ");

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        deliveryField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pickup", "Delivery" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 848, Short.MAX_VALUE)
                        .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ItemTitle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ItemDescribtion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(describtionField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ItemCategory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(MethodOfDelivery)
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deliveryField, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ItemTitle)
                    .addComponent(titleField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ItemDescribtion)
                    .addComponent(describtionField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(categoryField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemCategory))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MethodOfDelivery)
                    .addComponent(deliveryField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218)
                .addComponent(fileName, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(resetButton))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ImageIcon ii;


    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        titleField.setText("");
        describtionField.setText("");
        priceField.setText("");
        categoryField.setText("");

    }//GEN-LAST:event_resetButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        SellerFrame s = new SellerFrame(seller);
        this.setVisible(false);
        s.setVisible(true);


    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if ((!seller.hasEnoughCredit())) {
            JOptionPane.showMessageDialog(this, "No enough balance", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean Avaliablity = true;
        String itemTitle = titleField.getText();
        String itemDescribtion = describtionField.getText();
        double itemPrice;

        try {
            itemPrice = Double.parseDouble(this.priceField.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Item price must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String path = "";
        String itemCategory = categoryField.getText().toUpperCase();
        double successFees = Item.calculateSucessFees(itemPrice);
        String methodOfDelivery = deliveryField.getSelectedItem().toString();
        int sellerId = Integer.parseInt(seller.getId());

        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        //if the user click on save in Jfilechooser
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            path = selectedFile.getAbsolutePath();
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("None");
        }

//        =============================
//            JFileChooser chooser = new JFileChooser();
//            chooser.showOpenDialog(null);
//            final File f = chooser.getSelectedFile();
//            String filename = f.getAbsolutePath();
//            
//            if (f == null) {
//                return;
//            }
//    fileName.setText(filename);
//
//    SwingWorker sw = new SwingWorker() {
//        @Override
//        protected Object doInBackground() throws Exception {
//            Thread.sleep(5000);//simulate large image takes long to load
//            ii = new ImageIcon(scaleImage(120, 120, ImageIO.read(new File(f.getAbsolutePath()))));
//            return null;
//        }
//
//        @Override
//        protected void done() { 
//            super.done();
//            jLabel1.setIcon(ii);
//        }
//
//            private String scaleImage(int i, int i0, BufferedImage read) {
//                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//            }
//    };
//    sw.execute();
//========================================
        seller.addItem(new Item(Avaliablity, itemTitle, itemDescribtion, itemPrice, itemCategory, methodOfDelivery, successFees, path));
        System.out.println("printing path: " + path);
        JOptionPane.showMessageDialog(this, "New item added Successfully", "Item", JOptionPane.CLOSED_OPTION);
        this.setVisible(false);
        SellerFrame s = new SellerFrame(seller);
        s.setVisible(true);
    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddItem(mySe).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ItemCategory;
    private javax.swing.JLabel ItemDescribtion;
    private javax.swing.JLabel ItemTitle;
    private javax.swing.JLabel MethodOfDelivery;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField categoryField;
    private javax.swing.JComboBox<String> deliveryField;
    private javax.swing.JTextField describtionField;
    private javax.swing.JLabel fileName;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton resetButton;
    private javax.swing.JTextField titleField;
    // End of variables declaration//GEN-END:variables
}
