package head;


import head.base.Laptop;
import org.jetbrains.annotations.NotNull;

public class Products {

    private String name;
    private int price;

    public Products() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean equals(Products product) {
        return product.getName() == this.getName();
    }

}
