import javax.xml.transform.stream.StreamSource;

public class ShopService {
    public Product[] productArray;
    public Category[] categoryArray;
    public int sizeCategoryArray = 0;
    public int sizeProductArray = 0;

    public ShopService(Product[] productArray, Category[] categoryArray, int sizeCategoryArray,
                       int sizeProductArray) {
        this.productArray = productArray;
        this.categoryArray= categoryArray;
        this.sizeCategoryArray = sizeCategoryArray;
        this.sizeProductArray = sizeProductArray;
    }

    public Product[] getProductArray() {
        return productArray;
    }

    public void setProductArray(Product[] productArray) {
        this.productArray = productArray;
    }

    public void addProduct( Product product )
    {
        this.sizeProductArray++;
        this.productArray[this.sizeProductArray-1] = product;
    }

    public void addCategory( Category category )
    {
        this.sizeCategoryArray++;
        this.categoryArray[this.sizeCategoryArray-1] = category;
    }

    public int findProduct( String productName )
    {
        int position = -1;
        for (int i = 0; i < this.sizeProductArray; i++) {
            if( this.productArray[i].getName().equals( productName ) )
                position = i;
        }
        return position;
    }

    public int findCategory( String categoryName )
    {
        int position = -1;
        for (int i = 0; i < this.sizeCategoryArray; i++) {
            if( this.categoryArray[i].getName().equals( categoryName ) )
                position = i;
        }
        return position;
    }

    public void deleteCategory( String categoryName )
    {
        for (int i = 0; i < sizeProductArray; i++) {
            if( productArray[i].getCategory().getName().equals(categoryName) )
                deleteProduct(productArray[i].getName());
        }
        int position = findCategory(categoryName);
        clearCategoryPosition(position);
        this.sizeCategoryArray--;
    }

    public void deleteProduct( String productName )
    {
        int position = findProduct( productName );
        clearProductPosition(position);
        this.sizeProductArray--;
    }

    private void clearProductPosition(int position)
    {
        for (int i = position; i < this.sizeProductArray - 1; i++) {
            this.productArray[i] = this.productArray[i + 1];
        }
    }

    private void clearCategoryPosition(int position)
    {
        for (int i = position; i < this.sizeCategoryArray-1; i++) {
            this.categoryArray[i] = this.categoryArray[i + 1];
        }
    }

    public void showCategories()
    {
        for (int i = 0; i < sizeCategoryArray; i++) {
            categoryArray[i].showCategory();
        }
    }

    public void showProducts()
    {
        for (int i = 0; i < sizeProductArray; i++) {
            productArray[i].showProduct();
        }
    }

    public void showAllProductFromCategory( String categoryName )
    {
        for (int i = 0; i < sizeProductArray; i++) {
            if( productArray[i].getCategory().getName().equals( categoryName ) )
                productArray[i].showProduct();
        }
    }
}
