package objectspackage;

public class Vendor extends Human
{
    private String officeAddress;

    public Vendor(String officeAddress, String name, String phone, String residentialAddress)
    {
        super(name, phone, residentialAddress);
        this.officeAddress = officeAddress;
    }
    
    public String getOfficeAddress()
    {
        return officeAddress;
    }

    public void setOfficeAddress(String officeAddress)
    {
        this.officeAddress = officeAddress;
    }
}