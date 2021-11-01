package head;

import head.base.*;

public class Main {


    public static void main(String[] args) {
        Phone x = new Phone("Samsung", 2000, 64, "GB", 5, 4, "Android", 14, 16);
        Laptop y = new Laptop("Asus", 4200, 512, "SSD", 21, 16, "Windows 10", 3, "AMD");
        Products[] products = new Products[5];
        products[0] = x;
        products[1] = y;
        searchingForASpecificType(products);
        x.printSpecifications();
        x.searchingForMemory(64);
        System.out.println(x.equals(products[0]));
        System.out.println(y.equals(products[0]));
        System.out.println(y.equals(products[1]));
    }

    public static void searchingForASpecificType(Products[] products) {
        for (int i = 0; i < 2; i++) {
            if (products[i] instanceof Phone)
                System.out.println("Product " + i + " is a Phone");

        }
    }

}
