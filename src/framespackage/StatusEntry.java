package framespackage;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import objectspackage.DBConnection;
import objectspackage.Rider;
import objectspackage.Status;

public class StatusEntry extends javax.swing.JFrame
{
    private int rowNumber;
    private DefaultTableModel table;
    private DBConnection dbc;
    private boolean flag, flag2;
    private int month;
    private int year;
    
    public StatusEntry()
    {
        initComponents();
        dbc = new DBConnection();
        dbc.connection(this);
        this.rowNumber = rowNumber;
        this.table = table;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dbc.getRiderNameList(this, cbStatusEntryRiderNameList);
        cbStatusEntryRiderNameList.requestFocus();
    }
    
    public StatusEntry(int rowNumber, DefaultTableModel table)
    {
        initComponents();
        dbc = new DBConnection();
        dbc.connection(this);
        this.rowNumber = rowNumber;
        this.table = table;
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dbc.getRiderNameList(this, cbStatusEntryRiderNameList);
        cbStatusEntryRiderNameList.requestFocus();
        GregorianCalendar gc = new GregorianCalendar();
        month = gc.get(Calendar.MONTH) + 1;
        year = gc.get(Calendar.YEAR);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbStatusEntryRiderNameList = new javax.swing.JComboBox<>();
        lblStatusEntryRiderName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCashOnDelivery = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfDeliveryCharges = new javax.swing.JTextField();
        lblCashOnDelivery = new javax.swing.JLabel();
        lblDeliveryCharges = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbStatusType = new javax.swing.JComboBox<>();
        lblStatusType = new javax.swing.JLabel();
        btnSubmitStatusEntry = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Status Entry");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Rider Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, -1, -1));

        cbStatusEntryRiderNameList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbStatusEntryRiderNameList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Rider" }));
        cbStatusEntryRiderNameList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbStatusEntryRiderNameListKeyTyped(evt);
            }
        });
        getContentPane().add(cbStatusEntryRiderNameList, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 39, 230, -1));

        lblStatusEntryRiderName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStatusEntryRiderName.setForeground(java.awt.Color.red);
        getContentPane().add(lblStatusEntryRiderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cash On Delivery");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        tfCashOnDelivery.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCashOnDelivery.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfCashOnDeliveryFocusGained(evt);
            }
        });
        tfCashOnDelivery.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCashOnDeliveryKeyTyped(evt);
            }
        });
        getContentPane().add(tfCashOnDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 230, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Delivery Charges");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        tfDeliveryCharges.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfDeliveryCharges.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfDeliveryChargesKeyTyped(evt);
            }
        });
        getContentPane().add(tfDeliveryCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 230, -1));

        lblCashOnDelivery.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCashOnDelivery.setForeground(java.awt.Color.red);
        getContentPane().add(lblCashOnDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        lblDeliveryCharges.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDeliveryCharges.setForeground(java.awt.Color.red);
        getContentPane().add(lblDeliveryCharges, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Status Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        cbStatusType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbStatusType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Status", "Ok", "Return with charges", "Return without charges" }));
        cbStatusType.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cbStatusTypeKeyTyped(evt);
            }
        });
        getContentPane().add(cbStatusType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 230, -1));

        lblStatusType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStatusType.setForeground(java.awt.Color.red);
        getContentPane().add(lblStatusType, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        btnSubmitStatusEntry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmitStatusEntry.setText("Submit");
        btnSubmitStatusEntry.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnSubmitStatusEntryFocusGained(evt);
            }
        });
        btnSubmitStatusEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitStatusEntryActionPerformed(evt);
            }
        });
        btnSubmitStatusEntry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                btnSubmitStatusEntryKeyTyped(evt);
            }
        });
        getContentPane().add(btnSubmitStatusEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitStatusEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitStatusEntryActionPerformed
        submitStatus();
    }//GEN-LAST:event_btnSubmitStatusEntryActionPerformed

    private void cbStatusEntryRiderNameListKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbStatusEntryRiderNameListKeyTyped
        char c = evt.getKeyChar();
        if (flag && (c == KeyEvent.VK_ENTER))
        {
            cbStatusEntryRiderNameList.hidePopup();
            tfCashOnDelivery.requestFocus();
            lblStatusEntryRiderName.setText("");
        }
        else if (c == KeyEvent.VK_ENTER)
        {
            cbStatusEntryRiderNameList.showPopup();
            flag = true;
        }
    }//GEN-LAST:event_cbStatusEntryRiderNameListKeyTyped

    private void tfCashOnDeliveryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCashOnDeliveryFocusGained
        if (cbStatusEntryRiderNameList.getSelectedIndex() == 0)
        {
            lblStatusEntryRiderName.setText("*Required");
            cbStatusEntryRiderNameList.requestFocus();
            flag = false;
        }
        else
        {
            lblStatusEntryRiderName.setText("");
        }
    }//GEN-LAST:event_tfCashOnDeliveryFocusGained

    private void tfCashOnDeliveryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCashOnDeliveryKeyTyped
        lblCashOnDelivery.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfCashOnDelivery.getText().length() > 9)
            {
                lblCashOnDelivery.setText("Cash cannot be greater than 9 digits!");
                tfCashOnDelivery.requestFocus();
            }
            else
            {
                tfDeliveryCharges.requestFocus();
            }
        }
    }//GEN-LAST:event_tfCashOnDeliveryKeyTyped

    private void tfDeliveryChargesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfDeliveryChargesKeyTyped
        lblDeliveryCharges.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfDeliveryCharges.getText().length() > 9)
            {
                lblDeliveryCharges.setText("Charges cannot be greater than 9 digits!");
                tfDeliveryCharges.requestFocus();
            }
            else
            {
                cbStatusType.requestFocus();
            }
        }
    }//GEN-LAST:event_tfDeliveryChargesKeyTyped

    private void cbStatusTypeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbStatusTypeKeyTyped
        char c = evt.getKeyChar();
        if (flag2 && (c == KeyEvent.VK_ENTER))
        {
            cbStatusType.hidePopup();
            btnSubmitStatusEntry.requestFocus();
            lblStatusType.setText("");
        }
        else if (c == KeyEvent.VK_ENTER)
        {
            cbStatusType.showPopup();
            flag2 = true;
        }
    }//GEN-LAST:event_cbStatusTypeKeyTyped

    private void btnSubmitStatusEntryFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnSubmitStatusEntryFocusGained
        if (cbStatusType.getSelectedIndex() == 0)
        {
            lblStatusType.setText("*Required");
            cbStatusType.requestFocus();
            flag2 = false;
        }
    }//GEN-LAST:event_btnSubmitStatusEntryFocusGained

    private void btnSubmitStatusEntryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnSubmitStatusEntryKeyTyped
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            submitStatus();
        }
    }//GEN-LAST:event_btnSubmitStatusEntryKeyTyped

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
            java.util.logging.Logger.getLogger(StatusEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new StatusEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmitStatusEntry;
    private javax.swing.JComboBox<String> cbStatusEntryRiderNameList;
    private javax.swing.JComboBox<String> cbStatusType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblCashOnDelivery;
    private javax.swing.JLabel lblDeliveryCharges;
    private javax.swing.JLabel lblStatusEntryRiderName;
    private javax.swing.JLabel lblStatusType;
    private javax.swing.JTextField tfCashOnDelivery;
    private javax.swing.JTextField tfDeliveryCharges;
    // End of variables declaration//GEN-END:variables

    private void submitStatus()
    {
        boolean filled = true;
        if (cbStatusEntryRiderNameList.getSelectedIndex() == 0)
        {
            lblStatusEntryRiderName.setText("*Required");
            filled = false;
        }
        else
        {
            lblStatusEntryRiderName.setText("");
        }
        if (tfCashOnDelivery.getText().length() > 9)
        {
            lblCashOnDelivery.setText("Cash cannot be greater than 9 digits!");
            filled = false;
        }
        if (tfDeliveryCharges.getText().length() > 9)
        {
            lblDeliveryCharges.setText("Charges cannot be greater than 9 digits!");
            filled = false;
        }
        if (cbStatusType.getSelectedIndex() == 0)
        {
            lblStatusType.setText("*Required");
            filled = false;
        }
        else
        {
            lblStatusType.setText("");
        }
        if (cbStatusType.getSelectedIndex() == 1)
        {
            if (tfCashOnDelivery.getText().isEmpty())
            {
                lblCashOnDelivery.setText("*Required");
                filled = false;
            }
            if (tfDeliveryCharges.getText().isEmpty())
            {
                lblDeliveryCharges.setText("*Required");
                filled = false;
            }
        }
        if (cbStatusType.getSelectedIndex() == 2)
        {
            lblCashOnDelivery.setText("");
            if (tfDeliveryCharges.getText().isEmpty())
            {
                lblDeliveryCharges.setText("*Required");
                filled = false;
            }
        }
        if (cbStatusType.getSelectedIndex() == 3)
        {
            if (tfDeliveryCharges.getText().isEmpty())
            {
                tfCashOnDelivery.setText("0");
                tfDeliveryCharges.setText("0");
                lblDeliveryCharges.setText("");
            }
        }
        if (filled)
        {
            Object mainID = table.getValueAt(rowNumber, 0);
            Status status = new Status(new Rider("", 0, String.valueOf(cbStatusEntryRiderNameList.getSelectedItem()), "", ""), Integer.parseInt(tfCashOnDelivery.getText()), Integer.parseInt(tfDeliveryCharges.getText()), String.valueOf(cbStatusType.getSelectedItem()));
            int rowsAffected = dbc.insert(this, status, (Integer) mainID);
            if (rowsAffected > 0)
            {
                this.dispose();
                bindDataToTable(month, year);
            }
        }
    }
    
    private boolean bindDataToTable(int month, int year)
    {
        boolean result = false;
        try
        {
            ResultSet r = dbc.showDetail(this, month, year);
            ResultSet r2 = dbc.getDate(this);
            table.setRowCount(0);
            while ((r.next()) && (r2.next()))
            {
                result = true;
                NumberFormat nf = NumberFormat.getNumberInstance();
                table.addRow(new Object[]{r.getInt(1), String.valueOf(r2.getString(1)), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7), nf.format(r.getInt(8)), nf.format(r.getInt(9)), r.getString(10)});
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }
}