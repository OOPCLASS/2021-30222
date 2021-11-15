package tema5.utcluj.ro;

public class Beverage extends Product
{
    enum Size
    {
        SMALL,
        MEDIUM,
        LARGE
    }
    private Size size;

    public Beverage(String name, int quantity, int price, Size size)
    {
        super(name, quantity, price);
        this.size = size;
    }

    public Size getSize()
    {
        return size;
    }

    public void setSize(Size size)
    {
        this.size = size;
    }

    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Size: "+size);
    }
}
