package edu.csumb.cst438.productdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class Product {
    @Id
    private String id;
    private String name;
    private String desc;
    private double price;

    public Product (String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public void setName(String aName){
        name = aName;
    }
    public void setDesc(String aDesc){
        desc = aDesc;
    }
    public void setPrice(double aPrice){
        price = aPrice;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public String getDesc(){
        return this.desc;
    }
    public double getPrice(){
        return this.price;
    }
}