package com.company.products;

import com.company.Product;

public class Computers extends Product {
    private  int ramMemory;
    private int romMemory;
    private String brand;
    private String model;


    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getRomMemory() {
        return romMemory;
    }

    public void setRomMemory(int romMemory) {
        this.romMemory = romMemory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



    @Override
    public String getSpecification() {
        return brand + " " + model + " " + String.valueOf(ramMemory) +"GB RAM " ;
    }
}
