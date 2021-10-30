package shop;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import model.Product;
import model.SkincareProduct;
import model.ShowerProduct;
import model.Cleanser;
import model.MakeUpProduct;
import model.Lipstick;
import model.MoisturisingCream;
import model.Powder;
import model.ShowerGel;
import model.Shampoo;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello, Ramona!");

        Product[] products = new Product[20];

        Cleanser cleanser = new Cleanser("Effaclar", 30,12,"La Roche-Posay",
                "oily",true,true,"mattifying");
        products[0] = cleanser;

        Lipstick lipstick = new Lipstick("SuperStayMatteInk",20,24,"Maybelline",true,
                false,"red","liquid");
        products[1] = lipstick;

        Powder powder = new Powder("Infallible 24 h",60,24,"L'oreal",true,
                false,"fair","pressed powder");
        products[2] = powder;

        ShowerGel showerGel = new ShowerGel("Shower Cream", 13,12,"Nivea",
                "cherry blossom","sensitive");
        products[3] = showerGel;

        Shampoo shampoo = new Shampoo("Dream long",10,6,"Elseve",
                "roses","damaged");
        products[4] = shampoo;

        MoisturisingCream moisturisingCream = new MoisturisingCream("Mineral 89",89,12,"Vichy",
                "normal",true,90);
        products[5] = moisturisingCream;

        Cleanser secondCleanser = new Cleanser("Ultra Facial Cleanser",20,12,"Cerave",
                "dry",false,false,"hydrating");
        products[6] = secondCleanser;

        Lipstick secondLipstick = new Lipstick("ColorStay",34,24,"Revlon",
                true, false, "pink","liquid");
        products[7]= secondLipstick;

        Shampoo secondShampoo = new Shampoo("Classic Clean",10,12,"Head and Shoulders",
                "ocean","thin");
        products[8] = secondShampoo;

        ShowerGel secondShowerGel = new ShowerGel("Nourishing Secrets",15,12,"Dove",
                "vanilla","dry");
        products[9] = secondShowerGel;

         for (int i = 0; i < 10; i++) {
             System.out.println(products[i]);
         }

        products[3].isThisProductAGoodDeal(products[3].getPriceOfTheProduct());
        products[2].isThisProductAGoodDeal(products[2].getPriceOfTheProduct());

        products[3].isThisProductAGoodDeal(products[3].getExpirationDateInMonths());
        products[2].isThisProductAGoodDeal(products[2].getExpirationDateInMonths());

        cleanser.isThisForOilySkin(cleanser.isOilFree());
        secondCleanser.isThisForOilySkin(secondCleanser.isOilFree());

        cleanser.isThisForOilySkin(cleanser.getEffect());
        secondCleanser.isThisForOilySkin(secondCleanser.getEffect());
  
        System.out.println(cleanser.equals(secondCleanser)); //false
        System.out.println(products[1].equals(products[2])); //false
        System.out.println(cleanser.equals(products[0])); //true

        Product product = new Product();
        product.productsFromShowerProductCategory(10, products);



    }
}
