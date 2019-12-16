package framespackage;

import java.awt.BorderLayout;
import objectspackage.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.sql.*;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class AdminPanel extends javax.swing.JFrame
{

    private DBConnection dbc;
    private boolean flag;
    private int month;
    private int year;
    private String username;
    private String password;

    public AdminPanel()
    {
        initComponents();
        dbc = new DBConnection();
        dbc.connection(this);
        dbc.getRiderNames(this);
        dbc.RiderSalary(this);
        dbc.deleteDuplicateData(this);
        setBarChartData();
        setBarChart();
        btnSearchCustomerName.requestFocus();
        GregorianCalendar gc = new GregorianCalendar();
        month = gc.get(Calendar.MONTH) + 1;
        year = gc.get(Calendar.YEAR);
        bindDataToTable(month, year);
        if (tbDetails.getRowCount() > 0)
        {
            btnHomeAddRider.setEnabled(true);
            btnDeletePackage.setEnabled(true);
            btnDeleteAllPackages.setEnabled(true);
        }

        insertDatainMonthlyIncome(month, year);
    }

    public AdminPanel(String username, String password)
    {
        initComponents();
        dbc = new DBConnection();
        dbc.connection(this);
        dbc.getRiderNames(this);
        dbc.RiderSalary(this);
        dbc.deleteDuplicateData(this);
        setBarChartData();
        setBarChart();
        btnSearchCustomerName.requestFocus();
        GregorianCalendar gc = new GregorianCalendar();
        month = gc.get(Calendar.MONTH) + 1;
        year = gc.get(Calendar.YEAR);
        bindDataToTable(month, year);
        if (tbDetails.getRowCount() > 0)
        {
            btnHomeAddRider.setEnabled(true);
            btnDeletePackage.setEnabled(true);
            btnDeleteAllPackages.setEnabled(true);
        }

        insertDatainMonthlyIncome(month, year);
        
        this.username = username;
        this.password = password;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jfRiderSalary = new javax.swing.JFrame();
        pnlRiderSalary = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRiderSalary = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        lblPackageEntry = new javax.swing.JLabel();
        lblAddVendor = new javax.swing.JLabel();
        lblAddRider = new javax.swing.JLabel();
        lblVendorDetails = new javax.swing.JLabel();
        lblRiderDetails = new javax.swing.JLabel();
        lblHome = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        lblincome = new javax.swing.JLabel();
        pnlSuper = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetails = new javax.swing.JTable();
        monthChooser = new com.toedter.calendar.JMonthChooser();
        yearChooser = new com.toedter.calendar.JYearChooser();
        btnFetchData = new javax.swing.JButton();
        lblYear = new javax.swing.JLabel();
        lblNoDataFound = new javax.swing.JLabel();
        btnHomeAddRider = new javax.swing.JButton();
        tfSearchCustomerName = new javax.swing.JTextField();
        btnSearchCustomerName = new javax.swing.JButton();
        lblSearchCustomerName = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnDeleteAllPackages = new javax.swing.JButton();
        btnDeletePackage = new javax.swing.JButton();
        pnlPackageEntry = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        dcDateOfEntry = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        tfCustomerName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        cbVendorName = new javax.swing.JComboBox<>();
        tfCustomerPhone = new javax.swing.JFormattedTextField();
        lblDateOfEntry = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerPhone = new javax.swing.JLabel();
        lblVendorName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        pnlAddVendor = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tfVendorName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfVendorPhone = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        tfVendorResidentialAddress = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        tfVendorOfficeAddress = new javax.swing.JTextField();
        btnVendorSubmit = new javax.swing.JButton();
        lblAddVendorName = new javax.swing.JLabel();
        lblAddVendorPhone = new javax.swing.JLabel();
        lblAddVendorOfficeAddress = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        pnlAddRider = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfAddRiderName = new javax.swing.JTextField();
        lblAddRiderName = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        tfAddRiderPhone = new javax.swing.JFormattedTextField();
        lblAddRiderPhone = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        tfAddRiderCNIC = new javax.swing.JFormattedTextField();
        lblAddRiderCNIC = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        tfAddRiderDemandPerDelivery = new javax.swing.JTextField();
        lblDemandPerDelivery = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        tfAddRiderAddress = new javax.swing.JTextField();
        lblAddRiderAddress = new javax.swing.JLabel();
        btnSubmitAddRider = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        pnlVendorDetails = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblVendorDetail = new javax.swing.JTable();
        btnDeleteAllVendors = new javax.swing.JButton();
        btnDeleteVendor = new javax.swing.JButton();
        pnlRiderDetails = new javax.swing.JPanel();
        lblEnterYearForRiderDetails = new javax.swing.JLabel();
        cbRidersNameList = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRiderDetails = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taAddress = new javax.swing.JTextArea();
        tfName = new javax.swing.JTextField();
        tfPhone = new javax.swing.JTextField();
        tfCNIC = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfNumOfDeliveries = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfDemandPerDelivery = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        tfSalary = new javax.swing.JTextField();
        btnCalculateSalary = new javax.swing.JButton();
        mcRiderDetails = new com.toedter.calendar.JMonthChooser();
        ycRiderDetails = new com.toedter.calendar.JYearChooser();
        btnFetchDataOfRider = new javax.swing.JButton();
        lblRiderNameMissing = new javax.swing.JLabel();
        btnDeleteRider = new javax.swing.JButton();
        btnSalaries = new javax.swing.JButton();
        pnlMonthlyIncome = new javax.swing.JPanel();
        pnlBarChart = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblTotalDeliveries = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lblCostOfDeliveries = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        lblSumofDC = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblSumOfRiderSalary = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblPreviousMonthIncome = new javax.swing.JLabel();
        lblPreviousYear = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPreviousMonth = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        pnlLogo = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblHeading = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuHome = new javax.swing.JMenu();
        menuPackage = new javax.swing.JMenu();
        itemPackageEntry = new javax.swing.JMenuItem();
        menuVendor = new javax.swing.JMenu();
        itemAddVendor = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        itemVendorDetails = new javax.swing.JMenuItem();
        menuRider = new javax.swing.JMenu();
        itemAddRider = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        itemRiderDetails = new javax.swing.JMenuItem();
        menuMyProfile = new javax.swing.JMenu();
        itemChangePassword = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        itemLogOut = new javax.swing.JMenuItem();

        jfRiderSalary.setAlwaysOnTop(true);
        jfRiderSalary.setLocation(new java.awt.Point(340, 180));
        jfRiderSalary.setMinimumSize(new java.awt.Dimension(700, 489));
        jfRiderSalary.setUndecorated(true);
        jfRiderSalary.setResizable(false);

        pnlRiderSalary.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblRiderSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "Name", "CNIC", "Paid per Delivery", "No. of Deliveries", "Salary"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblRiderSalary);
        if (tblRiderSalary.getColumnModel().getColumnCount() > 0)
        {
            tblRiderSalary.getColumnModel().getColumn(2).setMinWidth(110);
            tblRiderSalary.getColumnModel().getColumn(2).setPreferredWidth(110);
            tblRiderSalary.getColumnModel().getColumn(2).setMaxWidth(110);
            tblRiderSalary.getColumnModel().getColumn(3).setMinWidth(110);
            tblRiderSalary.getColumnModel().getColumn(3).setPreferredWidth(110);
            tblRiderSalary.getColumnModel().getColumn(3).setMaxWidth(110);
            tblRiderSalary.getColumnModel().getColumn(4).setMinWidth(110);
            tblRiderSalary.getColumnModel().getColumn(4).setPreferredWidth(110);
            tblRiderSalary.getColumnModel().getColumn(4).setMaxWidth(110);
        }

        pnlRiderSalary.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 700, 437));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/CrossIcon.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel2MouseClicked(evt);
            }
        });
        pnlRiderSalary.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(661, 0, 40, 30));

        javax.swing.GroupLayout jfRiderSalaryLayout = new javax.swing.GroupLayout(jfRiderSalary.getContentPane());
        jfRiderSalary.getContentPane().setLayout(jfRiderSalaryLayout);
        jfRiderSalaryLayout.setHorizontalGroup(
            jfRiderSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 701, Short.MAX_VALUE)
            .addGroup(jfRiderSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jfRiderSalaryLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlRiderSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jfRiderSalaryLayout.setVerticalGroup(
            jfRiderSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(jfRiderSalaryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jfRiderSalaryLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlRiderSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(80, 20));
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(31, 184, 244));
        pnlMain.setPreferredSize(new java.awt.Dimension(1200, 640));
        pnlMain.setLayout(null);

        pnlMenu.setBackground(new java.awt.Color(26, 44, 71));
        pnlMenu.setForeground(new java.awt.Color(240, 240, 240));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPackageEntry.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblPackageEntry.setForeground(new java.awt.Color(255, 255, 255));
        lblPackageEntry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/Package.png"))); // NOI18N
        lblPackageEntry.setText("  Package Entry");
        lblPackageEntry.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPackageEntry.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblPackageEntryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblPackageEntryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblPackageEntryMouseExited(evt);
            }
        });
        pnlMenu.add(lblPackageEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, 40));

        lblAddVendor.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblAddVendor.setForeground(new java.awt.Color(240, 240, 240));
        lblAddVendor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/Add User.png"))); // NOI18N
        lblAddVendor.setText("  Add Vendor");
        lblAddVendor.setToolTipText("");
        lblAddVendor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddVendor.setPreferredSize(new java.awt.Dimension(159, 27));
        lblAddVendor.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblAddVendorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAddVendorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAddVendorMouseExited(evt);
            }
        });
        pnlMenu.add(lblAddVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 40));

        lblAddRider.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblAddRider.setForeground(new java.awt.Color(240, 240, 240));
        lblAddRider.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/Add User.png"))); // NOI18N
        lblAddRider.setText("  Add Rider");
        lblAddRider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddRider.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblAddRiderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblAddRiderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblAddRiderMouseExited(evt);
            }
        });
        pnlMenu.add(lblAddRider, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 170, 40));

        lblVendorDetails.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblVendorDetails.setForeground(new java.awt.Color(240, 240, 240));
        lblVendorDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/User info.png"))); // NOI18N
        lblVendorDetails.setText("  Vendor Details");
        lblVendorDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblVendorDetails.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblVendorDetailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblVendorDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblVendorDetailsMouseExited(evt);
            }
        });
        pnlMenu.add(lblVendorDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 170, 40));

        lblRiderDetails.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblRiderDetails.setForeground(new java.awt.Color(240, 240, 240));
        lblRiderDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/User info.png"))); // NOI18N
        lblRiderDetails.setText("  Rider Details");
        lblRiderDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRiderDetails.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblRiderDetailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblRiderDetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblRiderDetailsMouseExited(evt);
            }
        });
        pnlMenu.add(lblRiderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 170, 40));

        lblHome.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/Home.png"))); // NOI18N
        lblHome.setText("  Home");
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblHome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt)
            {
                lblHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt)
            {
                lblHomeMouseExited(evt);
            }
        });
        pnlMenu.add(lblHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, 40));
        pnlMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 170, 10));
        pnlMenu.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, 10));
        pnlMenu.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 170, 10));
        pnlMenu.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 170, 10));
        pnlMenu.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 170, 10));
        pnlMenu.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, 10));

        lblincome.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        lblincome.setForeground(new java.awt.Color(255, 255, 255));
        lblincome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/Money.png"))); // NOI18N
        lblincome.setText("  Income Details");
        lblincome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblincome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                lblincomeMouseClicked(evt);
            }
        });
        pnlMenu.add(lblincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 160, 40));

        pnlMain.add(pnlMenu);
        pnlMenu.setBounds(0, -1, 210, 640);

        pnlSuper.setBackground(new java.awt.Color(0, 140, 208));
        pnlSuper.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlSuper.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlSuper.setLayout(new java.awt.CardLayout());

        pnlHome.setBackground(new java.awt.Color(31, 184, 244));
        pnlHome.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlHome.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "C. No", "Date", "Customer Name", "Customer Ph#", "Address", "Vendor", "Rider", "COD", "DC", "Status"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tbDetails.setRowHeight(20);
        jScrollPane1.setViewportView(tbDetails);
        if (tbDetails.getColumnModel().getColumnCount() > 0)
        {
            tbDetails.getColumnModel().getColumn(0).setMinWidth(30);
            tbDetails.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbDetails.getColumnModel().getColumn(1).setMinWidth(50);
            tbDetails.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbDetails.getColumnModel().getColumn(2).setMinWidth(80);
            tbDetails.getColumnModel().getColumn(2).setPreferredWidth(80);
            tbDetails.getColumnModel().getColumn(4).setMinWidth(120);
            tbDetails.getColumnModel().getColumn(4).setPreferredWidth(120);
            tbDetails.getColumnModel().getColumn(5).setMinWidth(80);
            tbDetails.getColumnModel().getColumn(5).setPreferredWidth(80);
            tbDetails.getColumnModel().getColumn(6).setMinWidth(80);
            tbDetails.getColumnModel().getColumn(6).setPreferredWidth(80);
            tbDetails.getColumnModel().getColumn(7).setMinWidth(30);
            tbDetails.getColumnModel().getColumn(7).setPreferredWidth(30);
            tbDetails.getColumnModel().getColumn(8).setMinWidth(30);
            tbDetails.getColumnModel().getColumn(8).setPreferredWidth(30);
            tbDetails.getColumnModel().getColumn(9).setMinWidth(40);
            tbDetails.getColumnModel().getColumn(9).setPreferredWidth(40);
        }

        pnlHome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 105, 1050, 350));

        monthChooser.setForeground(new java.awt.Color(255, 255, 255));
        monthChooser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlHome.add(monthChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 140, 30));
        pnlHome.add(yearChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 90, 30));

        btnFetchData.setBackground(new java.awt.Color(102, 153, 255));
        btnFetchData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFetchData.setForeground(new java.awt.Color(255, 255, 255));
        btnFetchData.setText("Fetch Data");
        btnFetchData.setMaximumSize(new java.awt.Dimension(109, 31));
        btnFetchData.setMinimumSize(new java.awt.Dimension(109, 31));
        btnFetchData.setPreferredSize(new java.awt.Dimension(109, 31));
        btnFetchData.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFetchDataActionPerformed(evt);
            }
        });
        pnlHome.add(btnFetchData, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 120, -1));

        lblYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblYear.setForeground(new java.awt.Color(255, 0, 0));
        pnlHome.add(lblYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 40, 70, 20));

        lblNoDataFound.setBackground(new java.awt.Color(255, 255, 255));
        lblNoDataFound.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblNoDataFound.setForeground(java.awt.Color.red);
        pnlHome.add(lblNoDataFound, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 200, 30));

        btnHomeAddRider.setBackground(new java.awt.Color(102, 153, 255));
        btnHomeAddRider.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHomeAddRider.setForeground(new java.awt.Color(255, 255, 255));
        btnHomeAddRider.setText("Add Status");
        btnHomeAddRider.setEnabled(false);
        btnHomeAddRider.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnHomeAddRiderActionPerformed(evt);
            }
        });
        pnlHome.add(btnHomeAddRider, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        tfSearchCustomerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfSearchCustomerName.setText("Customer Name");
        tfSearchCustomerName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                tfSearchCustomerNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt)
            {
                tfSearchCustomerNameFocusLost(evt);
            }
        });
        tfSearchCustomerName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfSearchCustomerNameKeyTyped(evt);
            }
        });
        pnlHome.add(tfSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, -1));

        btnSearchCustomerName.setBackground(new java.awt.Color(102, 153, 255));
        btnSearchCustomerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSearchCustomerName.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCustomerName.setText("Search");
        btnSearchCustomerName.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSearchCustomerNameActionPerformed(evt);
            }
        });
        pnlHome.add(btnSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 90, 30));

        lblSearchCustomerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSearchCustomerName.setForeground(java.awt.Color.red);
        pnlHome.add(lblSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 140, 30));

        btnRefresh.setBackground(new java.awt.Color(102, 153, 255));
        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRefreshActionPerformed(evt);
            }
        });
        pnlHome.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 460, -1, -1));

        btnDeleteAllPackages.setBackground(new java.awt.Color(102, 153, 255));
        btnDeleteAllPackages.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteAllPackages.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAllPackages.setText("Delete All");
        btnDeleteAllPackages.setEnabled(false);
        btnDeleteAllPackages.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteAllPackagesActionPerformed(evt);
            }
        });
        pnlHome.add(btnDeleteAllPackages, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 460, 110, -1));

        btnDeletePackage.setBackground(new java.awt.Color(102, 153, 255));
        btnDeletePackage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeletePackage.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletePackage.setText("Delete");
        btnDeletePackage.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeletePackageActionPerformed(evt);
            }
        });
        pnlHome.add(btnDeletePackage, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, 90, -1));

        pnlSuper.add(pnlHome, "card3");

        pnlPackageEntry.setBackground(new java.awt.Color(31, 184, 244));
        pnlPackageEntry.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlPackageEntry.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlPackageEntry.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(2, 63, 120));
        jLabel1.setText("Enter New Package Details:");
        pnlPackageEntry.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 610, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 63, 120));
        jLabel10.setText("Date of Entry");
        pnlPackageEntry.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 30));

        dcDateOfEntry.setDateFormatString("d MMM yyyy");
        dcDateOfEntry.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        pnlPackageEntry.add(dcDateOfEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 220, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(2, 63, 120));
        jLabel11.setText("Customer Name");
        pnlPackageEntry.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, -1));

        tfCustomerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCustomerName.addFocusListener(new java.awt.event.FocusAdapter()
        {
            public void focusGained(java.awt.event.FocusEvent evt)
            {
                tfCustomerNameFocusGained(evt);
            }
        });
        tfCustomerName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfCustomerNameKeyTyped(evt);
            }
        });
        pnlPackageEntry.add(tfCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 220, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(2, 63, 120));
        jLabel12.setText("Customer Phone#");
        pnlPackageEntry.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 274, 167, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(2, 63, 120));
        jLabel13.setText("Vendor Name");
        pnlPackageEntry.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        tfAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddress.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAddressKeyTyped(evt);
            }
        });
        pnlPackageEntry.add(tfAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 381, 490, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(2, 63, 120));
        jLabel14.setText("Address");
        pnlPackageEntry.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 78, -1));

        btnSubmit.setBackground(new java.awt.Color(102, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitActionPerformed(evt);
            }
        });
        pnlPackageEntry.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, -1, -1));

        cbVendorName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbVendorName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Name" }));
        cbVendorName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                cbVendorNameKeyTyped(evt);
            }
        });
        pnlPackageEntry.add(cbVendorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 220, 30));

        try
        {
            tfCustomerPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0### #######")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        tfCustomerPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCustomerPhone.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfCustomerPhoneKeyTyped(evt);
            }
        });
        pnlPackageEntry.add(tfCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 220, 30));

        lblDateOfEntry.setForeground(java.awt.Color.red);
        pnlPackageEntry.add(lblDateOfEntry, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        lblCustomerName.setForeground(java.awt.Color.red);
        pnlPackageEntry.add(lblCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        lblCustomerPhone.setForeground(java.awt.Color.red);
        pnlPackageEntry.add(lblCustomerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        lblVendorName.setForeground(java.awt.Color.red);
        pnlPackageEntry.add(lblVendorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        lblAddress.setForeground(java.awt.Color.red);
        pnlPackageEntry.add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(2, 63, 120));
        jSeparator4.setOpaque(true);
        pnlPackageEntry.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 65, 590, 5));

        pnlSuper.add(pnlPackageEntry, "card3");

        pnlAddVendor.setBackground(new java.awt.Color(31, 184, 244));
        pnlAddVendor.setToolTipText("");
        pnlAddVendor.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlAddVendor.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlAddVendor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(2, 63, 120));
        jLabel3.setText("Enter New Vendor Details:");
        pnlAddVendor.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 590, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(2, 63, 120));
        jLabel15.setText("Name");
        pnlAddVendor.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        tfVendorName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfVendorName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfVendorNameKeyTyped(evt);
            }
        });
        pnlAddVendor.add(tfVendorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 240, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(2, 63, 120));
        jLabel16.setText("Phone#");
        pnlAddVendor.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        try
        {
            tfVendorPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0### #######")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        tfVendorPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfVendorPhone.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfVendorPhoneKeyTyped(evt);
            }
        });
        pnlAddVendor.add(tfVendorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 240, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(2, 63, 120));
        jLabel17.setText("Residential Address");
        pnlAddVendor.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        tfVendorResidentialAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfVendorResidentialAddress.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfVendorResidentialAddressKeyTyped(evt);
            }
        });
        pnlAddVendor.add(tfVendorResidentialAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 510, 30));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(2, 63, 120));
        jLabel18.setText("Office Address");
        pnlAddVendor.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        tfVendorOfficeAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfVendorOfficeAddress.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfVendorOfficeAddressKeyTyped(evt);
            }
        });
        pnlAddVendor.add(tfVendorOfficeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 510, 30));

        btnVendorSubmit.setBackground(new java.awt.Color(102, 153, 255));
        btnVendorSubmit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnVendorSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnVendorSubmit.setText("Submit");
        btnVendorSubmit.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVendorSubmitActionPerformed(evt);
            }
        });
        pnlAddVendor.add(btnVendorSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, -1, -1));

        lblAddVendorName.setForeground(java.awt.Color.red);
        pnlAddVendor.add(lblAddVendorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        lblAddVendorPhone.setForeground(java.awt.Color.red);
        pnlAddVendor.add(lblAddVendorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        lblAddVendorOfficeAddress.setForeground(java.awt.Color.red);
        pnlAddVendor.add(lblAddVendorOfficeAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 320, -1, -1));

        jSeparator9.setBackground(new java.awt.Color(2, 63, 120));
        jSeparator9.setOpaque(true);
        pnlAddVendor.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 10));

        pnlSuper.add(pnlAddVendor, "card3");

        pnlAddRider.setBackground(new java.awt.Color(31, 184, 244));
        pnlAddRider.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlAddRider.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlAddRider.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 63, 120));
        jLabel4.setText("Enter New Rider Details:");
        pnlAddRider.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 490, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(2, 63, 120));
        jLabel6.setText("Name");
        pnlAddRider.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        tfAddRiderName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddRiderName.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAddRiderNameKeyTyped(evt);
            }
        });
        pnlAddRider.add(tfAddRiderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 300, -1));

        lblAddRiderName.setForeground(java.awt.Color.red);
        pnlAddRider.add(lblAddRiderName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(2, 63, 120));
        jLabel26.setText("Phone#");
        pnlAddRider.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        try
        {
            tfAddRiderPhone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("0### #######")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        tfAddRiderPhone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddRiderPhone.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAddRiderPhoneKeyTyped(evt);
            }
        });
        pnlAddRider.add(tfAddRiderPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 300, -1));

        lblAddRiderPhone.setForeground(java.awt.Color.red);
        pnlAddRider.add(lblAddRiderPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, -1));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(2, 63, 120));
        jLabel27.setText("CNIC");
        pnlAddRider.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        try
        {
            tfAddRiderCNIC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-#######-#")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }
        tfAddRiderCNIC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddRiderCNIC.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAddRiderCNICKeyTyped(evt);
            }
        });
        pnlAddRider.add(tfAddRiderCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 300, -1));

        lblAddRiderCNIC.setForeground(java.awt.Color.red);
        pnlAddRider.add(lblAddRiderCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(2, 63, 120));
        jLabel28.setText("Demand Per Delivery");
        pnlAddRider.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        tfAddRiderDemandPerDelivery.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddRiderDemandPerDelivery.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAddRiderDemandPerDeliveryKeyTyped(evt);
            }
        });
        pnlAddRider.add(tfAddRiderDemandPerDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 300, -1));

        lblDemandPerDelivery.setForeground(java.awt.Color.red);
        pnlAddRider.add(lblDemandPerDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(2, 63, 120));
        jLabel29.setText("Address");
        pnlAddRider.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        tfAddRiderAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfAddRiderAddress.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                tfAddRiderAddressKeyTyped(evt);
            }
        });
        pnlAddRider.add(tfAddRiderAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 520, -1));

        lblAddRiderAddress.setForeground(java.awt.Color.red);
        pnlAddRider.add(lblAddRiderAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        btnSubmitAddRider.setBackground(new java.awt.Color(102, 153, 255));
        btnSubmitAddRider.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSubmitAddRider.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmitAddRider.setText("ADD");
        btnSubmitAddRider.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSubmitAddRiderActionPerformed(evt);
            }
        });
        pnlAddRider.add(btnSubmitAddRider, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(2, 63, 120));
        jSeparator1.setOpaque(true);
        pnlAddRider.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 78, 480, 5));

        pnlSuper.add(pnlAddRider, "card3");

        pnlVendorDetails.setBackground(new java.awt.Color(31, 184, 244));
        pnlVendorDetails.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlVendorDetails.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlVendorDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVendorDetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblVendorDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "S. No ", "Name", "Phone #", "Residential Address", "Office Address"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tblVendorDetail.setRowHeight(30);
        jScrollPane4.setViewportView(tblVendorDetail);
        if (tblVendorDetail.getColumnModel().getColumnCount() > 0)
        {
            tblVendorDetail.getColumnModel().getColumn(0).setMinWidth(1);
            tblVendorDetail.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblVendorDetail.getColumnModel().getColumn(1).setMinWidth(1);
            tblVendorDetail.getColumnModel().getColumn(1).setPreferredWidth(1);
            tblVendorDetail.getColumnModel().getColumn(2).setMinWidth(1);
            tblVendorDetail.getColumnModel().getColumn(2).setPreferredWidth(1);
            tblVendorDetail.getColumnModel().getColumn(3).setMinWidth(150);
            tblVendorDetail.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblVendorDetail.getColumnModel().getColumn(4).setMinWidth(150);
            tblVendorDetail.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        pnlVendorDetails.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 980, 410));

        btnDeleteAllVendors.setBackground(new java.awt.Color(102, 153, 255));
        btnDeleteAllVendors.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteAllVendors.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteAllVendors.setText("Delete All");
        btnDeleteAllVendors.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteAllVendorsActionPerformed(evt);
            }
        });
        pnlVendorDetails.add(btnDeleteAllVendors, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, -1, -1));

        btnDeleteVendor.setBackground(new java.awt.Color(102, 153, 255));
        btnDeleteVendor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteVendor.setText("Delete");
        btnDeleteVendor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteVendorActionPerformed(evt);
            }
        });
        pnlVendorDetails.add(btnDeleteVendor, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 460, 90, -1));

        pnlSuper.add(pnlVendorDetails, "card3");

        pnlRiderDetails.setBackground(new java.awt.Color(31, 184, 244));
        pnlRiderDetails.setForeground(new java.awt.Color(255, 255, 255));
        pnlRiderDetails.setMinimumSize(new java.awt.Dimension(1000, 510));
        pnlRiderDetails.setPreferredSize(new java.awt.Dimension(1000, 510));
        pnlRiderDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEnterYearForRiderDetails.setForeground(java.awt.Color.red);
        pnlRiderDetails.add(lblEnterYearForRiderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        cbRidersNameList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbRidersNameList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Rider" }));
        cbRidersNameList.addItemListener(new java.awt.event.ItemListener()
        {
            public void itemStateChanged(java.awt.event.ItemEvent evt)
            {
                cbRidersNameListItemStateChanged(evt);
            }
        });
        cbRidersNameList.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cbRidersNameListActionPerformed(evt);
            }
        });
        pnlRiderDetails.add(cbRidersNameList, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 30));

        tblRiderDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "C. No", "Date", "Customer Name", "Address", "Vendor", "Status"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblRiderDetails);

        pnlRiderDetails.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 780, 380));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(2, 63, 120));
        jLabel19.setText("Name:");
        pnlRiderDetails.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(2, 63, 120));
        jLabel20.setText("Phone#:");
        pnlRiderDetails.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(2, 63, 120));
        jLabel21.setText("CNIC:");
        pnlRiderDetails.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(2, 63, 120));
        jLabel22.setText("Address:");
        pnlRiderDetails.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        taAddress.setEditable(false);
        taAddress.setColumns(20);
        taAddress.setRows(5);
        jScrollPane3.setViewportView(taAddress);

        pnlRiderDetails.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 250, -1));

        tfName.setEditable(false);
        pnlRiderDetails.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 250, 30));

        tfPhone.setEditable(false);
        pnlRiderDetails.add(tfPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 250, 30));

        tfCNIC.setEditable(false);
        pnlRiderDetails.add(tfCNIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 250, 30));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(2, 63, 120));
        jLabel23.setText("No. of Deliveries");
        pnlRiderDetails.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 460, -1, -1));

        tfNumOfDeliveries.setEditable(false);
        pnlRiderDetails.add(tfNumOfDeliveries, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 60, 33));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(2, 63, 120));
        jLabel24.setText("Paid Per Delivery");
        pnlRiderDetails.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, -1, -1));

        tfDemandPerDelivery.setEditable(false);
        pnlRiderDetails.add(tfDemandPerDelivery, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 60, 33));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(2, 63, 120));
        jLabel25.setText("Salary");
        pnlRiderDetails.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, 30));

        tfSalary.setEditable(false);
        tfSalary.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pnlRiderDetails.add(tfSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 150, 33));

        btnCalculateSalary.setBackground(new java.awt.Color(102, 153, 255));
        btnCalculateSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalculateSalary.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculateSalary.setText("Calculate");
        btnCalculateSalary.setEnabled(false);
        btnCalculateSalary.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCalculateSalaryActionPerformed(evt);
            }
        });
        pnlRiderDetails.add(btnCalculateSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 450, -1, 30));

        mcRiderDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pnlRiderDetails.add(mcRiderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 120, 30));
        pnlRiderDetails.add(ycRiderDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 70, 30));

        btnFetchDataOfRider.setBackground(new java.awt.Color(102, 153, 255));
        btnFetchDataOfRider.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnFetchDataOfRider.setForeground(new java.awt.Color(255, 255, 255));
        btnFetchDataOfRider.setText("Fetch Data");
        btnFetchDataOfRider.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnFetchDataOfRiderActionPerformed(evt);
            }
        });
        pnlRiderDetails.add(btnFetchDataOfRider, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 30));

        lblRiderNameMissing.setForeground(java.awt.Color.red);
        pnlRiderDetails.add(lblRiderNameMissing, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        btnDeleteRider.setBackground(new java.awt.Color(102, 153, 255));
        btnDeleteRider.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteRider.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteRider.setText("Delete");
        btnDeleteRider.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnDeleteRiderActionPerformed(evt);
            }
        });
        pnlRiderDetails.add(btnDeleteRider, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        btnSalaries.setBackground(new java.awt.Color(102, 153, 255));
        btnSalaries.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalaries.setForeground(new java.awt.Color(255, 255, 255));
        btnSalaries.setText("Salaries");
        btnSalaries.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSalariesActionPerformed(evt);
            }
        });
        pnlRiderDetails.add(btnSalaries, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        pnlSuper.add(pnlRiderDetails, "card3");

        pnlMonthlyIncome.setBackground(new java.awt.Color(31, 184, 244));
        pnlMonthlyIncome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBarChart.setLayout(new java.awt.BorderLayout());
        pnlMonthlyIncome.add(pnlBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 810, 350));

        jLabel30.setBackground(new java.awt.Color(0, 0, 0));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(2, 63, 120));
        jLabel30.setText("Last Month's Summary");
        pnlMonthlyIncome.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 180, 30));

        jLabel31.setBackground(new java.awt.Color(0, 0, 0));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(2, 63, 120));
        jLabel31.setText("Total No. of Deliveries");
        pnlMonthlyIncome.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 130, 30));

        lblTotalDeliveries.setBackground(new java.awt.Color(0, 0, 0));
        lblTotalDeliveries.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTotalDeliveries.setForeground(new java.awt.Color(2, 63, 120));
        lblTotalDeliveries.setText("jLabel");
        pnlMonthlyIncome.add(lblTotalDeliveries, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 50, 30));

        jLabel32.setBackground(new java.awt.Color(0, 0, 0));
        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(2, 63, 120));
        jLabel32.setText("Total Cost of Deliveries");
        pnlMonthlyIncome.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 140, 30));

        lblCostOfDeliveries.setBackground(new java.awt.Color(0, 0, 0));
        lblCostOfDeliveries.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCostOfDeliveries.setForeground(new java.awt.Color(2, 63, 120));
        lblCostOfDeliveries.setText("jLabel");
        pnlMonthlyIncome.add(lblCostOfDeliveries, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 40, 30));

        jLabel33.setBackground(new java.awt.Color(0, 0, 0));
        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(2, 63, 120));
        jLabel33.setText("Sum of Delivery Charges");
        pnlMonthlyIncome.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, 30));

        lblSumofDC.setBackground(new java.awt.Color(0, 0, 0));
        lblSumofDC.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSumofDC.setForeground(new java.awt.Color(2, 63, 120));
        lblSumofDC.setText("jLabel");
        pnlMonthlyIncome.add(lblSumofDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 40, 30));

        jLabel35.setBackground(new java.awt.Color(0, 0, 0));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(2, 63, 120));
        jLabel35.setText("Sum of All Rider's Salary");
        pnlMonthlyIncome.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 150, 30));

        lblSumOfRiderSalary.setBackground(new java.awt.Color(0, 0, 0));
        lblSumOfRiderSalary.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSumOfRiderSalary.setForeground(new java.awt.Color(2, 63, 120));
        lblSumOfRiderSalary.setText("jLabel");
        pnlMonthlyIncome.add(lblSumOfRiderSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 40, 30));

        jLabel37.setBackground(new java.awt.Color(0, 0, 0));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(2, 63, 120));
        jLabel37.setText("Income");
        pnlMonthlyIncome.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 60, 30));

        lblPreviousMonthIncome.setBackground(new java.awt.Color(0, 0, 0));
        lblPreviousMonthIncome.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPreviousMonthIncome.setForeground(new java.awt.Color(2, 63, 120));
        lblPreviousMonthIncome.setText("jLabel");
        pnlMonthlyIncome.add(lblPreviousMonthIncome, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 40, 30));

        lblPreviousYear.setBackground(new java.awt.Color(255, 255, 255));
        lblPreviousYear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPreviousYear.setForeground(new java.awt.Color(2, 63, 120));
        lblPreviousYear.setText("jLabel5");
        pnlMonthlyIncome.add(lblPreviousYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(2, 63, 120));
        jLabel7.setText("Month : ");
        pnlMonthlyIncome.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        lblPreviousMonth.setBackground(new java.awt.Color(255, 255, 255));
        lblPreviousMonth.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPreviousMonth.setForeground(new java.awt.Color(2, 63, 120));
        lblPreviousMonth.setText("jLabel5");
        pnlMonthlyIncome.add(lblPreviousMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(2, 63, 120));
        jLabel36.setText("Year : ");
        pnlMonthlyIncome.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(2, 63, 120));
        pnlMonthlyIncome.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, 10));

        pnlSuper.add(pnlMonthlyIncome, "card3");

        pnlMain.add(pnlSuper);
        pnlSuper.setBounds(218, 120, 1070, 520);

        pnlLogo.setBackground(new java.awt.Color(2, 63, 120));
        pnlLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framespackage/logoBike.png"))); // NOI18N
        pnlLogo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 88));

        lblHeading.setBackground(new java.awt.Color(63, 63, 63));
        lblHeading.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setText("Packages Details");
        pnlLogo.add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 397, -1));

        pnlMain.add(pnlLogo);
        pnlLogo.setBounds(210, 30, 1090, 80);

        menuHome.setText("Home");
        menuHome.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                menuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuHome);

        menuPackage.setText("Package");

        itemPackageEntry.setText("Package Entry");
        itemPackageEntry.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemPackageEntryActionPerformed(evt);
            }
        });
        menuPackage.add(itemPackageEntry);

        jMenuBar1.add(menuPackage);

        menuVendor.setText("Vendor");

        itemAddVendor.setText("Add Vendor");
        itemAddVendor.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemAddVendorActionPerformed(evt);
            }
        });
        menuVendor.add(itemAddVendor);
        menuVendor.add(jSeparator10);

        itemVendorDetails.setText("Vendor Details");
        itemVendorDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemVendorDetailsActionPerformed(evt);
            }
        });
        menuVendor.add(itemVendorDetails);

        jMenuBar1.add(menuVendor);

        menuRider.setText("Rider");

        itemAddRider.setText("Add Rider");
        itemAddRider.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemAddRiderActionPerformed(evt);
            }
        });
        menuRider.add(itemAddRider);
        menuRider.add(jSeparator11);

        itemRiderDetails.setText("Rider Details");
        itemRiderDetails.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemRiderDetailsActionPerformed(evt);
            }
        });
        menuRider.add(itemRiderDetails);

        jMenuBar1.add(menuRider);

        menuMyProfile.setText("My Profile");

        itemChangePassword.setText("Change Password");
        itemChangePassword.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemChangePasswordActionPerformed(evt);
            }
        });
        menuMyProfile.add(itemChangePassword);
        menuMyProfile.add(jSeparator12);

        itemLogOut.setText("Log Out");
        itemLogOut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                itemLogOutActionPerformed(evt);
            }
        });
        menuMyProfile.add(itemLogOut);

        jMenuBar1.add(menuMyProfile);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1291, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblPackageEntryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPackageEntryMouseClicked
        packageEntry();
    }//GEN-LAST:event_lblPackageEntryMouseClicked

    private void lblAddVendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddVendorMouseClicked
        addVendor();
    }//GEN-LAST:event_lblAddVendorMouseClicked

    private void lblAddRiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddRiderMouseClicked
        addRider();
    }//GEN-LAST:event_lblAddRiderMouseClicked

    private void lblVendorDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendorDetailsMouseClicked
        vendorDetails();
    }//GEN-LAST:event_lblVendorDetailsMouseClicked

    private void lblRiderDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiderDetailsMouseClicked
        dbc.getRiderNames(this);
        dbc.RiderSalary(this);
        dbc.deleteDuplicateData(this);
        riderDetails();
    }//GEN-LAST:event_lblRiderDetailsMouseClicked

    private void lblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseClicked
        home();
    }//GEN-LAST:event_lblHomeMouseClicked

    private void lblPackageEntryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPackageEntryMouseEntered
        lblPackageEntry.setOpaque(true);
        lblPackageEntry.setBackground(new Color(148, 198, 247));
    }//GEN-LAST:event_lblPackageEntryMouseEntered

    private void lblPackageEntryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPackageEntryMouseExited
        lblPackageEntry.setOpaque(false);
        lblPackageEntry.setBackground(new Color(1, 37, 73));
    }//GEN-LAST:event_lblPackageEntryMouseExited

    private void lblAddVendorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddVendorMouseEntered
        lblAddVendor.setOpaque(true);
        lblAddVendor.setBackground(new Color(148, 198, 247));
    }//GEN-LAST:event_lblAddVendorMouseEntered

    private void lblAddRiderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddRiderMouseEntered
        lblAddRider.setOpaque(true);
        lblAddRider.setBackground(new Color(148, 198, 247));
    }//GEN-LAST:event_lblAddRiderMouseEntered

    private void lblVendorDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendorDetailsMouseEntered
        lblVendorDetails.setOpaque(true);
        lblVendorDetails.setBackground(new Color(148, 198, 247));
    }//GEN-LAST:event_lblVendorDetailsMouseEntered

    private void lblRiderDetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiderDetailsMouseEntered
        lblRiderDetails.setOpaque(true);
        lblRiderDetails.setBackground(new Color(148, 198, 247));
    }//GEN-LAST:event_lblRiderDetailsMouseEntered

    private void lblAddVendorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddVendorMouseExited
        lblAddVendor.setOpaque(false);
        lblAddVendor.setBackground(new Color(1, 37, 73));
    }//GEN-LAST:event_lblAddVendorMouseExited

    private void lblAddRiderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddRiderMouseExited
        lblAddRider.setOpaque(false);
        lblAddRider.setBackground(new Color(1, 37, 73));
    }//GEN-LAST:event_lblAddRiderMouseExited

    private void lblVendorDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVendorDetailsMouseExited
        lblVendorDetails.setOpaque(false);
        lblVendorDetails.setBackground(new Color(1, 37, 73));
    }//GEN-LAST:event_lblVendorDetailsMouseExited

    private void lblRiderDetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRiderDetailsMouseExited
        lblRiderDetails.setOpaque(false);
        lblRiderDetails.setBackground(new Color(1, 37, 73));
    }//GEN-LAST:event_lblRiderDetailsMouseExited

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        submitPackage();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void tfCustomerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCustomerNameKeyTyped
        lblCustomerName.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(Character.isWhitespace(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfCustomerName.getText().trim().isEmpty())
            {
                lblCustomerName.setText("*Required");
                tfCustomerName.setText("");
                tfCustomerName.requestFocus();
            } else if (tfCustomerName.getText().length() < 3)
            {
                lblCustomerName.setText("Name must contain atleast 3 characters!");
                tfCustomerName.requestFocus();
            } else
            {
                tfCustomerPhone.requestFocus();
            }
        }
    }//GEN-LAST:event_tfCustomerNameKeyTyped

    private void tfCustomerPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCustomerPhoneKeyTyped
        lblCustomerPhone.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfCustomerPhone.getText().trim().length() == 1)
            {
                lblCustomerPhone.setText("*Required");
                tfCustomerPhone.requestFocus();
            } else if ((tfCustomerPhone.getText().trim().length()) < 12)
            {
                lblCustomerPhone.setText("Invalid Number!");
                tfCustomerPhone.requestFocus();
            } else
            {
                cbVendorName.requestFocus();
                flag = false;
            }
        }
    }//GEN-LAST:event_tfCustomerPhoneKeyTyped

    private void cbVendorNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbVendorNameKeyTyped
        char c = evt.getKeyChar();
        if (flag && (c == KeyEvent.VK_ENTER))
        {
            cbVendorName.hidePopup();
            tfAddress.requestFocus();
            lblVendorName.setText("");
        } else if (c == KeyEvent.VK_ENTER)
        {
            cbVendorName.showPopup();
            flag = true;
        }
    }//GEN-LAST:event_cbVendorNameKeyTyped

    private void tfAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddressKeyTyped
        lblAddress.setText("");
        lblVendorName.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfAddress.getText().trim().isEmpty())
            {
                lblAddress.setText("*Required");
                tfAddress.requestFocus();
                tfAddress.setText("");
            } else
            {
                submitPackage();
            }
        }
    }//GEN-LAST:event_tfAddressKeyTyped

    private void btnVendorSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendorSubmitActionPerformed
        submitVendor();
    }//GEN-LAST:event_btnVendorSubmitActionPerformed

    private void btnFetchDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchDataActionPerformed
        int m = monthChooser.getMonth() + 1;
        int y = yearChooser.getYear();
        if (y == 2)
        {
            lblYear.setText("Enter Year!");
            lblNoDataFound.setText("");
        } else
        {
            lblYear.setText("");
            boolean result = bindDataToTable(m, y);
            if (result)
            {
                lblNoDataFound.setText("");
            } else
            {
                lblNoDataFound.setText("No Data Found!");
            }
        }
    }//GEN-LAST:event_btnFetchDataActionPerformed

    private void lblHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseEntered
        lblHome.setOpaque(true);
        lblHome.setBackground(new Color(148, 198, 247));
    }//GEN-LAST:event_lblHomeMouseEntered

    private void lblHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHomeMouseExited
        lblHome.setOpaque(false);
        lblHome.setBackground(new Color(1, 37, 73));
    }//GEN-LAST:event_lblHomeMouseExited

    private void btnFetchDataOfRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchDataOfRiderActionPerformed
        if (cbRidersNameList.getSelectedItem().equals("Select Rider"))
        {
            lblRiderNameMissing.setText("Select rider first!");
            lblEnterYearForRiderDetails.setText("");
        } else if (ycRiderDetails.getYear() == 2)
        {
            lblEnterYearForRiderDetails.setText("Enter Year!");
            tfName.setText("");
            tfPhone.setText("");
            tfCNIC.setText("");
            taAddress.setText("");
            tfDemandPerDelivery.setText("");
        } else
        {
            try
            {
                DefaultTableModel dtm = (DefaultTableModel) tblRiderDetails.getModel();
                lblEnterYearForRiderDetails.setText("");
                Rider rider = dbc.getDetail(this, String.valueOf(cbRidersNameList.getSelectedItem()));
                if (rider != null)
                {
                    tfName.setText(rider.getName());
                    tfPhone.setText(rider.getPhone());
                    tfCNIC.setText(rider.getCNIC());
                    taAddress.setText(rider.getResidentialAddress());
                    tfDemandPerDelivery.setText(String.valueOf(rider.getDemandPerDelivery()));
                    ResultSet r = dbc.getDetail(this, rider.getName(), mcRiderDetails.getMonth() + 1, ycRiderDetails.getYear());
                    boolean ans = r.next();
                    if (!ans)
                    {
                        lblEnterYearForRiderDetails.setText("Data not found!");
                        dtm.setRowCount(0);
                        tfNumOfDeliveries.setText("");
                        tfSalary.setText("");
                        btnCalculateSalary.setEnabled(false);
                    } else
                    {
                        dtm.setRowCount(0);
                        r.beforeFirst();
                        ResultSet r2 = dbc.getDate(this, mcRiderDetails.getMonth() + 1, ycRiderDetails.getYear());
                        while ((r.next()) && (r2.next()))
                        {
                            dtm.addRow(new Object[]
                            {
                                r.getInt("MainID"), r2.getString("Date"), r.getString("CustomerName"), r.getString("Address"), r.getString("VendorName"), r.getString("Status")
                            });
                        }
                        tfNumOfDeliveries.setText(dtm.getRowCount() + "");
                        btnCalculateSalary.setEnabled(true);
                    }
                }
            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnFetchDataOfRiderActionPerformed

    private void cbRidersNameListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbRidersNameListItemStateChanged
        lblRiderNameMissing.setText("");
    }//GEN-LAST:event_cbRidersNameListItemStateChanged

    private void btnCalculateSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateSalaryActionPerformed
        int demandPerDelivery = Integer.parseInt(tfDemandPerDelivery.getText());
        int numberOfDeliveries = Integer.parseInt(tfNumOfDeliveries.getText());
        int salary = demandPerDelivery * numberOfDeliveries;
        NumberFormat nf = NumberFormat.getNumberInstance();
        tfSalary.setText(nf.format(salary));
    }//GEN-LAST:event_btnCalculateSalaryActionPerformed

    private void itemChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemChangePasswordActionPerformed
        ChangePassword cp = new ChangePassword(username, password);
        cp.setVisible(true);
    }//GEN-LAST:event_itemChangePasswordActionPerformed

    private void itemLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLogOutActionPerformed
        Close close = new Close(this);
        close.setVisible(true);
    }//GEN-LAST:event_itemLogOutActionPerformed

    private void tfCustomerNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCustomerNameFocusGained
        if (dcDateOfEntry.getDate() != null)
        {
            lblDateOfEntry.setText("");
        }
    }//GEN-LAST:event_tfCustomerNameFocusGained

    private void itemPackageEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPackageEntryActionPerformed
        packageEntry();
    }//GEN-LAST:event_itemPackageEntryActionPerformed

    private void itemAddVendorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddVendorActionPerformed
        addVendor();
    }//GEN-LAST:event_itemAddVendorActionPerformed

    private void itemVendorDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVendorDetailsActionPerformed
        vendorDetails();
    }//GEN-LAST:event_itemVendorDetailsActionPerformed

    private void itemAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAddRiderActionPerformed
        addRider();
    }//GEN-LAST:event_itemAddRiderActionPerformed

    private void itemRiderDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRiderDetailsActionPerformed
        riderDetails();
    }//GEN-LAST:event_itemRiderDetailsActionPerformed

    private void tfVendorNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVendorNameKeyTyped
        lblAddVendorName.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(Character.isWhitespace(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfVendorName.getText().trim().isEmpty())
            {
                lblAddVendorName.setText("*Required");
                tfVendorName.setText("");
                tfVendorName.requestFocus();
            } else if (tfVendorName.getText().length() < 3)
            {
                lblAddVendorName.setText("Name must contain atleast 3 characters!");
                tfVendorName.requestFocus();
            } else
            {
                tfVendorPhone.requestFocus();
            }
        }
    }//GEN-LAST:event_tfVendorNameKeyTyped

    private void tfVendorPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVendorPhoneKeyTyped
        lblAddVendorPhone.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfVendorPhone.getText().trim().length() == 1)
            {
                lblAddVendorPhone.setText("*Required");
            } else if ((tfVendorPhone.getText().trim().length()) < 12)
            {
                lblAddVendorPhone.setText("Invalid Number!");
            } else
            {
                tfVendorResidentialAddress.requestFocus();
            }
        }
    }//GEN-LAST:event_tfVendorPhoneKeyTyped

    private void tfVendorResidentialAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVendorResidentialAddressKeyTyped
        lblAddVendorOfficeAddress.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfVendorResidentialAddress.getText().trim().isEmpty())
            {
                tfVendorResidentialAddress.setText("None");
                tfVendorOfficeAddress.requestFocus();
            } else
            {
                tfVendorOfficeAddress.requestFocus();
            }
        }
    }//GEN-LAST:event_tfVendorResidentialAddressKeyTyped

    private void tfVendorOfficeAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfVendorOfficeAddressKeyTyped
        lblAddVendorOfficeAddress.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            submitVendor();
        }
    }//GEN-LAST:event_tfVendorOfficeAddressKeyTyped

    private void tfAddRiderNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddRiderNameKeyTyped
        lblAddRiderName.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(Character.isWhitespace(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfAddRiderName.getText().trim().isEmpty())
            {
                lblAddRiderName.setText("*Required");
                tfAddRiderName.setText("");
                tfAddRiderName.requestFocus();
            } else if (tfAddRiderName.getText().length() < 3)
            {
                lblAddRiderName.setText("Name must contain atleast 3 characters!");
                tfAddRiderName.requestFocus();
            } else
            {
                boolean result = dbc.hasRider(this, tfAddRiderName.getText().trim());
                if (result)
                {
                    lblAddRiderName.setText("This Name is already registered!");
                    tfAddRiderName.requestFocus();
                } else
                {
                    tfAddRiderPhone.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_tfAddRiderNameKeyTyped

    private void tfAddRiderPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddRiderPhoneKeyTyped
        lblAddRiderPhone.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfAddRiderPhone.getText().trim().length() == 1)
            {
                lblAddRiderPhone.setText("*Required");
                tfAddRiderPhone.requestFocus();
            } else if ((tfAddRiderPhone.getText().trim().length()) < 12)
            {
                lblAddRiderPhone.setText("Invalid Number!");
                tfAddRiderPhone.requestFocus();
            } else
            {
                tfAddRiderCNIC.requestFocus();
            }
        }
    }//GEN-LAST:event_tfAddRiderPhoneKeyTyped

    private void tfAddRiderCNICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddRiderCNICKeyTyped
        lblAddRiderCNIC.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfAddRiderCNIC.getText().equals("     -       - "))
            {
                lblAddRiderCNIC.setText("*Required");
                tfAddRiderCNIC.requestFocus();
            } else if (tfAddRiderCNIC.getText().trim().length() < 15)
            {
                lblAddRiderCNIC.setText("Invalid CNIC!");
                tfAddRiderCNIC.requestFocus();
            } else
            {
                boolean result = dbc.hasCNIC(this, tfAddRiderCNIC.getText(), "rider");
                if (result)
                {
                    lblAddRiderCNIC.setText("This CNIC is already registered!");
                    tfAddRiderCNIC.requestFocus();
                } else
                {
                    lblAddRiderCNIC.setText("");
                    tfAddRiderDemandPerDelivery.requestFocus();
                }
            }
        }
    }//GEN-LAST:event_tfAddRiderCNICKeyTyped

    private void tfAddRiderAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddRiderAddressKeyTyped
        lblAddRiderAddress.setText("");
        char c = evt.getKeyChar();
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfAddRiderAddress.getText().trim().isEmpty())
            {
                lblAddRiderAddress.setText("*Required");
                tfAddRiderAddress.requestFocus();
                tfAddRiderAddress.setText("");
            } else
            {
                submitRider();
            }
        }
    }//GEN-LAST:event_tfAddRiderAddressKeyTyped

    private void btnSubmitAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitAddRiderActionPerformed
        submitRider();
    }//GEN-LAST:event_btnSubmitAddRiderActionPerformed

    private void tfAddRiderDemandPerDeliveryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAddRiderDemandPerDeliveryKeyTyped
        lblDemandPerDelivery.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            if (tfAddRiderDemandPerDelivery.getText().isEmpty())
            {
                lblDemandPerDelivery.setText("*Required");
                tfAddRiderDemandPerDelivery.requestFocus();
            } else if (Integer.parseInt(tfAddRiderDemandPerDelivery.getText()) == 0)
            {
                lblDemandPerDelivery.setText("Demand must be greater than zero!");
                tfAddRiderDemandPerDelivery.requestFocus();
            } else if (tfAddRiderDemandPerDelivery.getText().length() > 9)
            {
                lblDemandPerDelivery.setText("Demand cannot be greater than 9 digits!");
                tfAddRiderDemandPerDelivery.requestFocus();
            } else
            {
                tfAddRiderAddress.requestFocus();
            }
        }
    }//GEN-LAST:event_tfAddRiderDemandPerDeliveryKeyTyped

    private void btnHomeAddRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeAddRiderActionPerformed
        int row = tbDetails.getSelectedRow();
        if (row < 0)
        {
            JOptionPane.showMessageDialog(this, "Select row first!", "Error", JOptionPane.ERROR_MESSAGE);
        } else
        {
            DefaultTableModel table = (DefaultTableModel) tbDetails.getModel();
            StatusEntry statusEntry = new StatusEntry(row, table);
            statusEntry.setVisible(true);
        }
    }//GEN-LAST:event_btnHomeAddRiderActionPerformed

    private void menuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuHomeMouseClicked
        home();
    }//GEN-LAST:event_menuHomeMouseClicked

    private void tfSearchCustomerNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchCustomerNameFocusGained
        lblSearchCustomerName.setText("");
        if (tfSearchCustomerName.getText().equals("Customer Name"))
        {
            tfSearchCustomerName.setText("");
        }
    }//GEN-LAST:event_tfSearchCustomerNameFocusGained

    private void btnSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerNameActionPerformed
        searchCustomerName();
    }//GEN-LAST:event_btnSearchCustomerNameActionPerformed

    private void tfSearchCustomerNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfSearchCustomerNameFocusLost
        if (tfSearchCustomerName.getText().trim().isEmpty())
        {
            tfSearchCustomerName.setText("Customer Name");
        }
    }//GEN-LAST:event_tfSearchCustomerNameFocusLost

    private void tfSearchCustomerNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchCustomerNameKeyTyped
        lblSearchCustomerName.setText("");
        char c = evt.getKeyChar();
        if (!(Character.isAlphabetic(c)) && !(Character.isWhitespace(c)))
        {
            evt.consume();
        }
        if (c == KeyEvent.VK_ENTER)
        {
            searchCustomerName();
        }
    }//GEN-LAST:event_tfSearchCustomerNameKeyTyped

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        lblHeading.setText("Home");
        pnlHome.setVisible(true);
        monthChooser.setMonth(month - 1);
        yearChooser.setYear(year);
        tfSearchCustomerName.setText("Customer Name");
        lblSearchCustomerName.setText("");
        lblNoDataFound.setText("");
        lblYear.setText("");
        btnSearchCustomerName.requestFocus();
        bindDataToTable(month, year);
        btnDeletePackage.setEnabled(false);
        if (tbDetails.getRowCount() > 0)
        {
            btnHomeAddRider.setEnabled(true);
            btnDeletePackage.setEnabled(true);
            btnDeleteAllPackages.setEnabled(true);
        }
        pnlAddRider.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlRiderDetails.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteAllPackagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllPackagesActionPerformed
        int yes = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete all packages?\nThis action cannot be undone!", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (yes == 0)
        {
            DefaultTableModel dtm = (DefaultTableModel) tbDetails.getModel();
            dbc.deleteAllPackages(this);
            dtm.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Deleted Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAllPackagesActionPerformed

    private void btnDeleteAllVendorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllVendorsActionPerformed
        int yes = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete all Vendors?\nThis action cannot be undone!", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (yes == 0)
        {
            DefaultTableModel dtm = (DefaultTableModel) tblVendorDetail.getModel();
            dbc.deleteAllVendors(this);
            dtm.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Deleted Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAllVendorsActionPerformed

    private void btnDeleteRiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteRiderActionPerformed
        String riderName = (String) cbRidersNameList.getSelectedItem();
        if (!(riderName.equals("Select Rider")))
        {
            int yes = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete Rider?\nThis action cannot be undone!", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (yes == 0)
            {
                int rowsAffected = dbc.deleteRider(this, riderName);
                if (rowsAffected > 0)
                {
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                    tfName.setText("");
                    tfPhone.setText("");
                    tfCNIC.setText("");
                    taAddress.setText("");
                    tfDemandPerDelivery.setText("");
                    tfNumOfDeliveries.setText("");
                    tfSalary.setText("");
                    lblEnterYearForRiderDetails.setText("");
                    lblRiderNameMissing.setText("");
                    cbRidersNameList.removeAllItems();
                    DefaultComboBoxModel model = new DefaultComboBoxModel(new String[]
                    {
                        "Select Rider"
                    });
                    cbRidersNameList.setModel(model);
                    dbc.getRiderNameList(this, cbRidersNameList);
                    btnDeleteRider.setText("Delete");
                    btnCalculateSalary.setEnabled(false);
                    DefaultTableModel dtm = (DefaultTableModel) tblRiderDetails.getModel();
                    dtm.setRowCount(0);
                } else
                {
                    JOptionPane.showMessageDialog(this, "Deletion Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteRiderActionPerformed

    private void cbRidersNameListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRidersNameListActionPerformed
        if (!(String.valueOf(cbRidersNameList.getSelectedItem()).equals("Select Rider")))
        {
            btnDeleteRider.setText("Delete " + String.valueOf(cbRidersNameList.getSelectedItem()));
        }
    }//GEN-LAST:event_cbRidersNameListActionPerformed

    private void btnDeletePackageActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeletePackageActionPerformed
    {//GEN-HEADEREND:event_btnDeletePackageActionPerformed
        int row = tbDetails.getSelectedRow();
        if (row < 0)
        {
            JOptionPane.showMessageDialog(this, "Select row first!", "Error", JOptionPane.ERROR_MESSAGE);
        } else
        {
            int yes = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this package?\nThis action cannot be undone!", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (yes == 0)
            {
                DefaultTableModel dtm = (DefaultTableModel) tbDetails.getModel();
                int ID = (Integer) dtm.getValueAt(row, 0);
                int rowsAffected = dbc.deletePackage(this, ID);
                if (rowsAffected > 0)
                {
                    bindDataToTable(month, year);
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else
                {
                    JOptionPane.showMessageDialog(this, "Deletion Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnDeletePackageActionPerformed

    private void btnSalariesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSalariesActionPerformed
    {//GEN-HEADEREND:event_btnSalariesActionPerformed
        bindDataToRiderSalaryTable(month, year);
        jfRiderSalary.setVisible(true);
    }//GEN-LAST:event_btnSalariesActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel2MouseClicked
    {//GEN-HEADEREND:event_jLabel2MouseClicked
        jfRiderSalary.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnDeleteVendorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDeleteVendorActionPerformed
    {//GEN-HEADEREND:event_btnDeleteVendorActionPerformed
        int row = tblVendorDetail.getSelectedRow();
        if (row < 0)
        {
            JOptionPane.showMessageDialog(this, "Select row first!", "Error", JOptionPane.ERROR_MESSAGE);
        } else
        {
            int yes = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this Vendor?\nThis action cannot be undone!", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (yes == 0)
            {
                DefaultTableModel dtm = (DefaultTableModel) tblVendorDetail.getModel();
                int ID = (Integer) dtm.getValueAt(row, 0);
                int rowsAffected = dbc.deleteVendor(this, ID);
                if (rowsAffected > 0)
                {
                    bindDataToVendorTable();
                    JOptionPane.showMessageDialog(this, "Deleted Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
                } else
                {
                    JOptionPane.showMessageDialog(this, "Deletion Failed!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnDeleteVendorActionPerformed

    private void lblincomeMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_lblincomeMouseClicked
    {//GEN-HEADEREND:event_lblincomeMouseClicked
        setIncomeDetails(month, year);
        monthlyIncome();
    }//GEN-LAST:event_lblincomeMouseClicked

    private boolean searchCustomerName()
    {
        boolean hasRow = false;
        if ((tfSearchCustomerName.getText().equals("Customer Name")) || (tfSearchCustomerName.getText().trim().isEmpty()))
        {
            lblSearchCustomerName.setText("Enter Name!");
        } else
        {
            try
            {
                ResultSet r = dbc.getCustomerData(this, tfSearchCustomerName.getText().trim());
                ResultSet r2 = dbc.getDate(this, tfSearchCustomerName.getText().trim());
                DefaultTableModel dtm = (DefaultTableModel) tbDetails.getModel();
                dtm.setRowCount(0);
                while ((r.next()) && (r2.next()))
                {
                    hasRow = true;
                    NumberFormat nf = NumberFormat.getNumberInstance();
                    dtm.addRow(new Object[]
                    {
                        r.getInt(1), String.valueOf(r2.getString(1)), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7), nf.format(r.getInt(8)), nf.format(r.getInt(9)), r.getString(10)
                    });
                }
                if (!hasRow)
                {
                    lblSearchCustomerName.setText("Data Not Found!");
                }
            } catch (SQLException ex)
            {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return hasRow;
    }

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(AdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new AdminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateSalary;
    private javax.swing.JButton btnDeleteAllPackages;
    private javax.swing.JButton btnDeleteAllVendors;
    private javax.swing.JButton btnDeletePackage;
    private javax.swing.JButton btnDeleteRider;
    private javax.swing.JButton btnDeleteVendor;
    private javax.swing.JButton btnFetchData;
    private javax.swing.JButton btnFetchDataOfRider;
    private javax.swing.JButton btnHomeAddRider;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSalaries;
    private javax.swing.JButton btnSearchCustomerName;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnSubmitAddRider;
    private javax.swing.JButton btnVendorSubmit;
    private javax.swing.JComboBox<String> cbRidersNameList;
    private javax.swing.JComboBox<String> cbVendorName;
    private com.toedter.calendar.JDateChooser dcDateOfEntry;
    private javax.swing.JMenuItem itemAddRider;
    private javax.swing.JMenuItem itemAddVendor;
    private javax.swing.JMenuItem itemChangePassword;
    private javax.swing.JMenuItem itemLogOut;
    private javax.swing.JMenuItem itemPackageEntry;
    private javax.swing.JMenuItem itemRiderDetails;
    private javax.swing.JMenuItem itemVendorDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JFrame jfRiderSalary;
    private javax.swing.JLabel lblAddRider;
    private javax.swing.JLabel lblAddRiderAddress;
    private javax.swing.JLabel lblAddRiderCNIC;
    private javax.swing.JLabel lblAddRiderName;
    private javax.swing.JLabel lblAddRiderPhone;
    private javax.swing.JLabel lblAddVendor;
    private javax.swing.JLabel lblAddVendorName;
    private javax.swing.JLabel lblAddVendorOfficeAddress;
    private javax.swing.JLabel lblAddVendorPhone;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCostOfDeliveries;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerPhone;
    private javax.swing.JLabel lblDateOfEntry;
    private javax.swing.JLabel lblDemandPerDelivery;
    private javax.swing.JLabel lblEnterYearForRiderDetails;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblNoDataFound;
    private javax.swing.JLabel lblPackageEntry;
    private javax.swing.JLabel lblPreviousMonth;
    private javax.swing.JLabel lblPreviousMonthIncome;
    private javax.swing.JLabel lblPreviousYear;
    private javax.swing.JLabel lblRiderDetails;
    private javax.swing.JLabel lblRiderNameMissing;
    private javax.swing.JLabel lblSearchCustomerName;
    private javax.swing.JLabel lblSumOfRiderSalary;
    private javax.swing.JLabel lblSumofDC;
    private javax.swing.JLabel lblTotalDeliveries;
    private javax.swing.JLabel lblVendorDetails;
    private javax.swing.JLabel lblVendorName;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblincome;
    private com.toedter.calendar.JMonthChooser mcRiderDetails;
    private javax.swing.JMenu menuHome;
    private javax.swing.JMenu menuMyProfile;
    private javax.swing.JMenu menuPackage;
    private javax.swing.JMenu menuRider;
    private javax.swing.JMenu menuVendor;
    private com.toedter.calendar.JMonthChooser monthChooser;
    private javax.swing.JPanel pnlAddRider;
    private javax.swing.JPanel pnlAddVendor;
    private javax.swing.JPanel pnlBarChart;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlMonthlyIncome;
    private javax.swing.JPanel pnlPackageEntry;
    private javax.swing.JPanel pnlRiderDetails;
    private javax.swing.JPanel pnlRiderSalary;
    private javax.swing.JPanel pnlSuper;
    private javax.swing.JPanel pnlVendorDetails;
    private javax.swing.JTextArea taAddress;
    private javax.swing.JTable tbDetails;
    private javax.swing.JTable tblRiderDetails;
    private javax.swing.JTable tblRiderSalary;
    private javax.swing.JTable tblVendorDetail;
    private javax.swing.JTextField tfAddRiderAddress;
    private javax.swing.JFormattedTextField tfAddRiderCNIC;
    private javax.swing.JTextField tfAddRiderDemandPerDelivery;
    private javax.swing.JTextField tfAddRiderName;
    private javax.swing.JFormattedTextField tfAddRiderPhone;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfCNIC;
    private javax.swing.JTextField tfCustomerName;
    private javax.swing.JFormattedTextField tfCustomerPhone;
    private javax.swing.JTextField tfDemandPerDelivery;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfNumOfDeliveries;
    private javax.swing.JTextField tfPhone;
    private javax.swing.JTextField tfSalary;
    private javax.swing.JTextField tfSearchCustomerName;
    private javax.swing.JTextField tfVendorName;
    private javax.swing.JTextField tfVendorOfficeAddress;
    private javax.swing.JFormattedTextField tfVendorPhone;
    private javax.swing.JTextField tfVendorResidentialAddress;
    private com.toedter.calendar.JYearChooser ycRiderDetails;
    private com.toedter.calendar.JYearChooser yearChooser;
    // End of variables declaration//GEN-END:variables

    private boolean bindDataToTable(int month, int year)
    {
        boolean result = false;
        try
        {
            DefaultTableModel tableModel = (DefaultTableModel) tbDetails.getModel();
            ResultSet r = dbc.showDetail(this, month, year);
            ResultSet r2 = dbc.getDate(this);
            tableModel.setRowCount(0);
            while ((r.next()) && (r2.next()))
            {
                result = true;
                NumberFormat nf = NumberFormat.getNumberInstance();
                tableModel.addRow(new Object[]
                {
                    r.getInt(1), String.valueOf(r2.getString(1)), r.getString(3), r.getString(4), r.getString(5), r.getString(6), r.getString(7), nf.format(r.getInt(8)), nf.format(r.getInt(9)), r.getString(10)
                });
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return result;
    }

    private void packageEntry()
    {
        lblHeading.setText("Package Entry");
        pnlPackageEntry.setVisible(true);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String date = sdf.format(d);
        d = new Date(date);
        dcDateOfEntry.setDate(d);
        tfCustomerName.requestFocus();
        cbVendorName.removeAllItems();
        DefaultComboBoxModel model = new DefaultComboBoxModel(new String[]
        {
            "Select Name"
        });
        cbVendorName.setModel(model);
        dbc.getVendorNameList(this, cbVendorName);
        pnlHome.setVisible(false);
        pnlAddRider.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlRiderDetails.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }

    private void addVendor()
    {
        tfVendorName.requestFocus();
        lblHeading.setText("Add Vendor");
        pnlAddVendor.setVisible(true);
        pnlHome.setVisible(false);
        pnlAddRider.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlRiderDetails.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }

    private void addRider()
    {
        lblHeading.setText("Add Rider");
        pnlAddRider.setVisible(true);
        pnlHome.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlRiderDetails.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }

    private void vendorDetails()
    {
        lblHeading.setText("Vendor Details");
        pnlVendorDetails.setVisible(true);
        btnDeleteVendor.setEnabled(false);
        btnDeleteAllVendors.setEnabled(false);
        bindDataToVendorTable();
        if (tblVendorDetail.getRowCount() > 0)
        {
            btnDeleteVendor.setEnabled(true);
            btnDeleteAllVendors.setEnabled(true);
        }
        pnlHome.setVisible(false);
        pnlAddRider.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlRiderDetails.setVisible(false);
    }

    private void riderDetails()
    {
        lblHeading.setText("Rider Details");
        pnlRiderDetails.setVisible(true);
        cbRidersNameList.removeAllItems();
        DefaultComboBoxModel model = new DefaultComboBoxModel(new String[]
        {
            "Select Rider"
        });
        cbRidersNameList.setModel(model);
        dbc.getRiderNameList(this, cbRidersNameList);
        btnDeleteRider.setText("Delete");
        pnlHome.setVisible(false);
        pnlAddRider.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }

    private void home()
    {
        lblHeading.setText("Home");
        lblYear.setText("");
        pnlHome.setVisible(true);
        lblNoDataFound.setText("");
        monthChooser.setMonth(month - 1);
        yearChooser.setYear(year);
        bindDataToTable(month, year);
        btnDeletePackage.setEnabled(false);
        btnDeleteAllPackages.setEnabled(false);
        btnHomeAddRider.setEnabled(false);
        if (tbDetails.getRowCount() > 0)
        {
            btnHomeAddRider.setEnabled(true);
            btnDeletePackage.setEnabled(true);
            btnDeleteAllPackages.setEnabled(true);
        }
        btnSearchCustomerName.requestFocus();
        pnlAddRider.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlRiderDetails.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }

    private void monthlyIncome()
    {
        lblHeading.setText("Monthly Income");
        pnlMonthlyIncome.setVisible(true);
        pnlHome.setVisible(false);
        pnlAddRider.setVisible(false);
        pnlAddVendor.setVisible(false);
        pnlPackageEntry.setVisible(false);
        pnlRiderDetails.setVisible(false);
        pnlRiderSalary.setVisible(false);
        pnlVendorDetails.setVisible(false);
    }

    private void submitPackage()
    {
        boolean filled = true;
        if (dcDateOfEntry.getDate() == null)
        {
            lblDateOfEntry.setText("*Required");
            filled = false;
        }
        if (tfCustomerName.getText().trim().isEmpty())
        {
            lblCustomerName.setText("*Required");
            tfCustomerName.setText("");
            tfCustomerName.requestFocus();
            filled = false;
        } else if (tfCustomerName.getText().length() < 3)
        {
            lblCustomerName.setText("Name must contain atleast 3 characters!");
            filled = false;
        }
        if (tfCustomerPhone.getText().equals("0           "))
        {
            lblCustomerPhone.setText("*Required");
            filled = false;
        }
        if (String.valueOf(cbVendorName.getSelectedItem()).equals("Select Name"))
        {
            lblVendorName.setText("*Required");
            filled = false;
        }
        if (tfAddress.getText().trim().isEmpty())
        {
            lblAddress.setText("*Required");
            tfAddress.setText("");
            filled = false;
        }
        if (filled)
        {
            Date d = dcDateOfEntry.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(d);
            Customer customer = new Customer(tfCustomerName.getText().trim(), tfCustomerPhone.getText(), tfAddress.getText().trim());
            Vendor vendor = new Vendor("", String.valueOf(cbVendorName.getSelectedItem()), "", "");
            PackageEntry pe = new PackageEntry(date, customer, vendor);
            int rowsAffected = dbc.insert(this, pe);
            if (rowsAffected > 0)
            {
                lblDateOfEntry.setText("");
                lblCustomerName.setText("");
                lblCustomerPhone.setText("");
                lblVendorName.setText("");
                lblAddress.setText("");
                tfCustomerName.setText("");
                tfCustomerPhone.setText("");
                tfAddress.setText("");
            }
        }
    }

    private void submitVendor()
    {
        boolean filled = true;
        if (tfVendorName.getText().trim().isEmpty())
        {
            lblAddVendorName.setText("*Required");
            tfVendorName.setText("");
            tfVendorName.requestFocus();
            filled = false;
        } else if (tfVendorName.getText().length() < 3)
        {
            lblAddVendorName.setText("Name must contain atleast 3 characters!");
            tfVendorName.requestFocus();
            filled = false;
        }
        if (tfVendorPhone.getText().equals("0           "))
        {
            lblAddVendorPhone.setText("*Required");
            filled = false;
        }
        if (tfVendorResidentialAddress.getText().equals("None") && tfVendorOfficeAddress.getText().trim().isEmpty())
        {
            lblAddVendorOfficeAddress.setText("Enter atleast 1 address!");
            filled = false;
        }
        if (tfVendorResidentialAddress.getText().trim().isEmpty() && tfVendorOfficeAddress.getText().trim().isEmpty())
        {
            lblAddVendorOfficeAddress.setText("Enter atleast 1 address!");
            filled = false;
        }
        if (tfVendorResidentialAddress.getText().equals("None") && tfVendorOfficeAddress.getText().equals("None"))
        {
            lblAddVendorOfficeAddress.setText("Enter atleast 1 address!");
            filled = false;
        }
        if (filled)
        {
            if (tfVendorResidentialAddress.getText().trim().isEmpty())
            {
                tfVendorResidentialAddress.setText("None");
            }
            if (tfVendorOfficeAddress.getText().trim().isEmpty())
            {
                tfVendorOfficeAddress.setText("None");
            }
            Vendor vendor = new Vendor(tfVendorOfficeAddress.getText().trim(), tfVendorName.getText().trim(), tfVendorPhone.getText(), tfVendorResidentialAddress.getText().trim());
            int rowsAffected = dbc.insert(this, vendor);
            if (rowsAffected > 0)
            {
                tfVendorName.setText("");
                tfVendorPhone.setText("");
                tfVendorResidentialAddress.setText("");
                tfVendorOfficeAddress.setText("");
            }
        }
    }

    private void submitRider()
    {
        boolean filled = true;
        if (tfAddRiderName.getText().trim().isEmpty())
        {
            lblAddRiderName.setText("*Required");
            tfAddRiderName.setText("");
            filled = false;
        } else if (tfAddRiderName.getText().length() < 3)
        {
            lblAddRiderName.setText("Name must contain atleast 3 characters!");
            filled = false;
        }
        if (tfAddRiderPhone.getText().equals("0           "))
        {
            lblAddRiderPhone.setText("*Required");
            filled = false;
        }
        if (tfAddRiderCNIC.getText().equals("     -       - "))
        {
            lblAddRiderCNIC.setText("*Required");
            filled = false;
        }
        if (tfAddRiderDemandPerDelivery.getText().isEmpty())
        {
            lblDemandPerDelivery.setText("*Required");
            filled = false;
        }
        if (tfAddRiderDemandPerDelivery.getText().length() > 9)
        {
            lblDemandPerDelivery.setText("Demand cannot be greater than 9 digits!");
            filled = false;
        }
        if (tfAddRiderAddress.getText().trim().isEmpty())
        {
            lblAddRiderAddress.setText("*Required");
            tfAddRiderAddress.setText("");
            filled = false;
        }
        if (filled)
        {
            Rider rider = new Rider(tfAddRiderCNIC.getText(), Integer.parseInt(tfAddRiderDemandPerDelivery.getText()), tfAddRiderName.getText().trim(), tfAddRiderPhone.getText(), tfAddRiderAddress.getText().trim());
            int rowsAffected = dbc.insert(this, rider);
            if (rowsAffected > 0)
            {
                tfAddRiderName.setText("");
                tfAddRiderPhone.setText("");
                tfAddRiderCNIC.setText("");
                tfAddRiderDemandPerDelivery.setText("");
                tfAddRiderAddress.setText("");
            }
        }
    }

    private void bindDataToVendorTable()
    {
        try
        {
            ResultSet r = dbc.getVendorDetail(this);
            DefaultTableModel dtm = (DefaultTableModel) tblVendorDetail.getModel();
            dtm.setRowCount(0);
            while (r.next())
            {
                dtm.addRow(new Object[]
                {
                    r.getInt(1), r.getString(2), r.getString(3), r.getString(4), r.getString(5)
                });
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void bindDataToRiderSalaryTable(int month, int year)
    {

        if (month == 1)
        {
            month += 11;
            year--;
        } else
        {
            month--;
        }

        try
        {
            DefaultTableModel dtm = (DefaultTableModel) tblRiderSalary.getModel();
            dtm.setRowCount(0);
            ResultSet r = dbc.showSalaryDetail(this, month, year);
            while (r.next())
            {
                dtm.addRow(new Object[]
                {
                    r.getString(1), r.getString(2), r.getInt(3), r.getInt(4), r.getInt(5)
                });
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void insertDatainMonthlyIncome(int month, int year)
    {
        if (month == 1)
        {
            month += 11;
            year--;
        } else
        {
            month--;
        }

        dbc.insertIntoMonthlyIncome(this, month, year);
        dbc.deleteDuplicatesFromIncome(this);
        dbc.insertIncome(this, month, year);
    }

    private void setIncomeDetails(int month, int year)
    {
        if (month == 1)
        {
            month += 11;
            year--;
        } else
        {
            month--;
        }

        try
        {
            ResultSet r = dbc.getIncomeDetails(this, month, year);
            if (r.next())
            {
                lblPreviousMonth.setText(r.getString(1));
                lblPreviousYear.setText(r.getString(2));
                lblTotalDeliveries.setText(String.valueOf(r.getInt(3)));
                lblCostOfDeliveries.setText(String.valueOf(r.getInt(4)));
                lblSumofDC.setText(String.valueOf(r.getInt(5)));
                lblSumOfRiderSalary.setText(String.valueOf(r.getInt(6)));
                lblPreviousMonthIncome.setText(String.valueOf(r.getInt(7)));
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setBarChartData()
    {
        String[] monthArray = new String[13];
        int[] incomeArray = new int[13];

        try
        {
            ResultSet r = dbc.getDataForBarChart(this);
            int i = 0;
            r.afterLast();
            while (r.previous())
            {
                monthArray[i] = r.getString(1);
                incomeArray[i] = r.getInt(2);
                i++;
            }
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        System.out.println("Month\tIncome");

        for (int i = 0; i < 13; i++)
        {
            System.out.println(monthArray[i] + "\t" + incomeArray[i]);
        }
    }

    private CategoryDataset createDataSet()
    {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        try
        {
            ResultSet r = dbc.getDataForBarChart(this);
            r.afterLast();
            while (r.previous())
            {
                dataset.setValue(r.getInt(2), "Income", r.getString(1));
            }
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return dataset;
    }

    private void setBarChart()
    {
        JFreeChart barChart = ChartFactory.createBarChart("Income Summary", "Months", "Income", createDataSet(), PlotOrientation.VERTICAL, true, true, false);
        CategoryPlot plot = barChart.getCategoryPlot();
        plot.setRangeGridlinesVisible(true);
        ChartPanel barPanel = new ChartPanel(barChart);
        pnlBarChart.removeAll();
        pnlBarChart.add(barPanel,BorderLayout.CENTER);
        pnlBarChart.validate();
    }
}
