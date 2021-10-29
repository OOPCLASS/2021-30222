package com.company;

public class Main {
    public static void main(String[] args) {
        ShopService shop = new ShopService();
        // shop.getCategs();
        /// shop.getProds();
        shop.getProductsForACategory("Mezeluri");
        shop.serchProduct("mandarine");
    }
}
