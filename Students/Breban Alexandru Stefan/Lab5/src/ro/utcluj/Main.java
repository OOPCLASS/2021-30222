package ro.utcluj;



/**
 * Create a hierarchy of products with some classes having
 * two levels of inheritance.
 *
 * - create some products of different types and add
 *   them to the same array
 * - create a method which returns the products of a
 *   specific type from the list of all products
 * - implement some overriden & overloaded methods
 * - try out equals on different classes
 * - draw the UML diagram for your classes
 */
public class Main {
	
	public static Product[] returnProduct(Product[] products, String category) {
		int k=0;
		Product[] answer = new Product[10];
	for (int i = 0; i < products.length; i++) {
		if(products[i].getCategory() == category) {
			answer[k]=products[i];
			k++;
		}
	}
	return answer;
	}
	
	
  public static void main(String[] args) {
   /*
    for (int i = 0; i < 2; i++) {
      Product product = products[i];
      System.out.println(product.getTitle());
      System.out.println(product.getDescription());
    }
*/
	  TV tv= new TV(4, "Samsung", 108);
	  tv.init("Samsung 43AU8072", 1068, "Electronic");
	
	  
	 Phone phone= new Phone(5, "Apple", 64);
	 phone.init("Apple iPhone 11", 3200, "Electronic");
	 
	 Pokemon pokemon= new Pokemon(50, "Cardstock");
	 pokemon.init("Pokémon Assorted Cards ", 40, "Cards");
	 
	 TV secondTv= new TV(3,"LG", 108);
	 secondTv.init("LG 43UP76903LE", 1700, "Electronic");
	 
	 Phone secondPhone= new Phone(4, "Huawei", 128);
	 secondPhone.init("Huawei P Smart", 850, "Electronic");

	 Pokemon secondPokemon= new Pokemon(25, "Cardstock");
	 secondPokemon.init("Pokémon Assorted Cards Lite", 20, "Cards");
	
	 Product[] products = new Product[6];
	 products[0]=tv;
	 products[1]=phone;
	 products[2]=pokemon;
	 products[3]=secondTv;
	 products[4]=secondPhone;
	 products[5]=secondPokemon;
	  
/*	for (int i = 0; i < 6; i++) {
		Product product = products[i];
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getCategory());
	}*/
		
	  Product[] answer = new Product[6];
	  answer= returnProduct(products, "Electronic");
	  for (int i = 0; i < 4; i++) {
			Product product1 = answer[i];
			System.out.println(product1.getName());}
	
	
	}

  
  
	  
	  
  }
