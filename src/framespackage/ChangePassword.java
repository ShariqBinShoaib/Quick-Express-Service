package framespackage;

import objectspackage.User;
import objectspackage.DBConnection;
import com.sun.glass.events.KeyEvent;

public class ChangePassword extends javax.swing.JFrame
{
    private DBConnection dbc;
    private String username;
    private String password;
    
    public ChangePassword()
    {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    public ChangePassword(String username, String password)
    {
        initComponents();
        dbc = new DBConnection();
        dbc.connection(this);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.username = username;
        this.password = password;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pfCurrentPassword = new javax.swing.JPasswordField();
        lblCurrentPassword = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pfNewPassword = new javax.swing.JPasswordField();
        lblNewPassword = new javax.swing.JLabel();
        cbShowPassword = new javax.swing.JCheckBox();
        btnSaveChanges = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Change Password");

        jLabel2.setText("Enter Current Password");

        pfCurrentPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfCurrentPasswordKeyTyped(evt);
            }
        });

        jLabel3.setText("Enter New Password");

        pfNewPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfNewPasswordKeyTyped(evt);
            }
        });

        cbShowPassword.setText("Show Password");
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pfCurrentPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfNewPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblCurrentPassword)
                                    .addComponent(jLabel3)
                                    .addComponent(lblNewPassword))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 148, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(156, 156, 156))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbShowPassword)
                                    .addComponent(btnSaveChanges))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCurrentPassword)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNewPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(cbShowPassword)
                .addGap(18, 18, 18)
                .addComponent(btnSaveChanges)
                .addGap(40, 40, 40))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        if (cbShowPassword.isSelected())
        {
            pfCurrentPassword.setEchoChar((char) 0);
            pfNewPassword.setEchoChar((char) 0);
        }
        else
        {
            pfCurrentPassword.setEchoChar('*');
            pfNewPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        if ((pfCurrentPassword.getText().isEmpty()) && (pfNewPassword.getText().isEmpty()))
        {
            lblCurrentPassword.setText("*Required!");
            lblNewPassword.setText("*Required!");
            pfCurrentPassword.requestFocus();
        }
        else if (pfCurrentPassword.getText().isEmpty())
        {
            lblCurrentPassword.setText("*Required!");
        }
        else
        {
            String currentPassword = pfCurrentPassword.getText();
            if (currentPassword.equals(password))
            {
                pfNewPassword.requestFocus();
                if (pfNewPassword.getText().isEmpty())
                {
                    lblNewPassword.setText("*Required!");
                }
                else if (pfNewPassword.getText().length() < 5)
                {
                    lblNewPassword.setText("Password must contain atleast 5 characters!");
                }
                else
                {
                    String newPassword = pfNewPassword.getText();
                    User user = new User(username, newPassword);
                    int rowsAffected = dbc.changePassword(this, user);
                    if (rowsAffected > 0)
                    {
                        this.dispose();
                    }
                }
            }
            else
            {
                lblCurrentPassword.setText("Invalid Password!");
                pfCurrentPassword.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSaveChangesActionPerformed

    private void pfCurrentPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfCurrentPasswordKeyTyped
        lblCurrentPassword.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (pfCurrentPassword.getText().isEmpty())
            {
                lblCurrentPassword.setText("*Required!");
            }
            else
            {
                String currentPassword = pfCurrentPassword.getText();
                if (currentPassword.equals(password))
                {
                    pfNewPassword.requestFocus();
                }
                else
                {
                    lblCurrentPassword.setText("Invalid Password!");
                }
            }
        }
    }//GEN-LAST:event_pfCurrentPasswordKeyTyped

    private void pfNewPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfNewPasswordKeyTyped
        lblNewPassword.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (pfNewPassword.getText().isEmpty())
            {
                lblNewPassword.setText("*Required!");
            }
            else if (pfNewPassword.getText().length() < 5)
            {
                lblNewPassword.setText("Password must contain atleast 5 characters!");
            }
            else
            {

                String newPassword = pfNewPassword.getText();
                User user = new User(username, newPassword);
                int rowsAffected = dbc.changePassword(this, user);
                if (rowsAffected > 0)
                {
                    this.dispose();
                }
            }
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JCheckBox cbShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblCurrentPassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JPasswordField pfCurrentPassword;
    private javax.swing.JPasswordField pfNewPassword;
    // End of variables declaration//GEN-END:variables
}