package lab4;

public class Product {
    private String name;
    private int quantity;
    private Category category;
    private double price;

    public Product(String name, int quantity, Category category, double price) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getData(){
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Category: " + category.getName());
        System.out.println("Price: " + price);
    }
}
