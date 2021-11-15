package com.company;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ShopService {
    static int numberOfcategories, numberOfproducts;
    private Category[] categs;
    private Product[] prods;
    public ShopService () {
        File myFile = new File("C:\\Users\\Bogdan Dig\\IdeaProjects\\work\\src\\categories.txt");
        categs = new Category[9];
        try {
            Scanner myScanner = new Scanner(myFile);
            int i = 0;
            String data = myScanner.nextLine();
            while (!data.equals("")) {
                categs[i] = new Category(data);
                numberOfcategories = ++i;
                data = myScanner.nextLine();
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("The file doesn't exist");
        }

        prods = new Product[15];
        myFile = new File("C:\\Users\\Bogdan Dig\\IdeaProjects\\work\\src\\products.txt");
        try {
            Scanner myScanner = new Scanner(myFile);
            int i = 0;
            String name, category;
            int quantity, price;
            while (myScanner.hasNextLine()) {
                name = myScanner.next();
                category = myScanner.next();
                quantity = myScanner.nextInt();
                price = myScanner.nextInt();
                prods[i] = new Product(name, category, quantity, price);
                numberOfproducts = ++i;
            }
        }
        catch (FileNotFoundException ex) {
            System.out.println("The file doesn't exist");
        }
    }

    public void getCategs () {
        for (int i = 0; i < numberOfcategories; i++) {
            System.out.println(categs[i].getName());
        }
    }

    public void getProds() {
        for (int i = 0; i < numberOfproducts; i++) {
            System.out.println(prods[i].getName() + " " + prods[i].getCategory() + " " + prods[i].getQuantity() + " " + prods[i].getPrice());
        }
    }

    public void getProductsForACategory(String category) {
        boolean categoryExist = false;
        for (int i = 0; i < numberOfcategories; i++)
            if (categs[i].getName().equals(category)) {
                categoryExist = true;
                break;
            }
        if (!categoryExist) {
            System.out.println("Category " + category + " doesn't exist");
            return;
        }
        boolean productsFound = false;
        for (int i = 0; i < numberOfproducts; i++)
            if(prods[i].getCategory().equals(category)) {
                productsFound = true;
                prods[i].showDetails();
            }
        if(!productsFound)
            System.out.println("Category " + category + " doesn't have products for now");
    }

    public void serchProduct(String name) {
        for (int i = 0; i < numberOfproducts; i++)
            if(prods[i].getName().equals(name)) {
                System.out.print("The product exists in the shop and here are some details about it: ");
                prods[i].showDetails();
                return;
            }
        System.out.println("This product doesn't exist in the shop for now");
    }
}
