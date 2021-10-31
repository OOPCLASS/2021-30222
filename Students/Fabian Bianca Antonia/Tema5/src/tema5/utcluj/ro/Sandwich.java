package tema5.utcluj.ro;

public class Sandwich extends Product
{
    private String breadType;
    private String meatType;

    public Sandwich(String name, int quantity, int price, String breadType, String meatType)
    {
        super(name, quantity, price);
        this.breadType = breadType;
        this.meatType = meatType;
    }

    public String getBreadType()
    {
        return breadType;
    }

    public void setBreadType(String breadType)
    {
        this.breadType = breadType;
    }

    public String getMeatType()
    {
        return meatType;
    }

    public void setMeatType(String meatType)
    {
        this.meatType = meatType;
    }
    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Bread Type:" +breadType +"\n"+"Meat Type: "+meatType);
    }
}
