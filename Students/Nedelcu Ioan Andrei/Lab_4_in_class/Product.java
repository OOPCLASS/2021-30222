public class Product {
    private String name;
    private int quantity;
    private Category category;
    private int price;

    public Product(String name , int quantity , Category category , int price) {
        this.name = name;
        this.quantity = quantity;
        this.category = category;
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() { return name ;}
    public int getQuantity() { return quantity;}
    public Category getCategory() { return category;}
    public int getPrice() {return price;}

    public void logProduct() {
        System.out.println(name + " " + quantity + " " + category.getName() + price);
    }
}
