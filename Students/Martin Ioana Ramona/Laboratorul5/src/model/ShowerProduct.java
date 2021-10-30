package model;

import java.util.Objects;

public class ShowerProduct extends Product{
    private String scent;

    public ShowerProduct(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths,
                         String brandOfTheProduct, String scent) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct);
        this.scent=scent;
    }

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public String toString() {
        return "ShowerProduct{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", scent='" + scent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShowerProduct that = (ShowerProduct) o;
        return Objects.equals(scent, that.scent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), scent);
    }
}
