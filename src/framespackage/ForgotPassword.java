package framespackage;

import objectspackage.User;
import objectspackage.DBConnection;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class ForgotPassword extends javax.swing.JFrame
{
    private DBConnection dbc;
    
    public ForgotPassword()
    {
        initComponents();
        tfCNIC.requestFocus();
        jPanel1.setFocusable(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dbc = new DBConnection();
        dbc.connection(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblIncorrectCNIC = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pfNewPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        btnSaveChanges = new javax.swing.JButton();
        tfCNIC = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lblPasswordMissing = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 50));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(1, 37, 73));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(380, 305));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("RESET YOU PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 290, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 153, 255));
        jLabel2.setText("Enter CNIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        lblIncorrectCNIC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblIncorrectCNIC.setForeground(java.awt.Color.red);
        jPanel1.add(lblIncorrectCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 153, 255));
        jLabel3.setText("Enter New Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        pfNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pfNewPasswordFocusGained(evt);
            }
        });
        pfNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfNewPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(pfNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 318, 30));

        cbShowPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(cbShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        btnSaveChanges.setBackground(new java.awt.Color(204, 51, 255));
        btnSaveChanges.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 130, -1));

        try {
            tfCNIC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCNIC.setPreferredSize(new java.awt.Dimension(6, 20));
        tfCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCNICKeyTyped(evt);
            }
        });
        jPanel1.add(tfCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 318, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 153, 255));
        jLabel4.setText("Your Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        tfUsername.setEditable(false);
        jPanel1.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 318, 30));

        lblPasswordMissing.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblPasswordMissing.setForeground(java.awt.Color.red);
        jPanel1.add(lblPasswordMissing, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        String CNIC = tfCNIC.getText();
        String newPassword = pfNewPassword.getText();
        
        if ((CNIC.equals("     -       - ")) || (newPassword.isEmpty()))
        {
            JOptionPane.showMessageDialog(this, "All fields must be filled!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            User user = dbc.hasCNIC(CNIC, tfCNIC, lblIncorrectCNIC);
            if (user != null)
            {
                tfUsername.setText(user.getUsername());
                pfNewPassword.requestFocus();
                if (newPassword.contains(" "))
                {
                    JOptionPane.showMessageDialog(this, "Spaces not allowed!", "Password", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (newPassword.length() < 5)
                {
                    JOptionPane.showMessageDialog(this, "Password must contain atleast 5 characters!", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    User user1 = new User(user.getUsername(), newPassword);
                    int rowsAffected = dbc.changePassword(this, user1);
                    if (rowsAffected > 0)
                    {
                        this.dispose();
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())
        {
            pfNewPassword.setEchoChar((char)0);
            if (!(tfCNIC.getText().equals("     -       - ")))
            {
                pfNewPassword.requestFocus();
            }
            else
            {
                tfCNIC.requestFocus();
            }
        }
        else
        {
            pfNewPassword.setEchoChar('*');
            if (!(tfCNIC.getText().equals("     -       - ")))
            {
                pfNewPassword.requestFocus();
            }
            else
            {
                tfCNIC.requestFocus();
            }
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void pfNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pfNewPasswordFocusGained
        if (pfNewPassword.getPassword().length == 0)
        {
            lblIncorrectCNIC.setText("");
            lblPasswordMissing.setText("");
        }
        if (!(tfCNIC.getText().equals("     -       - ")))
        {
            User user = dbc.hasCNIC(tfCNIC.getText(), tfCNIC, lblIncorrectCNIC);
            if (user != null)
            {
                tfUsername.setText(user.getUsername());
                pfNewPassword.requestFocus();
            }
            else
            {
                tfUsername.setText("");
            }
        }
    }//GEN-LAST:event_pfNewPasswordFocusGained

    private void tfCNICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCNICKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            firstEnter();
        }
    }//GEN-LAST:event_tfCNICKeyTyped

    private void pfNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfNewPasswordKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            secondEnter();
        }
        else
        {
            lblPasswordMissing.setText("");
        }
    }//GEN-LAST:event_pfNewPasswordKeyTyped

    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIncorrectCNIC;
    private javax.swing.JLabel lblPasswordMissing;
    private javax.swing.JPasswordField pfNewPassword;
    private javax.swing.JFormattedTextField tfCNIC;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    private void firstEnter()
    {
        String CNIC = tfCNIC.getText().trim();
        if (CNIC.length() == 9)
        {
            lblIncorrectCNIC.setText("CNIC is missing!");
            tfCNIC.requestFocus();
        }
        else if (CNIC.length() < 15)
        {
            lblIncorrectCNIC.setText("Invalid CNIC!");
            tfCNIC.requestFocus();
        }
        else
        {
            User user = dbc.hasCNIC(CNIC, tfCNIC, lblIncorrectCNIC);
            if (user != null)
            {
                tfUsername.setText(user.getUsername());
                pfNewPassword.requestFocus();
            }
            else
            {
                tfUsername.setText("");
            }
        }
    }

    private void secondEnter()
    {
        if (pfNewPassword.getText().isEmpty())
        {
            lblPasswordMissing.setText("Password is missing!");
        }
        else if (pfNewPassword.getText().length() < 5)
        {
            lblPasswordMissing.setText("Password must contain atleast 5 characters!");
        }
        else
        {
            String username  = tfUsername.getText();
            String newPassword = pfNewPassword.getText();
            User user = new User(username, newPassword);
            int rowsAffected = dbc.changePassword(this, user);
            if (rowsAffected > 0)
            {
                this.dispose();
            }
        }
    }
}