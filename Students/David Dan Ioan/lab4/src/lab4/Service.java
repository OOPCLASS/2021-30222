package lab4;

import java.util.ArrayList;

public class Service {
	ArrayList<Category> categs = new ArrayList<Category>();/// which is better?
	private Product prods[]=new Product[200];	/// array or arrayList?
	private int nrOfProducts=0;
	
	void displayProdsFromCat(Category category){
		for (int i = 0; i < nrOfProducts; i++) {			
			if(prods[i].getCategory().equals(category))
				System.out.println(prods[i].getName());
		}	
		System.out.println("\n");
	}
	
	void findProduct(String name) {///working with array
		boolean productExists=false;
		for (int i=0; i<nrOfProducts; i++) {			
			if(prods[i].getName().contains(name)) {
				prods[i].displayProduct();	
				productExists=true;
			}					
		}
		if(!productExists)
			System.out.println("Product not found");
	}
	
	void addProd(Product p) {
		prods[nrOfProducts]=p;
		nrOfProducts++;
	}
	
	Category findCategory(String name) {///working with arrayList
		for (Category category : categs) {
			if(category.getName().equals(name))
				return category;	
		}
		return null;
	}	
	
	Category addCategIfNotExists( String catName) {
		if(findCategory(catName)==null) {
			Category c=new Category(catName);
			categs.add(c);
			return c;
		}
		else
			return findCategory(catName);
	}			
}
