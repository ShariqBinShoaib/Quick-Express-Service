package objectspackage;

public class Rider extends Human
{
    private String CNIC;
    private int demandPerDelivery;
    private int salary;
    private int noOfDeliveries;

    public Rider(String CNIC, int demandPerDelivery, String name, String phone, String residentialAddress)
    {
        super(name, phone, residentialAddress);
        this.CNIC = CNIC;
        this.demandPerDelivery = demandPerDelivery;
    }
    
    public Rider(String name, String CNIC, int demandPerDelivery, int noOfDeliveries)
    {
        super(name,"","");
        this.CNIC = CNIC;
        this.demandPerDelivery = demandPerDelivery;
        this.noOfDeliveries = noOfDeliveries;
        this.salary = demandPerDelivery * noOfDeliveries;
    }

    public String getCNIC()
    {
        return CNIC;
    }

    public void setCNIC(String CNIC)
    {
        this.CNIC = CNIC;
    }

    public int getDemandPerDelivery()
    {
        return demandPerDelivery;
    }

    public void setDemandPerDelivery(int demandPerDelivery)
    {
        this.demandPerDelivery = demandPerDelivery;
    }
    
    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getNoOfDeliveries()
    {
        return noOfDeliveries;
    }

    public void setNoOfDeliveries(int noOfDeliveries)
    {
        this.noOfDeliveries = noOfDeliveries;
    }
    
}