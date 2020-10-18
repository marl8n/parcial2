/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial2.clases;

/**
 *
 * @author marl8n
 */
public abstract class User {
    protected String nit;
    protected String name;
    
    public User(){
        
    }

    public User(String nit, String name) {
        this.nit = nit;
        this.name = name;
    }
    
    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
