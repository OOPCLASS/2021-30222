package tema5.utcluj.ro;

import java.util.Objects;

public class BakedProduct extends Product
{
    private String flourType;

    public BakedProduct(String name, int quantity, int price, String flourType)
    {
        super(name, quantity, price);
        this.flourType = flourType;
    }

    public BakedProduct()
    {

    }

    public String getFlourType()
    {
        return flourType;
    }

    public void setFlourType(String flourType)
    {
        this.flourType = flourType;
    }

    @Override
    public String toString()
    {
        return String.format( super.toString()+"\n"+"Flour Type: "+flourType);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        if (!super.equals(o))
        {
            return false;
        }
        BakedProduct that = (BakedProduct) o;
        return Objects.equals(flourType, that.flourType);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), flourType);
    }
}
