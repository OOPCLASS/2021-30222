package model;

import java.util.Objects;

public class Shampoo extends ShowerProduct{
    private String hairType;

    public Shampoo(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                   String scent, String hairType) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct, scent);
        this.hairType=hairType;
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }

    @Override
    public String toString() {
        return "Shampoo{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", scent='" + getScent() + '\'' +
                ", hairType='" + hairType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Shampoo shampoo = (Shampoo) o;
        return Objects.equals(hairType, shampoo.hairType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hairType);
    }
}
