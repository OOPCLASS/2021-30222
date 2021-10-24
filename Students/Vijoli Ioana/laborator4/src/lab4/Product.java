package lab4;
public class Product {
    private String name;
    private int quantity;
    private float price;
    private Category category;

    public Product(String name, int quantity, Category category, float price)
    {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
}
