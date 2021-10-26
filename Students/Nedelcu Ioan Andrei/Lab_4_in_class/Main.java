/**
 * Shop having categories and products
 *
 * category:
 *  - name
 * product:
 *  - name
 *  - quantity
 *  - category
 *  - price
 *
 * shopService:
 * // hold 2 arrays for categs & products
 * // display all the products from a specific category
 * // search a product by name
 *
 * draw the UML diagrams for each of your classes
 */
public class Main {
    public static void main(String ... args) {
        ShopService service = new ShopService();
        Category x = new Category("Fructe");
        Product y = new Product("Banana" , 12 , x , 13);
        Product z = new Product("Mere" , 31 , x ,312);
        service.addCategory(x);
        service.addProduct(y);
        service.addProduct(z);
        service.dispalySpecificCategory(x);
        System.out.println();
        service.searchAProductByName("Banana");
    }
}
