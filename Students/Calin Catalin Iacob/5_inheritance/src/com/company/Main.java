package com.company;

import com.company.products.Component;
import com.company.products.Computers;
import com.company.products.Games;
import com.company.products.Notebook;


public class Main {

    public static void main(String[] args) {
        // write your code here


        Notebook notebookOne = new Notebook();
        Notebook notebookTwo = new Notebook();

        notebookOne.setName("Notebook Asus");
        notebookTwo.setName("Notebook Dell");

        notebookOne.setPrice(7000);
        notebookTwo.setPrice(5000);


        Computers computerOne = new Computers();
        Computers computerTwo = new Computers();

        computerOne.setName("Desktop Asus");
        computerTwo.setName("Desktop Dell");

        computerOne.setPrice(6000);
        computerTwo.setPrice(7500);

        Games gameOne = new Games();
        Games gameTwo = new Games();

        gameOne.setName("FIFA22");
        gameTwo.setName("GTA V");

        gameOne.setPrice(270);
        gameTwo.setPrice(200);

        Component componentOne = new Component();
        Component componentTwo = new Component();

        componentOne.setName("RTX3050");
        componentTwo.setName("SSD 512GB");

        componentOne.setPrice(900);
        componentTwo.setPrice(400);

        Product[] products = new Product[8];

        products[0] = new Notebook();
        products[0] = notebookOne;

        products[1] = new Component();
        products[1] = componentOne;

        products[2] = new Computers();
        products[2] = computerOne;

        products[3] = new Notebook();
        products[3] = notebookTwo;

        products[4] = new Games();
        products[4] = gameOne;

        products[5] = new Component();
        products[5] = componentTwo;

        products[6] = new Computers();
        products[6] = computerTwo;


        products[7] = new Games();
        products[7] = gameTwo;


        for (Product product : products) {
            if ( product instanceof Notebook )
            System.out.println(product.getName());

        }

        Notebook firstNotebook = new Notebook();
        firstNotebook.setWeight(3);
        firstNotebook.setBrand("Asus");
        firstNotebook.setModel("ROG");

        Notebook secondNotebook = new Notebook();
        secondNotebook.setWeight(3);
        secondNotebook.setBrand("Asus");
        secondNotebook.setModel("ROG");

        System.out.println(firstNotebook.getSpecification());


        System.out.println( firstNotebook.equals( secondNotebook ));


    }

}







