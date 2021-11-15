package tema5.utcluj.ro;

public class Coffee extends Beverage
{
    private String coffeBeans;
    private boolean hasSugar;
    private boolean hasMilk;

    public Coffee(String name, int quantity, int price, Size size, String coffeBeans, boolean hasSugar, boolean hasMilk)
    {
        super(name, quantity, price, size);
        this.coffeBeans = coffeBeans;
        this.hasSugar = hasSugar;
        this.hasMilk = hasMilk;
    }

    public String getCoffeBeans()
    {
        return coffeBeans;
    }

    public void setCoffeBeans(String coffeBeans)
    {
        this.coffeBeans = coffeBeans;
    }

    public boolean isSugar()
    {
        return hasSugar;
    }

    public void setSugar(boolean sugar)
    {
        this.hasSugar = sugar;
    }

    public boolean isMilk()
    {
        return hasMilk;
    }

    public void setMilk(boolean milk)
    {
        this.hasMilk = milk;
    }
    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Type of coffee beans: " + coffeBeans+ "\n" + "Sugar: " + hasSugar + "\n" + "Milk: " + hasMilk);
    }
}

