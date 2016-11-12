package com.nearsoft.apprentice.springboot.controller;

import com.nearsoft.apprentice.springboot.model.Drink;
import com.nearsoft.apprentice.springboot.services.ServeDrink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DrinkController {

    @Autowired
    ServeDrink serveDrink;

    @RequestMapping("/serve")
    public String serve(){
        Drink drink = serveDrink.serveDrink();
        return "Please, enjoy your "+drink.toString();
    }

}
