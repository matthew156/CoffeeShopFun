package com.coffeeShop.coffee.controller;


import com.coffeeShop.coffee.model.Coffee;
import com.coffeeShop.coffee.model.constants.CoffeeSize;
import com.coffeeShop.coffee.model.constants.CoffeeTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class CoffeeController {
    @GetMapping("/coffeelist")
    public String coffeeList(Model model)
    {
        Coffee coffee = new Coffee("Special", CoffeeTypes.CAPPUCINO, 2.50,false, CoffeeSize.MEDIUM);
        model.addAttribute("coffeeType", coffee.getCoffeeTypes());
        return "coffeelist";


    }
}
