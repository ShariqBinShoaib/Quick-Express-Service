package objectspackage;

public class PackageEntry
{
    private int consignmentNumber;
    private String date;
    private Customer customer;
    private Vendor vendor;
    private Status status;

    public PackageEntry(int consignmentNumber, String date, Customer customer, Vendor vendor, Status status)
    {
        this.consignmentNumber = consignmentNumber;
        this.date = date;
        this.customer = customer;
        this.vendor = vendor;
        this.status = status;
    }
    
    public PackageEntry(String date, Customer customer, Vendor vendor)
    {
        this.date = date;
        this.customer = customer;
        this.vendor = vendor;
    }

    public int getConsignmentNumber()
    {
        return consignmentNumber;
    }

    public void setConsignmentNumber(int consignmentNumber)
    {
        this.consignmentNumber = consignmentNumber;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Vendor getVendor()
    {
        return vendor;
    }

    public void setVendor(Vendor vendor)
    {
        this.vendor = vendor;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }
}