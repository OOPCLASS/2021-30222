package ro.utcn;

public class Product {
    public String name;
    public int quantity;
    public Category category;
    public int price;

    public Product(String name, int quantity, int price) {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

}
