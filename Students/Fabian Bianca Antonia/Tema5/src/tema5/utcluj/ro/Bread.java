package tema5.utcluj.ro;

public class Bread extends BakedProduct
{
    private boolean isSliced;
    private boolean hasSeeds;

    public Bread(String name, int quantity, int price, String flourType, boolean isSliced, boolean hasSeeds) {
        super(name, quantity, price, flourType);
        this.isSliced = isSliced;
        this.hasSeeds = hasSeeds;
    }

    public boolean isSliced()
    {
        return isSliced;
    }

    public void setSliced(boolean sliced)
    {
        isSliced = sliced;
    }

    public boolean isHasSeeds()
    {
        return hasSeeds;
    }

    public void setHasSeeds(boolean hasSeeds)
    {
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Sliced: "+isSliced+"\n"+"Seeds: "+hasSeeds);
    }
}
