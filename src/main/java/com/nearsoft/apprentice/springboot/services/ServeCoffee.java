package com.nearsoft.apprentice.springboot.services;

import com.nearsoft.apprentice.springboot.model.Drink;
import com.nearsoft.apprentice.springboot.repository.DrinkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServeCoffee implements ServeDrink {

    @Autowired
    private DrinkDAO drinkDAO;

    @Override
    public Drink serveDrink() {
        Drink drink = drinkDAO.getDrink();
        System.out.println("Serves a "+ drink +".");
        return drink;
    }
}
