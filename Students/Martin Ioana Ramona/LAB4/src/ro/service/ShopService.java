package ro.service;

import ro.model.Category;
import ro.model.Product;

public class ShopService {
    private Category[] categories;
    private Product[] products;
    private int numberOfCategories;
    private int numberOfProducts;
    private int categoriesCapacity;
    private int productsCapacity;

    public ShopService(int productsCapacity, int categoriesCapacity) {
        categories = new Category[categoriesCapacity];
        this.categoriesCapacity = categoriesCapacity;
        numberOfCategories = 0;

        products = new Product[productsCapacity];
        this.productsCapacity = productsCapacity;
        numberOfProducts = 0;
    }

    public int getProductsCapacity() {
        return productsCapacity;
    }

    public void setProductsCapacity(int productsCapacity) {
        this.productsCapacity = productsCapacity;
    }

    public int getCategoriesCapacity() {
        return categoriesCapacity;
    }

    public void setCategoriesCapacity(int categoriesCapacity) {
        this.categoriesCapacity = categoriesCapacity;
    }

    public Category[] getCategories() {
        return categories;
    }

    public void setCategories(Category[] categories) {
        this.categories = categories;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public int getNumberOfCategories() {
        return numberOfCategories;
    }

    public void setNumberOfCategories(int numberOfCategories) {
        this.numberOfCategories = numberOfCategories;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public void addNewCategory(Category category) {
        if (categoriesCapacity == numberOfCategories) {
            System.out.println("the category section is full");
        } else {
            categories[numberOfCategories] = category;
            numberOfCategories++;
        }
    }

    public void addNewProduct(Product product) {
        if (productsCapacity == numberOfProducts) {
            System.out.println("the product section is full");
        } else {
            products[numberOfProducts] = product;
            numberOfProducts++;
        }
    }

    public void displayAllTheCategories() {
        for (int i = 0; i < getNumberOfCategories(); i++) {
            System.out.println(categories[i].getName());
        }
    }

    public void displayAllTheProducts() {
        for (int i = 0; i < getNumberOfProducts(); i++) {
            System.out.println(products[i].getName());
        }
    }

    public void displayAllTheProductsFromACategory(String nameOfTheCategory) {
        for (int i = 0; i < getNumberOfProducts(); i++) {
            if (products[i].getCategory().getName().equals(nameOfTheCategory)) {
                System.out.println(products[i].getName());
            }
        }
    }

    public void searchAProductByName(String nameOfTheProduct) {
        boolean flag = false;
        for (int i = 0; i < getNumberOfProducts(); i++) {
            if (products[i].getName().equals(nameOfTheProduct)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("The product exists");
        } else {
            System.out.println("The product doesn't exist");
        }
    }

}
