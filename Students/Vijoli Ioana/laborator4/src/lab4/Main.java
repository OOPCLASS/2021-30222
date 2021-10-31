package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/*
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

    public static void main(String[] args) throws IOException {
        ShopService shopService = new ShopService(100,100);

        Path fileName = Path.of("src/categories.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String nameOfCategory = lineWords[0];
            shopService.addCategories(new Category(nameOfCategory));
        }
        shopService.displayALLCategories();

        Path fileName2 = Path.of("src/products.txt");
        List<String> fileContent2 = Files.readAllLines(fileName2);
        for (String line : fileContent2) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];
            int quantity = Integer.parseInt(lineWords[1]);
            Category category = new Category(lineWords[2]);
            float price = Float.parseFloat(lineWords[3]);
            shopService.addProducts(new Product(name, quantity, category, price));
        }
        shopService.displayAllProducts();
        shopService.getProductsFromCategory("mobilier");
        shopService.searchProductByName("zahar");
    }
}
