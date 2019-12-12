package framespackage;

import objectspackage.User;
import objectspackage.DBConnection;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame
{
    private DBConnection dbc;
    private LoginForm loginForm;
    
    public SignUp()
    {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dbc = new DBConnection();
        dbc.connection(this);
    }

    public SignUp(LoginForm loginForm)
    {
        initComponents();
        this.loginForm = loginForm;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dbc = new DBConnection();
        dbc.connection(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        tfCNIC = new javax.swing.JFormattedTextField();
        btnSignUp = new javax.swing.JButton();
        lblCNIC = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("SIGN UP");

        jLabel2.setText("Username");

        tfUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfUsernameFocusGained(evt);
            }
        });
        tfUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsernameKeyTyped(evt);
            }
        });

        jLabel3.setText("Password");

        tfPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfPasswordFocusGained(evt);
            }
        });
        tfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfPasswordKeyTyped(evt);
            }
        });

        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        jLabel4.setText("CNIC");

        try {
            tfCNIC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCNIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCNICKeyTyped(evt);
            }
        });

        btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername)
                                    .addComponent(lblCNIC)
                                    .addComponent(tfCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tfUsername))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfPassword)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSignUp)
                                            .addComponent(cbShowPassword))))
                                .addGap(2, 2, 2)))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfCNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCNIC)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword)
                .addGap(44, 44, 44)
                .addComponent(cbShowPassword)
                .addGap(31, 31, 31)
                .addComponent(btnSignUp)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        signUp();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void tfCNICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCNICKeyTyped
        lblCNIC.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfCNIC.getText().equals("     -       - "))
            {
                lblCNIC.setText("Enter CNIC first!");
            }
            else if (tfCNIC.getText().trim().length() < 15)
            {
                lblCNIC.setText("Invalid CNIC!");
            }
            else
            {
                boolean flag = dbc.hasCNIC(this, tfCNIC.getText(), "user");
                if (flag)
                {
                    lblCNIC.setText("This CNIC is already registered!");
                    tfCNIC.requestFocus();
                }
                else
                {
                    lblCNIC.setText("");
                    tfUsername.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_tfCNICKeyTyped

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())
        {
            tfPassword.setEchoChar((char)0);
            if (!(tfCNIC.getText().equals("     -       - ")))
            {
                tfPassword.requestFocus();
            }
            else
            {
                tfCNIC.requestFocus();
            }
        }
        else
        {
            tfPassword.setEchoChar('*');
            if (!(tfCNIC.getText().equals("     -       - ")))
            {
                tfPassword.requestFocus();
            }
            else
            {
                tfCNIC.requestFocus();
            }
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void tfPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPasswordKeyTyped
        lblPassword.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfPassword.getText().isEmpty())
            {
                lblPassword.setText("Enter Password!");
                tfPassword.requestFocus();
            }
            else if (tfPassword.getText().length() < 5)
            {
                lblPassword.setText("Password must contain atleast 5 characters!");
                tfPassword.requestFocus();
            }
            else
            {
                User user = new User(tfUsername.getText().trim(), tfPassword.getText(), tfCNIC.getText());
                int rowsAffected = dbc.insert(this, user);
                if (rowsAffected > 0)
                {
                    JOptionPane.showMessageDialog(this, "Welcome!\n*** " + user.getUsername() + " ***", "Sign Up Successful", JOptionPane.INFORMATION_MESSAGE);
                    AdminPanel ap = new AdminPanel();
                    ap.setVisible(true);
                    loginForm.dispose();
                    this.dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Sign Up failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_tfPasswordKeyTyped

    private void tfUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsernameKeyTyped
        lblUsername.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(Character.isWhitespace(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfUsername.getText().isEmpty() || (tfUsername.getText().trim().length() == 0))
            {
                lblUsername.setText("Enter Username first!");
                tfUsername.setText("");
            }
            else if (tfUsername.getText().length() < 3)
            {
                lblUsername.setText("Name must contain atleast 3 characters!");
            }
            else
            {
                boolean flag = dbc.hasUsername(this, tfUsername.getText());
                if (flag)
                {
                    lblUsername.setText("This Username is already registered!");
                    tfUsername.requestFocus();
                }
                else
                {
                    lblUsername.setText("");
                    tfPassword.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_tfUsernameKeyTyped

    private void tfUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUsernameFocusGained
        if (tfCNIC.getText().equals("     -       - "))
        {
            lblCNIC.setText("Enter CNIC first!");
            tfCNIC.requestFocus();
        }
        else
        {
            boolean flag = dbc.hasCNIC(this, tfCNIC.getText(), "user");
            if (flag)
            {
                lblCNIC.setText("This CNIC is already registered!");
                tfCNIC.requestFocus();
            }
            else
            {
                lblCNIC.setText("");
                tfUsername.requestFocus();
            }
        }
    }//GEN-LAST:event_tfUsernameFocusGained

    private void tfPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfPasswordFocusGained
        if (tfUsername.getText().trim().isEmpty())
        {
            lblUsername.setText("Enter Username first!");
            tfUsername.requestFocus();
            tfUsername.setText("");
        }
        else if (tfUsername.getText().length() < 3)
        {
            lblUsername.setText("Username is too short!");
            tfUsername.requestFocus();
        }
    }//GEN-LAST:event_tfPasswordFocusGained

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCNIC;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JFormattedTextField tfCNIC;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    private void signUp()
    {
        if ((tfCNIC.getText().equals("     -       - ")) && (tfUsername.getText().isEmpty()) && (tfPassword.getText().isEmpty()))
        {
            lblCNIC.setText("*Required");
            lblUsername.setText("*Required");
            lblPassword.setText("*Required");
            tfCNIC.requestFocus();
        }
        else
        {
            boolean flag = dbc.hasCNIC(this, tfCNIC.getText(), "user");
            if (flag)
            {
                lblCNIC.setText("This CNIC is already registered!");
                tfCNIC.requestFocus();
            }
            else
            {
                lblCNIC.setText("");
                tfUsername.requestFocus();
                if (tfUsername.getText().trim().isEmpty())
                {
                    lblUsername.setText("*Required");
                    tfUsername.setText("");
                }
                else if (tfUsername.getText().length() < 3)
                {
                    lblUsername.setText("Name must contain atleast 3 characters!");
                }
                else
                {
                    flag = dbc.hasUsername(this, tfUsername.getText());
                    if (flag)
                    {
                        lblUsername.setText("This Username is already registered!");
                        tfUsername.requestFocus();
                    }
                    else
                    {
                        lblUsername.setText("");
                        tfPassword.requestFocus();
                        if (tfPassword.getText().isEmpty())
                        {
                            lblPassword.setText("*Required");
                            tfPassword.requestFocus();
                        }
                        else if (tfPassword.getText().length() < 5)
                        {
                            lblPassword.setText("Password must contain atleast 5 characters!");
                        }
                        else
                        {
                            User user = new User(tfUsername.getText().trim(), tfPassword.getText(), tfCNIC.getText());
                            int rowsAffected = dbc.insert(this, user);
                            if (rowsAffected > 0)
                            {
                                JOptionPane.showMessageDialog(this, "Welcome!\n*** " + user.getUsername() + " ***", "Sign Up Successful", JOptionPane.INFORMATION_MESSAGE);
                                AdminPanel ap = new AdminPanel();
                                ap.setVisible(true);
                                loginForm.dispose();
                                this.dispose();
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(this, "Sign Up failed!", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        }
    }
}