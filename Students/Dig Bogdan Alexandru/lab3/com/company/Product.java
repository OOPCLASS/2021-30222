package com.company;

public class Product {
    private String name, category;
    private int quantity;
    private int price;
    public Product() {

    }

    public Product(String name, String category, int quantity, int price) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName () {
        return name;
    }

    public String getCategory () {
        return category;
    }

    public int getQuantity () {
        return quantity;
    }

    public int getPrice () {
        return price;
    }

    public void showDetails() {
        System.out.println(name + " " + category + " " + quantity + " " + price);
    }
}
