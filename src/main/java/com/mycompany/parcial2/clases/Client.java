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
public class Client extends User{
    private Double moneySpent;

    public Client(String nit, String name) {
        super(nit, name);
        this.moneySpent = 0.0;
    }    

    public Client() {
        
    }
    
    public void setMoneySpent(Double money){
        this.moneySpent = money;
    }
    
    public Double getMoneySpent(){
        return moneySpent;
    }
    
    public void incrementMoneySpent(Double money) {
        this.moneySpent += money;
    }
    
    public Object[] getInfoAndMoney(){
        Object[] o = new Object[2];
        o[0] = this.name;
        o[1] = this.moneySpent;
        return o;
    }
}
