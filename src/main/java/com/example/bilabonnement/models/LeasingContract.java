package com.example.bilabonnement.models;

public class LeasingContract {

    private int contractID;
    private String type;
    private int priceMonthly;
    private int priceTotal;
    private String serialnumber;

   private String startdate;
   private String enddate;
   private int leasingperiod;


    public LeasingContract() {
        
    }

    public LeasingContract(String type, int priceMonthly, int priceTotal, String serialnumber, String startdate, String enddate, int leasingperiod, int contractID)
    {
        this.type = type;
        this.priceMonthly = priceMonthly;
        this.priceTotal = priceTotal;
        this.serialnumber = serialnumber;
        this.startdate = startdate;
        this.enddate = enddate;
        this.leasingperiod = leasingperiod;
        this.contractID = contractID;
    }

    public LeasingContract(int contractID, String type, String serialnumber, String startdate, String enddate) {
        this.contractID = contractID;
        this.type = type;
        this.serialnumber = serialnumber;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public LeasingContract(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getPriceMonthly()
    {
        return priceMonthly;
    }

    public void setPriceMonthly(int priceMonthly)
    {
        this.priceMonthly = priceMonthly;
    }

    public int getPriceTotal()
    {
        return priceTotal;
    }

    public void setPriceTotal(int priceTotal)
    {
        this.priceTotal = priceTotal;
    }

    public String getSerialnumber()
    {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber)
    {
        this.serialnumber = serialnumber;
    }

    public String getStartdate()
    {
        return startdate;
    }

    public void setStartdate(String startdate)
    {
        this.startdate = startdate;
    }

    public String getEnddate()
    {
        return enddate;
    }

    public void setEnddate(String enddate)
    {
        this.enddate = enddate;
    }

    public int getLeasingperiod()
    {
        return leasingperiod;
    }

    public void setLeasingperiod(int leasingperiod)
    {
        this.leasingperiod = leasingperiod;
    }

    @Override
    public String toString()
    {
        return "LeasingContract{" +
                "contractID=" + contractID +
                ", type='" + type + '\'' +
                ", priceMonthly=" + priceMonthly +
                ", priceTotal=" + priceTotal +
                ", serialnumber=" + serialnumber +
                ", startdate='" + startdate + '\'' +
                ", enddate='" + enddate + '\'' +
                ", leasingperiod=" + leasingperiod +
                '}';
    }
}
