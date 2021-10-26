package ro.shop;

import ro.shop.products.services.*;

public class Shop {

	public static void main(String args[]) {
		ShopService shop = new ShopService();
		shop.searchCategory("Milk");
		shop.searchProduct("Zuzu");
		shop.searchCategory("Snack");
		shop.searchCategory("Drink");

	}
}
