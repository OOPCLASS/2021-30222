package ro.shop.products.services;

import ro.shop.products.*;

public class ShopService {
	private Product[] product = new Product[10];
	private Category[] category = new Category[10];

	public ShopService() {
		for (int i = 0; i < 10; i++) {
			product[i] = new Product();

		}
		for (int i = 0; i < 10; i++) {
			category[i] = new Category();
		}

		product[0].setAll(5, 5, "Zuzu");
		product[1].setAll(12, 50, "Napolact");
		product[2].setAll(6, 13, "Lays");
		product[3].setAll(6, 20, "Croco");

		category[0].setAll("Zuzu", "Milk");
		category[1].setAll("Napolact", "Milk");
		category[2].setAll("Lays", "Snack");
		category[3].setAll("Croco", "Snack");
	}

	public void searchProduct(String name) {
		int help = 0;
		for (int i = 0; i < 4; i++) {
			if (this.product[i].getName().equals(name)) {
				System.out.println(
						"Price: " + this.product[i].getPrice() + ", Quantity: " + this.product[i].getQuantity());
				help = 1;
			}
		}
		if (help == 0) {
			System.out.println(name + " is not available");
		}

	}

	public void searchCategory(String name) {
		int help = 0;
		for (int i = 0; i < 4; i++) {
			if (this.category[i].getName().equals(name)) {
				help = 1;
				System.out.println(this.category[i].getProduct());
			}
		}
		if (help == 0) {
			System.out.println(name + " is not available");
		}

	}
}
