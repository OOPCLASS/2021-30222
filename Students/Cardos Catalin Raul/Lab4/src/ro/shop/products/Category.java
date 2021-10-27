package ro.shop.products;

public class Category {

	private String name;
	private String product;

	public Category() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}
	public void setAll (String product, String name)
	{
		this.setName(name);
		this.setProduct(product);
	}

}
