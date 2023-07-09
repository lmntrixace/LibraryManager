/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.librarymanagementsystem;


public class User {
    String id, password;
    public User(String id, String password){
        this.id = id;
        this.password = password;
    }
    public String getId(){
        return id;
    }
    public String getPassword(){
        return password;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setPassword(String password){
        this.password = password;
    }
}
