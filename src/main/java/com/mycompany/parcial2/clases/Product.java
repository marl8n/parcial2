/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial2.clases;

import static com.mycompany.parcial2.clases.productUtils.ProductUtils.isInStock;

/**
 *
 * @author marl8n
 */
public class Product {
    protected String code;
    protected String name;
    protected Integer quantity;
    protected Double price;
    protected boolean inStock;

    public Product(){
        
    }
    
    public Product(String code, String name, Integer quantity, Double price) {
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.inStock = isInStock.test(this.quantity);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void incrementQuantity(int newProducts){
        this.quantity += newProducts;
    }
    
    public void decrementQuantity(int productsPurchased){
        if(productsPurchased < this.quantity){
            this.quantity -= productsPurchased;
        }
    }
    
    public Object[] getInfoAsObjectArray(){
        Object[] o = new Object[3];
        o[0] = this.name;
        o[1] = this.quantity;
        o[2] = this.price;
        
        return o;
    }
}
