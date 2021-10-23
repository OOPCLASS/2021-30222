package ro.shop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class Shop 
{

	public static void main(String[] args) throws IOException
	{
		ShopService shopService = new ShopService(10,5);
		Path fileName = Path.of("src/ro/shop/input.txt");
		List<String> fileContent = Files.readAllLines(fileName);
		for (String line : fileContent) 
		{

			String[] lineWords = line.split(" ");
		    String productName = lineWords[0];
		    int productQuantity =  Integer.parseInt(lineWords[1]);
		    Category productCategory = new Category(lineWords[2]);
		    int productPrice = Integer.parseInt(lineWords[3]);
		    shopService.addProduct(new Product(productName,productQuantity,productCategory,productPrice));
		}
		
		//shopService.displayAllProducts();
		
		fileName = Path.of("src/ro/shop/categ.txt");
		fileContent = Files.readAllLines(fileName);
		for (String line : fileContent) 
		{
		    String categName = line;
		    shopService.addCategory(new Category(categName));
		}
		
		//shopService.displayAllCategories();
		//shopService.displayProductsByCategoryName("dairy");
		shopService.searchProductByName("gingerbread");
	}
}
