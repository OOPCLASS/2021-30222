public class Product {
    private String name;
    private Integer quantity;
    private Category category;
    private Double price;

    public Product(String name, Integer quantity, Category category, Double price) {
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void showProduct()
    {
        System.out.println(this.name + " " + this.quantity + " " +
                this.category.getName() + " " + this.price);
    }
}
