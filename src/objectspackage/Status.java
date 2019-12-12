package objectspackage;

public class Status
{
    private Rider rider;
    private int cashOnDelivery;
    private int deliveryCharges;
    private String statusType;

    public Status(Rider rider, int cashOnDelivery, int deliveryCharges, String statusType)
    {
        this.rider = rider;
        this.cashOnDelivery = cashOnDelivery;
        this.deliveryCharges = deliveryCharges;
        this.statusType = statusType;
    }

    public Status(Rider rider, String statusType)
    {
        this.rider = rider;
        this.statusType = statusType;
    }
    
    public Status(Rider rider, int deliveryCharges, String statusType)
    {
        this.rider = rider;
        this.deliveryCharges = deliveryCharges;
        this.statusType = statusType;
    }
    
    public Rider getRider()
    {
        return rider;
    }

    public void setRider(Rider rider)
    {
        this.rider = rider;
    }

    public int getCashOnDelivery()
    {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(int cashOnDelivery)
    {
        this.cashOnDelivery = cashOnDelivery;
    }

    public int getDeliveryCharges()
    {
        return deliveryCharges;
    }

    public void setDeliveryCharges(int deliveryCharges)
    {
        this.deliveryCharges = deliveryCharges;
    }

    public String getStatusType()
    {
        return statusType;
    }

    public void setStatusType(String statusType)
    {
        this.statusType = statusType;
    }
}