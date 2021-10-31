package tema5.utcluj.ro;

import java.sql.SQLOutput;

public class Bakery
{
    public static void main(String[] args)
    {
        Product product = new Product("Soda",10,2);
        BakedProduct bakedProduct = new BakedProduct("Cake",5,10,"wheat");
        BakedProduct secondbakedProduct = new BakedProduct("Cake",5,10,"wheat");
        Pastry pastry = new Pastry("Strudel",5,5,"wheat","cherry", Pastry.Taste.SWEET);
        Pastry pastrySwirl = new Pastry("Cinnamon Swirl ",5,6,"wheat","cinnamon", Pastry.Taste.SWEET);
        Bread bread =  new Bread("White bread",20,2,"wheat",true,false);
        Sandwich sandwich =  new Sandwich("Fresh Sandwich",4,5,"Wheat","Ham");
        Beverage beverage = new Beverage("Milkshake",1,6, Beverage.Size.LARGE);
        Coffee coffee = new Coffee("Cappuccino",8,4, Beverage.Size.MEDIUM,"Arabica",true,true);
        Fresh fresh = new Fresh("Vitamin C Fresh",2,8, Beverage.Size.MEDIUM,"Orange",true);
        Product [] products = {product,bakedProduct,pastry,pastrySwirl,bread,sandwich,beverage,coffee,fresh};

        BakeryService bakery = new BakeryService(products);
        // Afisare produse
        /*for (int i = 0; i < products.length; i++)
        {
            System.out.println(products[i]);
            System.out.println();
        }*/

        bakery.specificProducts("Pastry");
       // bakery.search(5);
       // bakery.search("Vitamin C Fresh");
        // bakery.search("Cheescake");
        //bakery.search(5, BakeryService.PriceFilter.HIGHER);
        //System.out.println(bakedProduct.equals(secondbakedProduct));
    }

}
