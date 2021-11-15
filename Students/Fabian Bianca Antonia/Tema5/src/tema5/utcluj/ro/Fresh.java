package tema5.utcluj.ro;

public class Fresh extends Beverage
{
    private String fruit;
    boolean hasIce;

    public Fresh(String name, int quantity, int price, Size size, String fruit, boolean hasIce)
    {
        super(name, quantity, price, size);
        this.fruit = fruit;
        this.hasIce = hasIce;
    }

    public String getFruit()
    {
        return fruit;
    }

    public void setFruit(String fruit)
    {
        this.fruit = fruit;
    }

    public boolean isHasIce()
    {
        return hasIce;
    }

    public void setHasIce(boolean hasIce)
    {
        this.hasIce = hasIce;
    }
    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Fruit: "+ fruit + "\n" + "Ice: " + hasIce);
    }
}
