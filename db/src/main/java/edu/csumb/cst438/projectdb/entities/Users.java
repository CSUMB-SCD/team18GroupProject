package edu.csumb.cst438.projectdb.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Users")
public class Users{
    @Id
    private String id;
    private String username;
    private String password;

    public Users(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.username = password;
    }

    public String getId(){
        return this.id;
    }

    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }   
}