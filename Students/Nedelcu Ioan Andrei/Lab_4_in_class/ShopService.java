import java.util.ArrayList;
import java.util.List;

//* shopService:
//        * // hold 2 arrays for categs & products
//        * // display all the products from a specific category
//        * // search a product by name
//        *
public class ShopService {
    List<Category> categories;
    List<Product> products;
    public ShopService() {
        this.categories = new ArrayList<Category>();
        this.products = new ArrayList<Product>();
    }
    public void addProduct(Product newProduct) {
        this.products.add(newProduct);
    }
    public void addCategory(Category newCategory) {
        this.categories.add(newCategory);
    }
    public void dispalySpecificCategory(Category toFind) {
        for(var it : products) {
            if(it.getCategory().equals(toFind)) {
                it.logProduct();
            }
        }
    }
    public boolean searchAProductByName(String toFindName) {
        for(var it : products) {
            if(it.getName().equals(toFindName)) {
                return true;
            }
        }
        return false;
    }
}
