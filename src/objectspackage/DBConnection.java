package objectspackage;

import java.awt.Component;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class DBConnection
{
    private Connection c;
    private Statement s;
    private ResultSet r;
    
    ArrayList <String> name = new ArrayList <String>();

    public void connection(Component parentComponent)
    {
        try
        {
            String url = "jdbc:sqlserver://HAIER-PC:1433;databaseName=QuickExpressService";
            String user = "sa";
            String password = "sbsansari";
            c = DriverManager.getConnection(url, user, password);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int changePassword(Component parentComponent, User user)
    {
        int rowsAffected = 0;
        try
        {
            String query = "update MyUser set Password='" + user.getPassword() + "' where Username='" + user.getUsername()+ "'";
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(parentComponent, "Password changed successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Password changing failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public void close(Component parentComponent)
    {
        try
        {
            if (r != null)
            {
                r.close();
            }
            if (s != null)
            {
                s.close();
            }
            if (c != null)
            {
                c.close();
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ResultSet showDetail(Component parentComponent, int month, int year)
    {
        try
        {
            String query = "select * from Main where month([Date]) = " + month + " and year([Date]) = " + year;
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public ResultSet getDate(Component parentComponent)
    {
        try
        {
            String queryForDate = "select CONVERT(varchar,[Date],106) as [Date] from Main";
            s = c.createStatement();
            r = s.executeQuery(queryForDate);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public ResultSet getDate(Component parentComponent, String customerName)
    {
        try
        {
            String query = "select CONVERT(varchar,[Date],106) as [Date] from Main where CustomerName = '" + customerName + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public int insert(Component parentComponent, PackageEntry packageEntry)
    {
        int rowsAffected = 0;
        try
        {
            String query = "insert into Main values ('" + packageEntry.getDate() + "','" + packageEntry.getCustomer().getName() + "','" + packageEntry.getCustomer().getPhone() + "','" + packageEntry.getCustomer().getResidentialAddress() + "','" + packageEntry.getVendor().getName() + "','',0,0,'Pending')";
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(parentComponent, "Data inserted successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Insertion failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public void getVendorNameList(Component parentComponent, JComboBox<String> cbVendorName)
    {
        try
        {
            String query = "select Name from Vendor";
            s = c.createStatement();
            r = s.executeQuery(query);
            while (r.next())
            {
                cbVendorName.addItem(r.getString("Name"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int insert(Component parentComponent, User user)
    {
        int rowsAffected = 0;
        try
        {
            String query = "insert into MyUser values ('" + user.getUsername() + "','" + user.getPassword() + "','" + user.getCNIC() + "')";
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public boolean isUser(Component parentComponent, String username, String password)
    {
        boolean flag = false;
        try
        {
            String query = "select Username,[Password] from MyUser";
            s = c.createStatement();
            r = s.executeQuery(query);
            while (r.next())
            {
                User u = new User(r.getString("Username"), r.getString("Password"));
                if ((username.equals(u.getUsername())) && (password.equals(u.getPassword())))
                {
                    flag = true;
                    break;
                }
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public User hasCNIC(String CNIC, JFormattedTextField tfCNIC, JLabel lblCNIC)
    {
        User user = null;
        try
        {
            String query = "select Username from MyUser where CNIC = '" + CNIC + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
            r.next();
            user = new User(r.getString("Username"));
        }
        catch (SQLException ex)
        {
            lblCNIC.setText(CNIC + " is not present in the record!");
            tfCNIC.requestFocus();
        }
        return user;
    }

    public boolean hasCNIC(Component parentComponent, String CNIC, String personRole)
    {
        boolean flag = false;
        try
        {
            String query;
            switch (personRole)
            {
                case "user":
                            query = "select CNIC from MyUser where CNIC = '" + CNIC + "'";
                            s = c.createStatement();
                            r = s.executeQuery(query);
                            flag = r.next();
                            break;
                case "rider":
                            query = "select CNIC from Rider where CNIC = '" + CNIC + "'";
                            s = c.createStatement();
                            r = s.executeQuery(query);
                            flag = r.next();
                            break;
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public boolean hasUsername(Component parentComponent, String username)
    {
        boolean flag = false;
        try
        {
            String query = "select Username from MyUser where Username = '" + username + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
            flag = r.next();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public void getRiderNameList(Component parentComponent, JComboBox<String> cbRiderName)
    {
        try
        {
            String query = "select Name from Rider";
            s = c.createStatement();
            r = s.executeQuery(query);
            while (r.next())
            {
                cbRiderName.addItem(r.getString("Name"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public Rider getDetail(Component parentComponent, String riderName)
    {
        Rider rider = null;
        try
        {
            String query = "select * from Rider where Name = '" + riderName + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
            r.next();
            rider = new Rider(r.getString("CNIC"), r.getInt("DemandPerDelivery"), r.getString("Name"), r.getString("Phone"), r.getString("Address"));
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rider;
    }
    
    public ResultSet getDetail(Component parentComponent, String riderName, int month, int year)
    {
        try
        {
            String query = "select * from Main where RiderName = '" + riderName + "' and month([Date]) = " + month + "and year([Date]) = " + year;
            s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public ResultSet getDate(Component parentComponent, int month, int year)
    {
        try
        {
            String query = "select CONVERT(varchar,[Date],106) as [Date] from Main where month([Date]) = " + month + " and year([Date]) = " + year;
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public int insert(Component parentComponent, Vendor vendor)
    {
        int rowsAffected = 0;
        try
        {
            String query = "insert into Vendor values ('" + vendor.getName() + "','" + vendor.getPhone() + "','" + vendor.getResidentialAddress() + "','" + vendor.getOfficeAddress() + "')";
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(parentComponent, "Data inserted successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Insertion failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public boolean hasRider(Component parentComponent, String riderName)
    {
        boolean flag = false;
        try
        {
            String query = "select Name from Rider where Name = '" + riderName + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
            flag = r.next();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return flag;
    }
    
    public int insert(Component parentComponent, Rider rider)
    {
        int rowsAffected = 0;
        try
        {
            String query = "insert into Rider values ('" + rider.getName() + "','" + rider.getPhone() + "','" + rider.getCNIC() + "','" + rider.getResidentialAddress() + "'," + rider.getDemandPerDelivery() + ")";
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(parentComponent, "Data inserted successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Insertion failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public int insert(Component parentComponent, Status status, int ID)
    {
        int rowsAffected = 0;
        try
        {
            String query = "update Main set RiderName = '" + status.getRider().getName() + "', COD = " + status.getCashOnDelivery() + ", DC = " + status.getDeliveryCharges() + ", Status = '" + status.getStatusType() + "' where MainID = " + ID;
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
            if (rowsAffected > 0)
            {
                JOptionPane.showMessageDialog(parentComponent, "Status submitted successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(parentComponent, "Status submission failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public ResultSet getVendorDetail(Component parentComponent)
    {
        try
        {
            String query = "select * from Vendor";
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public ResultSet getCustomerData(Component parentComponent, String customerName)
    {
        try
        {
            String query = "select * from Main where CustomerName = '" + customerName + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        return r;
    }
    
    public int deletePackage(Component parentComponent, int ID)
    {
        int rowsAffected = 0;
        try
        {
            String query = "delete from Main where MainID = " + ID;
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public void deleteAllPackages(Component parentComponent)
    {
        try
        {
            String query = "truncate table Main";
            s = c.createStatement();
            s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int deleteVendor(Component parentComponent, int ID)
    {
        int rowsAffected = 0;
        try
        {
            String query = "delete from Vendor where VendorID = " + ID;
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public void deleteAllVendors(Component parentComponent)
    {
        try
        {
            String query = "truncate table Vendor";
            s = c.createStatement();
            s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public int deleteRider(Component parentComponent, String riderName)
    {
        int rowsAffected = 0;
        try
        {
            String query = "delete from Rider where Name = '" + riderName + "'";
            s = c.createStatement();
            rowsAffected = s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return rowsAffected;
    }
    
    public ResultSet riderDetails(Component parentComponent, String riderName)
    {
        try
        {
            String query = "select Name,CNIC,DemandPerDelivery from Rider where Name = '" + riderName + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public ResultSet getNoOfDeliveries(Component parentComponent, String riderName, int month, int year)
    { 
        try
        {
            String query = "select count(*) from Main where RiderName = '" +riderName+ "' and month([Date]) = " + month + " and year([Date]) = " + year;
            s = c.createStatement();
            r = s.executeQuery(query);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public void RiderSalary(Component parentComponent)
    {   
        java.util.Date date = new java.util.Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("MM");
        int month = Integer.parseInt(ft1.format(date));
        SimpleDateFormat ft2 = new SimpleDateFormat("yyyy");
        int year = Integer.parseInt(ft2.format(date));
        
        if (month == 1)
        {
            month += 11;
            year--;
        }
        else
        {
            month--;
        }
 
        try
        {
            for (int i = 0; i < name.size(); i++)
            {
               ResultSet r1 = riderDetails(parentComponent,name.get(i));
               ResultSet r2 = getNoOfDeliveries(parentComponent, name.get(i), month, year);
               if (r1.next() && r2.next())
               {
                   Rider rider = new Rider(r1.getString(1),r1.getString(2),r1.getInt(3),r2.getInt(1));
                   insertRiderSalary(parentComponent, rider, month, year);
               }
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertRiderSalary(Component parentComponent, Rider rider, int month, int year)
    {
        try
        {
            String query = "insert into RiderSalary values ('" + rider.getName() + "','" + rider.getCNIC() + "'," + rider.getDemandPerDelivery() + "," + rider.getNoOfDeliveries() + ", " + rider.getSalary() + "," + month + "," + year+ ")";
            s = c.createStatement();
            s.executeUpdate(query);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ResultSet showSalaryDetail(Component parentComponent, int month, int year)
    {
        try
        {
            String query = "select * from RiderSalary where Month = " + month + " and Year = " + year;
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public void getRiderNames(Component parentComponent)
    {
        try
        {
            String query = "select Name from Rider";
            s = c.createStatement();
            r = s.executeQuery(query);
            while (r.next())
            {
                name.add(r.getString("Name"));
            }
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteDuplicateData(Component parentComponent)
    {
        try
        {
            String query = "with salaryCTE As\n"
                            + "(\n"
                            + "	select *, ROW_NUMBER() Over (partition by [Name],[Month],[Year] order by Name) as RowNumber\n"
                            + "	from RiderSalary\n"
                            + ")\n"
                            + "delete from salaryCTE where RowNumber > 1;";
            s = c.createStatement();
            s.executeUpdate(query);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertIntoMonthlyIncome(Component parentComponent, int month, int year)
    {
        //String mon = Month.of(month).name();
        
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, -1);

        String previousMonth = new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
        try
        {
            String query = "insert into Income(Date, TotalDeliveries, SumOfCOD, SumOfDC, SumOfRiderSalary)\n" +
                           "values ('" + previousMonth + "'\n" +
                           "        ,(select count(*) from Main where month([Date]) = '" + month + "' and Year([Date]) = '" + year + "')\n" +
                           "        ,(select sum(COD) from Main where month([Date]) = '" + month + "' and Year([Date]) = '" + year + "')\n" +
                           "        ,(select sum(DC) from Main where month([Date]) = '" + month + "' and Year([Date]) = '" + year + "')\n" +
                           "        ,(select sum(Salary) from RiderSalary where [Month] = '" + month + "' and [Year] = '" + year + "'))";
            s = c.createStatement();
            s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void insertIncome(Component parentComponent, int month, int year)
    {
        //String mon = Month.of(month).name();
        try
        {
            String query = "update Income\n" +
                           "set Income = (select SumOfDC - SumOfRiderSalary from Income where month([Date]) = " + month + " and year([Date]) = " + year + ")\n" +
                           "where month([Date]) = " + month + " and year([Date]) = " + year;
            s = c.createStatement();
            s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void deleteDuplicatesFromIncome(Component parentComponent)
    {
        try
        {
            String query = "with incomeCTE As\n" +
                           "(\n" +
                           "	select *, ROW_NUMBER() Over (partition by month([Date]),year([Date]) order by month([Date])) as RowNumber\n" +
                           "	from Income\n" +
                           ")\n" +
                           "delete from incomeCTE where RowNumber > 1";
            s = c.createStatement();
            s.executeUpdate(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public ResultSet getIncomeDetails(Component parentComponent, int month, int year)
    {
        //String mon = Month.of(month).name();
        try
        { 
            String query = "select * from Income where month([Date]) = '" + month + "' and year([Date]) = '" + year + "'";
            s = c.createStatement();
            r = s.executeQuery(query);
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
    
    public ResultSet getDataForBarChart(Component parentComponent)
    {
        try
        {
            String query = "select top 13 Format([Date],'MMM-yy'),[Income] from Income order by ID desc";
            s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            r = s.executeQuery(query);
        } 
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(parentComponent, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return r;
    }
}