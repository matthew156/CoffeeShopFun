package com.coffeeShop.coffee.model;

import com.coffeeShop.coffee.Service.CustomerService;
import com.coffeeShop.coffee.model.constants.CoffeeTypes;
import org.springframework.beans.factory.annotation.Autowired;

public class Customers implements CustomerService {
    private String fName;
    @Autowired
    private Coffee coffee;
    private double money;


    public Customers(String fName, Coffee coffee, double money) {
        this.fName = fName;
        this.coffee = coffee;
        this.money = money;
    }
    

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void order(){
        if(this.coffee.getCoffeeTypes() == CoffeeTypes.ESPRESSO){
            setMoney(this.money - 4.50);
        }
        else {
            setMoney(this.money-4.00);
        }
    }
    
    
    
    
    
    
}
