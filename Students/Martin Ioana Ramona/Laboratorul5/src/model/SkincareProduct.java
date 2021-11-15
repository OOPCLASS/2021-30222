package model;

import java.util.Objects;

public class SkincareProduct extends Product{
    private String skinType;
    private boolean fragranceFree;

    public SkincareProduct(String nameOfTheProduct, float priceOfTheProduct, int expirationDateInMonths, String brandOfTheProduct,
                           String skinType, boolean fragranceFree) {
        super(nameOfTheProduct, priceOfTheProduct, expirationDateInMonths, brandOfTheProduct);
        this.skinType=skinType;
        this.fragranceFree=fragranceFree;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public boolean isFragranceFree() {
        return fragranceFree;
    }

    public void setFragranceFree(boolean fragranceFree) {
        this.fragranceFree = fragranceFree;
    }

    @Override
    public String toString() {
        return "SkincareProduct{" +
                "nameOfTheProduct='" + getNameOfTheProduct() + '\'' +
                ", priceOfTheProduct=" + getPriceOfTheProduct() + '\'' +
                ", expirationDateInMonths=" + getExpirationDateInMonths() + '\'' +
                ", brandOfTheProduct='" + getBrandOfTheProduct() + '\'' +
                ", skinType='" + skinType + '\'' +
                ", fragranceFree=" + fragranceFree + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SkincareProduct that = (SkincareProduct) o;
        return fragranceFree == that.fragranceFree && Objects.equals(skinType, that.skinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), skinType, fragranceFree);
    }
}
