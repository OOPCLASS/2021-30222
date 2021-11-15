package model;

import java.util.Objects;

public class ShowerGel extends ShowerProduct{
    private String skinType;

    public ShowerGel(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                     String scent, String skinType) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct, scent);
        this.skinType=skinType;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    @Override
    public String toString() {
        return "ShowerGel{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", scent='" + getScent() + '\'' +
                ", skinType='" + skinType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ShowerGel showerGel = (ShowerGel) o;
        return Objects.equals(skinType, showerGel.skinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skinType);
    }
}
