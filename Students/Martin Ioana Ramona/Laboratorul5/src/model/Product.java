package model;

import java.util.Objects;

public class Product {
    private String nameOfTheProduct;
    private float priceOfTheProduct;
    private int expirationDateInMonths;
    private String brandOfTheProduct;

    public Product(){

    }

    public Product(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
        this.priceOfTheProduct = priceOfTheProduct;
        this.expirationDateInMonths = expirationDateInMonths;
        this.brandOfTheProduct = brandOfTheProduct;
    }

    public String getNameOfTheProduct() {
        return nameOfTheProduct;
    }

    public void setNameOfTheProduct(String nameOfTheProduct) {
        this.nameOfTheProduct = nameOfTheProduct;
    }

    public float getPriceOfTheProduct() {
        return priceOfTheProduct;
    }

    public void setPriceOfTheProduct(float priceOfTheProduct) {
        this.priceOfTheProduct = priceOfTheProduct;
    }

    public int getExpirationDateInMonths() {
        return expirationDateInMonths;
    }

    public void setExpirationDateInMonths(int expirationDateInMonths) {
        this.expirationDateInMonths = expirationDateInMonths;
    }

    public String getBrandOfTheProduct() {
        return brandOfTheProduct;
    }

    public void setBrandOfTheProduct(String brandOfTheProduct) {
        this.brandOfTheProduct = brandOfTheProduct;
    }

    public void productsFromShowerProductCategory(int numberOfProducts, Product[] products) {
        for (int i = 0; i < numberOfProducts; i++) {
            if(products[i] instanceof ShowerProduct) {
                System.out.println(products[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfTheProduct='" + nameOfTheProduct + '\'' +
                ", priceOfTheProduct=" + priceOfTheProduct +
                ", expirationDateInMonths=" + expirationDateInMonths +
                ", brandOfTheProduct='" + brandOfTheProduct + '\'' +
                '}';
    }

    public void isThisProductAGoodDeal(float priceOfTheProduct){
        if(priceOfTheProduct < 30) System.out.println("This product is a good deal");
        else System.out.println("This product is not a good deal");
    }

    public void isThisProductAGoodDeal(int expirationDateInMonths){
        if(expirationDateInMonths > 6 && expirationDateInMonths <= 12) System.out.println("This product is a good deal");
        else System.out.println("This product is not a good deal");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.priceOfTheProduct, priceOfTheProduct) == 0 && expirationDateInMonths == product.expirationDateInMonths &&
                Objects.equals(nameOfTheProduct, product.nameOfTheProduct) && Objects.equals(brandOfTheProduct, product.brandOfTheProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct);
    }

}
