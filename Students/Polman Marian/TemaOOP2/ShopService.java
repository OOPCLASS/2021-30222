package ro.utcn;

public class ShopService {
    public Category[] categories;
    public Product[] products;
    private int productsNumber=0;
    private int categoriesNumber=0;

    public ShopService() {
        this.categories=new Category[5];
        this.products=new Product[10];
    }

    public void addCategory(Category category) {
        for(Category c:categories) {
        if(c.name.equals(category.name))
            return;
        }
        this.categories[categoriesNumber]=category;
        categoriesNumber++;
    }

    public void addProductAndCatregory(Product product) {
        this.products[productsNumber]=product;
        this.productsNumber++;
    }

    public void searchProductByName(String productName) {
     for(Product p:products) {
         if(p.name.equals(productName)) {
             System.out.println("The product exists in our Shop");
         }
         else {
             System.out.println("The product doesn't exit in our Shop");
         }
     }
    }

    public void displayByCategory(String categoryName) {
        for (Product p : products) {
            if (p.category.name.equals(categoryName)) {
                System.out.print(p.name + " ");
            }
            System.out.println();
        }
    }
}
