package lab4;

public class ShopService {
    private Category[] listOfCategories = new Category[4];
    private Product[] listOfProducts = new Product[10];

    public ShopService(Category[] listOfCategories, Product[] listOfProducts) {
        this.listOfCategories = listOfCategories;
        this.listOfProducts = listOfProducts;
    }

    public void displayProductsFromACategory(Category category){

        for(Product product: listOfProducts){
            if(product.getCategory().equals(category)){
                product.getData();
            }
        }
    }
    public Product searchForProduct(String name){
        for(Product product: listOfProducts){
            if(product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
}
