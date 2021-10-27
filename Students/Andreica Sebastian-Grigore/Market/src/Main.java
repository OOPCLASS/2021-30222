
public class Main {
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
    public static void main(String[] args) {
        Product[] array = new Product[4];
        Category[] arrayCategory = new Category[2];
        arrayCategory[0] = new Category("papetarie");
        arrayCategory[1] = new Category("alimente de baza");
        array[0] = new Product("caiet", 12, arrayCategory[0], 2.5 );
        array[1] = new Product("pix", 34, arrayCategory[0], 0.5 );
        array[2] = new Product("faina", 14, arrayCategory[1], 3.0 );
        array[3] = new Product("ulei", 20, arrayCategory[1], 7.6 );
        ShopService market = new ShopService(array, arrayCategory, 2, 4);
        market.showCategories();
        System.out.println();

        market.showProducts();
        System.out.println();

        market.deleteProduct("ulei");
        Product product = new Product( "carnet", 6, arrayCategory[0], 1.2 );
        market.addProduct(product);
        market.showProducts();
        System.out.println();

        market.showAllProductFromCategory("papetarie");
        System.out.println();

        market.deleteCategory("alimente de baza");
        market.showProducts();
    }
}
