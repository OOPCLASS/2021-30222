package ro.shop;

import ro.service.ShopService;
import ro.model.Category;
import ro.model.Product;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //System.out.println("hello");
        ShopService shopService = new ShopService(20, 20);

        Path fileName = Path.of("src/categories.txt");
        List<String> fileContent = Files.readAllLines(fileName);

        for (String line : fileContent) {
            String[] lineWords = line.split(" ");
            String nameOfCategory = lineWords[0];
            shopService.addNewCategory(new Category(nameOfCategory));
        }
        shopService.displayAllTheCategories();

        Path fileName2 = Path.of("src/products.txt");
        List<String> fileContent2 = Files.readAllLines(fileName2);
        for (String line : fileContent2) {
            String[] lineWords = line.split(" ");
            String name = lineWords[0];
            int quantity = Integer.parseInt(lineWords[1]);
            Category category = new Category(lineWords[2]);
            float price = Float.parseFloat(lineWords[3]);
            shopService.addNewProduct(new Product(name, quantity, category, price));
        }
        shopService.displayAllTheProducts();
        shopService.displayAllTheProductsFromACategory("apa");
        shopService.searchAProductByName("Tide");

    }
}
