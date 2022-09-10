package com.coffeeShop.coffee.model;

import com.coffeeShop.coffee.Service.CoffeeWorkersService;

public class CoffeeWorkers implements CoffeeWorkersService {
    private String name;
    private int coffeeInStock;
    private int hoursAccumulated;
    private boolean overTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoffeeInStock() {
        return coffeeInStock;
    }

    public void setCoffeeInStock(int coffeeInStock) {
        this.coffeeInStock = coffeeInStock;
    }

    public int getHoursAccumulated() {
        return hoursAccumulated;
    }

    public void setHoursAccumulated(int hoursAccumulated) {
        this.hoursAccumulated = hoursAccumulated;
    }

    public boolean isOverTime() {
        return overTime;
    }

    public void setOverTime(boolean overTime) {
        this.overTime = overTime;
    }

    @Override
    public String overTimeMessage(){
        if(isOverTime())
        {
            return "You're Fired!";
        }
        else {
            return "Get back to Work";
        }
    }


}
