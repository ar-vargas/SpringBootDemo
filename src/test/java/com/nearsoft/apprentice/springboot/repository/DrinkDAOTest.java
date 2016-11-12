package com.nearsoft.apprentice.springboot.repository;

import com.nearsoft.apprentice.springboot.model.Drink;
import com.nearsoft.apprentice.springboot.model.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@ContextConfiguration(classes = CoffeeDAO.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class DrinkDAOTest {

    @Autowired
    private DrinkDAO dao;

    @Test
    public void daoShouldNotBeNull(){
        assertNotNull(dao);
    }

    @Test
    public void drinkShouldGetHotCoffee(){
        Drink coffee = dao.getDrink();
        assertEquals("DAO should be a coffee", coffee.getName(), "Coffee");
        assertEquals("Coffee should be hot", coffee.getType(), Type.HOT);
    }

}