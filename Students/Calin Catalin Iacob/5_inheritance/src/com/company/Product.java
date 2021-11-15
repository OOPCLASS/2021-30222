package com.company;

public class Product {
    protected String name ;
    protected int price;


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public float getWeight() {
        return 1;
    }


   public String getSpecification(){
        return "default-specification";
   }

}

