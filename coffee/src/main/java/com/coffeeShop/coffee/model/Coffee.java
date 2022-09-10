package com.coffeeShop.coffee.model;

import com.coffeeShop.coffee.model.constants.CoffeeSize;
import com.coffeeShop.coffee.model.constants.CoffeeTypes;

public class Coffee {

    private String name;
    private CoffeeTypes coffeeTypes;
    private double price;
    private boolean cream;
    private CoffeeSize coffeeSize;

    public Coffee(String name, CoffeeTypes coffeeTypes, double price, boolean cream, CoffeeSize coffeeSize) {
        this.name = name;
        this.coffeeTypes = coffeeTypes;
        this.price = price;
        this.cream = cream;
        this.coffeeSize = coffeeSize;
    }

    public Coffee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoffeeTypes getCoffeeTypes() {
        return coffeeTypes;
    }

    public void setCoffeeTypes(CoffeeTypes coffeeTypes) {
        this.coffeeTypes = coffeeTypes;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isCream() {
        return cream;
    }

    public void setCream(boolean cream) {
        this.cream = cream;
    }

    public CoffeeSize getCoffeeSize() {
        return coffeeSize;
    }

    public void setCoffeeSize(CoffeeSize coffeeSize) {
        this.coffeeSize = coffeeSize;
    }
}
