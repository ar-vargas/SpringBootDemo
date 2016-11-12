package com.nearsoft.apprentice.springboot.repository;

import com.nearsoft.apprentice.springboot.model.Drink;
import com.nearsoft.apprentice.springboot.model.Type;
import org.springframework.stereotype.Repository;

@Repository
public class CoffeeDAO implements DrinkDAO {

    @Override
    public Drink getDrink() {
        //Simulate we get values from DB
        Drink coffee = new Drink();
        coffee.setName("Coffee");
        coffee.setType(Type.HOT);
        return coffee;
    }
}
