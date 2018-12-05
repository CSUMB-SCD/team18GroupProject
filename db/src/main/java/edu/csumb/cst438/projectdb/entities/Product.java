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
    private int stock;
    private int quantity;

    public Product () {
        this.name = "";
        this.desc = "";
        this.price = 0;
        this.img = "";
        this.stock = 25;
        this.quantity = 0;
    }

    public Product (String name, String desc, double price, String img, int stock) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.img = img;
        this.stock = stock;
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
    public void setStock(int aStock){
        stock = aStock;
    }
    public void setQuantity(int aQuantity){
        quantity = aQuantity;
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
    public int getStock(){
        return this.stock;
    }
    public int geQuantity(){
        return this.quantity;
    }
}