package org.drools6.ddengine.model;

import org.drools6.ddengine.enums.ClassCar;

public class Product
{
    private String productName;
    private double productCost;
    private double productPrice;
    private ClassCar classCar = ClassCar.NOTDEFINED;
    


    public Product(String productName, double productCost, double productPrice){

        this.productName = productName;
        this.productCost = productCost;
        this.productPrice = productPrice;

    } 

    public String getProductName(){
        return this.productName;
    }
    public void setProductName(String name){
        this.productName = name;
    }

    public double getProductCost(){
        return this.productCost;
    }
    public void setProductCost(double cost){
        this.productCost = cost;
    }

    public double getProductPrice(){
        return this.productPrice;
    }
    public void setProductPrice(double price){
        this.productPrice = price;
    }

    public ClassCar getClassCar(){
        return this.classCar;
    }
    public void setClassCar(ClassCar classCar){
        this.classCar = classCar;
    }
}

