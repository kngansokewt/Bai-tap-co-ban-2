package view.product;

import main.StartFrame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;
import service.ProductService;

/**
 *
 * @author leanh
 */
public class ListProductFrame extends javax.swing.JFrame {

        ProductService productService;
        DefaultTableModel defaultTableModel;

        /**
         * Creates new form ListProductFrame
         *
         * @throws java.sql.SQLException
         */
        public ListProductFrame() throws SQLException {
                initComponents();
                productService = new ProductService();

                defaultTableModel = new DefaultTableModel() {
                        @Override
                        public boolean isCellEditable(int row, int column) {
                                return false;
                        }
                };
                productTable.setModel(defaultTableModel);

                defaultTableModel.addColumn("ID");
                defaultTableModel.addColumn("PRODUCT NAME");
                defaultTableModel.addColumn("PRICE");
                defaultTableModel.addColumn("QUANTITY");
                defaultTableModel.addColumn("ID CATEGORY");

                setTableData(productService.getAllProducts());
        }

        private void setTableData(List<Product> products) {

                for (Product product : products) {
                        defaultTableModel.addRow(new Object[] {
                                                                                                        product.getId(),
                                                                                                        product.getProductname(),
                                                                                                        product.getPrice(),
                                                                                                        product.getQuantity(),
                                                                                                        product.getIdcategory()
                                                                                                });
                }
        }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                addButtonProduct = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                productTable = new javax.swing.JTable();
                refreshButton = new javax.swing.JButton();
                deleteButton = new javax.swing.JButton();
                editButton = new javax.swing.JButton();
                signoutButton = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setLocation(new java.awt.Point(0, 0));

                addButtonProduct.setText("Them");
                addButtonProduct.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                addButtonProductActionPerformed(evt);
                        }
                });

                productTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                productTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
                productTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                jScrollPane1.setViewportView(productTable);

                refreshButton.setText("Refresh");
                refreshButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                refreshButtonActionPerformed(evt);
                        }
                });

                deleteButton.setText("Xoa");
                deleteButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                deleteButtonActionPerformed(evt);
                        }
                });

                editButton.setText("Sua");
                editButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                editButtonActionPerformed(evt);
                        }
                });

                signoutButton.setText("Dang Xuat");
                signoutButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                signoutButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(addButtonProduct)
                                                .addGap(18, 18, 18)
                                                .addComponent(deleteButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(editButton)
                                                .addGap(18, 18, 18)
                                                .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(signoutButton))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 861, Short.MAX_VALUE))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(addButtonProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(signoutButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(refreshButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

            try {
                    // TODO add your handling code here:
                    defaultTableModel.setRowCount(0);
                    setTableData(productService.getAllProducts());
            } catch (SQLException ex) {
                    Logger.getLogger(ListProductFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void addButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonProductActionPerformed
            // TODO add your handling code here:
            new AddProductFrame().setVisible(true);
            this.dispose();
    }//GEN-LAST:event_addButtonProductActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            // TODO add your handling code here:
            int row = productTable.getSelectedRow();
            if (row == -1) {
                    JOptionPane.showMessageDialog(ListProductFrame.this, "Vui long chon Product muon xoa", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                    int confirm = JOptionPane.showConfirmDialog(ListProductFrame.this, "Chac chan muon xoa khong?");

                    if (confirm == JOptionPane.YES_OPTION) {
                            int productId = Integer.valueOf(String.valueOf(productTable.getValueAt(row, 0)));
                            try {
                                    productService.deleteProduct(productId);
                                    defaultTableModel.setRowCount(0);
                                    setTableData(productService.getAllProducts());
                            } catch (SQLException ex) {
                                    Logger.getLogger(ListProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    }
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
            // TODO add your handling code here:
            int row = productTable.getSelectedRow();
            if (row == -1) {
                    JOptionPane.showMessageDialog(ListProductFrame.this, "Vui long chon Product muon sua", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                    int productId = Integer.valueOf(String.valueOf(productTable.getValueAt(row, 0)));
                    try {
                            new EditProductFrame(productId).setVisible(true);
                    } catch (SQLException ex) {
                            Logger.getLogger(ListProductFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    this.dispose();
            }
    }//GEN-LAST:event_editButtonActionPerformed

        private void signoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutButtonActionPerformed
                // TODO add your handling code here:
                this.dispose();
                new StartFrame().setVisible(true);
        }//GEN-LAST:event_signoutButtonActionPerformed

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton addButtonProduct;
        private javax.swing.JButton deleteButton;
        private javax.swing.JButton editButton;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable productTable;
        private javax.swing.JButton refreshButton;
        private javax.swing.JButton signoutButton;
        // End of variables declaration//GEN-END:variables
}
