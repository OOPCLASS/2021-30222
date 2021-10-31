package tema5.utcluj.ro;

public class BakeryService
{
    enum PriceFilter
    {
        LOWER,
        EQUAL,
        HIGHER
    }
    Product [] products;

    public BakeryService(Product[] products)
    {
        this.products = products;
    }
    public void specificProducts ( String className)
    {
        for (int i = 0; i < products.length; i++)
        {
            if(products[i].getClass().getSimpleName().equals(className))
            {
                System.out.println(products[i]);
                System.out.println();
            }
        }
    }
    public void search (String productName)
    {
        boolean found = false;
        for(int i=0;i<products.length;i++)
        {
            if(products[i].getName().equals(productName))
            {
                System.out.println(products[i]);
                found = true;
            }
        }
        if(!found)
            System.out.println("There is no product that has the name " + productName);
    }

    public void search (int price, PriceFilter filter)
    {
       switch (filter)
       {
           case LOWER :
           {
               for (int i = 0; i < products.length; i++)
               {
                   if(products[i].getPrice()<price)
                   {
                       System.out.println(products[i]);
                   }
               }
           }
           break;
           case EQUAL :
           {
               for (int i = 0; i < products.length; i++)
               {
                   if(products[i].getPrice() == price)
                   {
                       System.out.println(products[i]);
                   }
               }
           }
           break;
           case HIGHER :
           {
               for (int i = 0; i < products.length; i++)
               {
                   if(products[i].getPrice()>price)
                   {
                       System.out.println(products[i]);
                   }
               }
           }
           break;
           default:break;
       }
    }
    public void search (int quantity)
    {
        for (int i = 0; i < products.length; i++)
        {
            if(products[i].getQuantity() == quantity)
            {
                System.out.println(products[i]);
            }
        }
    }

}
