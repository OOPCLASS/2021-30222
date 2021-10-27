package lab4;

public class Product {
	private String name;
	private int quantity;
	private Category category;
	private float price;
	
	public Product(String name2, int quantity2, Category cat, float price2) {
		name=name2;
		category=cat;
		quantity=quantity2;
		price=price2;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	void sellProducts(Product p, int quantity){
		p.quantity-=quantity;		
	}
	void displayProduct() {
		System.out.println("Nume produs: " + name +"\nstoc: " + quantity +"\npret: "+price+"\ncategoria: "+category.getName()+"\n\n");
	}
}
