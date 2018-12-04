package edu.csumb.cst438.projectdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Product")
public class Product {
    @Id
    private String id;
    private String name;
    private String desc;
    private double price;
    private String img;

    public Product (String name, String desc, double price, String img) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.img = img;
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
    public void setImg(String aImg){
        img = aImg;
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
    public String getImg(){
        return this.img;
    }
}