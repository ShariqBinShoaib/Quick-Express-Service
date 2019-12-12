package objectspackage;

public class Human
{
    private String name;
    private String phone;
    private String residentialAddress;

    public Human(String name, String phone, String residentialAddress)
    {
        this.name = name;
        this.phone = phone;
        this.residentialAddress = residentialAddress;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getResidentialAddress()
    {
        return residentialAddress;
    }

    public void setResidentialAddress(String residentialAddress)
    {
        this.residentialAddress = residentialAddress;
    }
}