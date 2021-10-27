package lab4;

public class ShopService {
    private Category categories[];
    private Product products[];
    private int numberOfProducts;
    private int numberOfCategories;
    private int maxNumberOfProducts;
    private int maxNumberOfCategories;

    public ShopService(int categoriesCapacity, int productsCapacity) {
        this.maxNumberOfCategories = categoriesCapacity;
        this.maxNumberOfProducts = productsCapacity;

        categories = new Category[categoriesCapacity];
        products = new Product[productsCapacity];

        numberOfCategories = 0;
        numberOfProducts = 0;
    }
    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public int getNumberOfCategories() {
        return numberOfCategories;
    }

    public void addCategories (Category category)
    {
        if(numberOfCategories >= maxNumberOfCategories){
            System.out.println("Can't add a new category");
        }
        else{
            categories[numberOfCategories] = category;
            numberOfCategories ++;
        }
    }
    public void addProducts (Product product)
    {
        if(numberOfProducts >= maxNumberOfProducts){
            System.out.println("Can't add a new product");
        }
        else{
            products[numberOfProducts] = product;
            numberOfProducts ++;
        }
    }

    public void displayAllProducts() {
        System.out.println("PRODUCTS:");
        for (int i = 0; i < getNumberOfProducts(); i++) {
            System.out.println(products[i].getName());
        }
    }
    public void displayALLCategories() {
        System.out.println("CATEGORIES:");
        for (int i = 0; i < getNumberOfCategories(); i++) {
            System.out.println(categories[i].getName());
        }
    }


    public void getProductsFromCategory(String categoryName) {
        System.out.println("Products from category " + categoryName + ":");
        for (int i = 0; i < getNumberOfProducts(); i++) {
            if (products[i].getCategory().getName().equals(categoryName))
                System.out.println(products[i].getName());
        }

    }
    public void searchProductByName(String productName) {
        boolean flag = false;
        int quantity=0;
        for (int i = 0; i < getNumberOfProducts(); i++) {
            if (products[i].getName().equals(productName)) {
                flag = true;
                quantity = products[i].getQuantity();
                break;
            }
        }
        if (flag) {
            System.out.println("There are " + quantity + " products named " + productName + " in stock");
        } else {
            System.out.println("There are no products named " + productName);
        }
    }
}
