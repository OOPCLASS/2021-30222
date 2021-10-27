package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {	
	static String categoryToShow="fructe";
	static String searchTerm="Sampanie";
	
	public static void main(String[] args) throws IOException {		
		Service shopService=new Service();
		
		Path fileName=Path.of("Products.txt");
		List <String> fileContent=Files.readAllLines(fileName);
		for(String line:fileContent) {
			String[] lineWords=line.split("; ");
			String name=lineWords[0];
			int quantity=Integer.parseInt(lineWords[1]);
			float price=Float.parseFloat(lineWords[2]);
			String categ=lineWords[3];			
			
			Category cat=shopService.addCategIfNotExists(categ);
			Product prod=new Product(name, quantity, cat, price);			
			shopService.addProd(prod);
		}			
		
		Category cat=new Category(categoryToShow);
		shopService.displayProdsFromCat(cat);
		shopService.findProduct(searchTerm);
	}
}
