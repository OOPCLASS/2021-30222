package tema5.utcluj.ro;
public class Pastry extends BakedProduct
{
    enum Taste
    {
        SWEET,
        SALTY
    }
     private String filling;
     private Taste taste;

    public Pastry(String name, int quantity, int price, String flourType, String filling, Taste taste)
    {
        super(name, quantity, price, flourType);
        this.filling = filling;
        this.taste=taste;
    }

    public String getFilling()
    {
        return filling;
    }

    public void setFilling(String filling)
    {
        this.filling = filling;
    }

    public Taste getTaste()
    {
        return taste;
    }

    public void setTaste(Taste taste)
    {
        this.taste = taste;
    }

    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Filling: "+filling+"\n"+"Taste: "+taste);
    }

}
