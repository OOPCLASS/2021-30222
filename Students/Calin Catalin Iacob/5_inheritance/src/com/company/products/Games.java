package com.company.products;

import com.company.Product;

public class Games extends Product {
    protected int pegi;
    protected String  license;
    protected String producer;

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

@Override
    public String getSpecification(){
        return producer + " " + String.valueOf(pegi);
    }
}
