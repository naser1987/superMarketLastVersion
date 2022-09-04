package back;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddProduct extends javax.swing.JDialog {

    DBConnection con;

    public AddProduct(JFrame f) {
        super(f, true);
        con = new DBConnection();
        initComponents();
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        supplier = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        expireDate = new javax.swing.JTextField();
        productionDate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add Product");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel8.setText("Code");

        jLabel11.setText("Name");

        code.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                codeKeyReleased(evt);
            }
        });

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        supplier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel13.setText("Supplier");

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("  Production Date");

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Expiration Date");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        expireDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        expireDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        expireDate.setToolTipText("dd-MM-yyyy");

        productionDate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        productionDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productionDate.setToolTipText("dd-MM-yyyy");

        jButton2.setBackground(new java.awt.Color(114, 197, 252));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(114, 197, 252));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(code)
                            .addComponent(supplier)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(productionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(expireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expireDate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        expireDate.getAccessibleContext().setAccessibleParent(expireDate);
        productionDate.getAccessibleContext().setAccessibleParent(productionDate);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (code.getText().equals("")) {
            JOptionPane.showMessageDialog(AddProduct.this, "You must enter product code", "code Error", JOptionPane.ERROR_MESSAGE);
        } else if (errorPhone(code.getText().trim())) {
            JOptionPane.showMessageDialog(AddProduct.this, "code must be only numbers", "code Error", JOptionPane.ERROR_MESSAGE);
        } else if (name.getText().equals("")) {
            JOptionPane.showMessageDialog(AddProduct.this, "You must enter product name", "name Error", JOptionPane.ERROR_MESSAGE);
        } else if (supplier.getText().equals("")) {
            JOptionPane.showMessageDialog(AddProduct.this, "You must enter product ssupplier", "supplier Error", JOptionPane.ERROR_MESSAGE);
        } else if (productionDate.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(AddProduct.this, "You must enter roduct production date of product", "production date Error", JOptionPane.ERROR_MESSAGE);

        } else if (expireDate.getText().trim().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(AddProduct.this, "You must enter roduct expire date of product", "expire date Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                PreparedStatement stmt2 = con.getConnection().prepareStatement("select * from products where code = ?", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                stmt2.setString(1, code.getText());
                ResultSet r = stmt2.executeQuery();
                if (r.next()) {
                    JOptionPane.showMessageDialog(AddProduct.this, "This product Already Entered Before", "Duplicate product", JOptionPane.ERROR_MESSAGE);
                    stmt2.close();
                } else {
                    PreparedStatement stmt = con.getConnection().prepareStatement("insert into products values "
                            + "(?,?,?,?,?);", ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    stmt.setString(1, code.getText());
                    stmt.setString(2, name.getText());
                    stmt.setString(5, supplier.getText());

                    /* get the time now 
                   
                    LocalDate da = LocalDate.now(); 
                    stmt.setDate(4,java.sql.Date.valueOf(da));
                    stmt.setDate(3,java.sql.Date.valueOf(da));
                    stmt.setString(5, supplier.getText());
                     */
                    String prodString = productionDate.getText().trim();
                    String expirString = expireDate.getText().trim();

                    try {
                        if (prodDateCheck(prodString,expirString)) {
                            stmt.setString(3, prodString);
                            stmt.setString(4, expirString);

                            int x = stmt.executeUpdate();
                            if (x > 0) {
                                JOptionPane.showMessageDialog(AddProduct.this, "product added Successfully", "Add procduct", JOptionPane.INFORMATION_MESSAGE);
                                stmt.close();
                                code.setText("");
                                name.setText("");
                                supplier.setText("");
                                productionDate.setText("");
                                expireDate.setText("");
                            } else {
                                JOptionPane.showMessageDialog(AddProduct.this, "no connection to data base", " Error", JOptionPane.ERROR_MESSAGE);
                            }

                        } else {
                            JOptionPane.showMessageDialog(AddProduct.this, "please enter the right date ", " format date Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (ParseException ex) {
                        Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    public boolean errorPhone(String phone) {
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void codeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codeKeyReleased
        // TODO add your handling code here:
        if (code.getText().length() > 12) {
            JOptionPane.showMessageDialog(AddProduct.this, "Code must be less than 12 characters", "Code error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_codeKeyReleased
    public boolean prodDateCheck(String date, String date1) throws ParseException {
        String[] productionDates = date.split("-");
        int prodYearNum = Integer.parseInt(productionDates[2]);
        int prodMonthNum = Integer.parseInt(productionDates[1]);
        int prodDayNum = Integer.parseInt(productionDates[0]);
        String[] expireDates = date1.split("-");
        int expireYearNum = Integer.parseInt(expireDates[2]);
        int expireMonthNum = Integer.parseInt(expireDates[1]);
        int expireDayNum = Integer.parseInt(expireDates[0]);
        if (expireYearNum < prodYearNum) {
            JOptionPane.showMessageDialog(AddProduct.this, "the expire year must be equal to or greater than production year", " expire year Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if (checkValidationMonthDay(prodMonthNum, prodDayNum, "prod")) {
                if (checkValidationMonthDay(expireMonthNum, expireDayNum, "expire")) {

                    return true;
                } else {
                    return false;
                }

            }
        }
        return false;

    }

    public boolean checkValidationMonthDay(int mon, int day, String name) {
        if (mon > 12 || mon < 1) {
            JOptionPane.showMessageDialog(AddProduct.this, "the month number "+ name+" is not right, it must be between 1 and 12", " month number Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {

            switch (mon) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (day < 1 || day > 31) {
                        JOptionPane.showMessageDialog(AddProduct.this, "the day of month  number "+ name+"  is not right, it must be between 1 and 31", " day  number  Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else {
                        return true;
                    }
                case 2:
                    if (day < 1 || day > 28) {
                        JOptionPane.showMessageDialog(AddProduct.this, "the day of month  number "+ name+"  is not right, it must be between 1 and 28", " day  number  Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else {
                        return true;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    if (day < 1 || day > 30) {
                        JOptionPane.showMessageDialog(AddProduct.this, "the day number of month "+ name+"  is not right, it must be between 1 and 30", " day  number  Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else {
                        return true;
                    }
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMarket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct(null).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JTextField expireDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField name;
    private javax.swing.JTextField productionDate;
    private javax.swing.JTextField supplier;
    // End of variables declaration//GEN-END:variables
}
