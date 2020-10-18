/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial2.ui;

import com.mycompany.parcial2.clases.Client;
import com.mycompany.parcial2.clases.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marl8n
 */
public class MainUI extends javax.swing.JFrame {

    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Product> cart = new ArrayList<Product>();
    private int cC = 0;
    private int cP = 0;
    private int cCart = 0;
    
    /**
     * Creates new form MainUI
     */
    public MainUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        tfAddNit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfAddName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfBuyNit = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBestClients = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tfProductCode = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tfProductName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfProductQuantity = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProducts = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        tfProductPrice = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        labelTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setText("Agregar Cliente");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Vender Productos/Agregar");

        jLabel3.setText("NIT");

        jLabel4.setText("Nombre");

        jLabel5.setText("Mejores clientes");

        jLabel6.setText("NIT");

        tableBestClients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Dinero gastado"
            }
        ));
        jScrollPane1.setViewportView(tableBestClients);

        jLabel7.setText("Codigo del producto");

        jScrollPane2.setViewportView(tfProductCode);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre Producto");

        jLabel9.setText("Cantidad");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agregar producto", "Vender productos" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        tableProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ));
        jScrollPane3.setViewportView(tableProducts);

        jLabel10.setText("Precio");

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBuy.setText("Comprar");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        labelTotal.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfAddNit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tfAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)
                        .addComponent(jLabel5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jButton1))
                .addGap(37, 37, 37)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfBuyNit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfProductName))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(tfProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(tfProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuy)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfAddNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(tfAddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfBuyNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuy)
                            .addComponent(labelTotal))
                        .addGap(34, 34, 34))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(validateTextFieldsAddClient()){
            addClient();
            cC++;
        }else{
            JOptionPane.showMessageDialog(rootPane, "Agregue información en todos los campos solicitados");
        }
        setClientsInTableBestClients();
        orderClientsByMoneySpent();
        cleanTextFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jComboBox1.getSelectedItem().equals("Agregar producto")){
            int idx = itsCreated(tfProductName.getText());
            if (idx == -1){
                addProduct();
                cP++;
            }else{
                editProduct(idx);
            }
            setTableProducts();
        }else if (jComboBox1.getSelectedItem().equals("Vender productos")){
            cart.add(getProductByCode(tfProductCode.getText()));
            cart.get(cCart).setQuantity(Integer.valueOf(tfProductQuantity.getText()));
            cart.get(cCart).setPrice(cart.get(cCart).getPrice() * cart.get(cCart).getQuantity());
            cCart++;
            cleanFieldsCart();
            setTableCart();
            setTotal();
        }
        orderClientsByMoneySpent();
        setClientsInTableBestClients();
        cleanTextFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if ( jComboBox1.getSelectedItem().equals("Agregar producto")){
            setLabelsForAddProduct();
        }else if ( jComboBox1.getSelectedItem().equals("Vender productos")){
            setLabelseForSellProducts();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed
        if (cart.size() > 0){
            for ( int i = 0 ; i < cCart; i++ ){
                for ( int j = 0 ; j < cP ; j ++ ){
                    if ( cart.get(i).getCode().equals(products.get(j).getCode())){
                        products.get(j).decrementQuantity(cart.get(i).getQuantity());
                    }
                }
            }
            Double buffer = sumOfProducts();
            for( int i = 0 ; i < cC ; i++ ){
                if ( clients.get(i).getNit().equals(tfBuyNit.getText())){
                    clients.get(i).incrementMoneySpent(Double.valueOf(buffer));
                }
            }
        }
        cart.clear();
        cCart = 0;
        orderClientsByMoneySpent();
        setClientsInTableBestClients();
        cleanTextFields();
    }//GEN-LAST:event_btnBuyActionPerformed

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
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }
    
    private boolean validateTextFieldsAddClient(){
        return !tfAddNit.getText().isEmpty() && !tfAddName.getText().isEmpty();
    }
    
    private void cleanTextFields(){
        tfAddNit.setText("");
        tfAddName.setText("");
        tfBuyNit.setText("");
        tfProductCode.setText("");
        tfProductName.setText("");
        tfProductQuantity.setText("");
        tfProductPrice.setText("");
    }
    
    private void cleanFieldsCart(){
        tfAddNit.setText("");
        tfAddName.setText("");
        tfProductCode.setText("");
        tfProductName.setText("");
        tfProductQuantity.setText("");
        tfProductPrice.setText("");
    }
    
    private void addClient(){
        clients.add(
                new Client(
                        tfAddNit.getText(),
                        tfAddName.getText()
                )
        );
    }
    
    private void orderClientsByMoneySpent(){
        for ( int i = 0; i < cC; i++ ){
            for ( int j = 0; j < cC-1; j++ ){
                if (compareClientsByMoneySpent(clients.get(j), clients.get(j+1))){
                    Client tempClient = new Client();
                    swapInfoClients(tempClient, clients.get(j));
                    swapInfoClients(clients.get(j), clients.get(j+1));
                    swapInfoClients(clients.get(j+1), tempClient);
                }
                }
        }
    }
    
    private void swapInfoClients(Client client1, Client client2){
        client1.setName(client2.getName());
        client1.setNit(client2.getNit());
        client1.setMoneySpent(client2.getMoneySpent());
    }
    
    private boolean compareClientsByMoneySpent(Client client1, Client client2){
        return client1.getMoneySpent() < client2.getMoneySpent();
    }
    
    private void setClientsInTableBestClients(){
        DefaultTableModel model = (DefaultTableModel) tableBestClients.getModel();
        model.setRowCount(0);
        for ( int i = 0; i < cC; i++ ){
            model.addRow(clients.get(i).getInfoAndMoney());
        }
        tableBestClients.setModel(model);
    }
    
    private void setLabelsForAddProduct(){
        tfBuyNit.setEnabled(false);
        tfProductCode.setEnabled(true);
        tfProductName.setEnabled(true);
        tfProductQuantity.setEnabled(true);
        tfProductPrice.setEnabled(true);
        jButton2.setText("Agregar");
        btnBuy.setEnabled(false);
    }
    
    private void setLabelseForSellProducts(){
        tfBuyNit.setEnabled(true);
        tfProductCode.setEnabled(true);
        tfProductName.setEnabled(false);
        tfProductQuantity.setEnabled(true);
        tfProductPrice.setEnabled(false);
        jButton2.setText("Agregar al carrito");
        btnBuy.setEnabled(true);
    }
    
    
    private void addProduct(){
        products.add(
                new Product(
                        tfProductCode.getText(),
                        tfProductName.getText(),
                        Integer.valueOf(tfProductQuantity.getText()),
                        Double.valueOf(tfProductPrice.getText())
                )
        );
    }
    
    private void editProduct(int idx){
        products.get(idx).setCode(tfProductCode.getText());
        products.get(idx).setName(tfProductName.getText());
        products.get(idx).incrementQuantity(Integer.valueOf(tfProductQuantity.getText()));
        products.get(idx).setPrice(Double.valueOf(tfProductPrice.getText()));
    }
    
    private int itsCreated(String name){
        for ( int i = 0; i < cP; i++ ){
            if(products.get(i).getName().equals(name)){
                return i;
            }
        }
        
        return -1;
    }
    
    private Product getProductByCode(String codeProduct){
        for ( int i = 0; i < cP; i++ ){
            if (products.get(i).getCode().equals(codeProduct)){
                Product buffer = new Product();
                copyProducts(buffer, products.get(i));
                return buffer;
            }
        }
        return null;
    }
    
    private void copyProducts(Product p1, Product p2){
        p1.setCode(p2.getCode());
        p1.setName(p2.getName());
        p1.setPrice(p2.getPrice());
    }
    
    private void setTableProducts(){
        DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
        model.setRowCount(0);
        for (int i = 0; i < cP; i++ ){
            model.addRow(products.get(i).getInfoAsObjectArray());
        }
        tableProducts.setModel(model);
    }

    private void setTableCart(){
        DefaultTableModel model = (DefaultTableModel) tableProducts.getModel();
        model.setRowCount(0);
        for (int i = 0; i < cCart; i++ ){
            model.addRow(cart.get(i).getInfoAsObjectArray());
        }
        tableProducts.setModel(model);
    }
    
    private void setTotal(){
        Double buffer = sumOfProducts();
        labelTotal.setText("Total: " + buffer);
    }
    
    private double sumOfProducts(){
        Double buffer = 0.0;
        
        for ( int i = 0 ; i < cCart ; i++ ){
            buffer += cart.get(i).getPrice();
        }
        
        return buffer;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tableBestClients;
    private javax.swing.JTable tableProducts;
    private javax.swing.JTextField tfAddName;
    private javax.swing.JTextField tfAddNit;
    private javax.swing.JTextField tfBuyNit;
    private javax.swing.JTextPane tfProductCode;
    private javax.swing.JTextField tfProductName;
    private javax.swing.JTextField tfProductPrice;
    private javax.swing.JTextField tfProductQuantity;
    // End of variables declaration//GEN-END:variables
}
