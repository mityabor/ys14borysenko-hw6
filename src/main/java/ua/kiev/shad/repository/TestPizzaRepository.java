/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import ua.kiev.shad.domain.Pizza;

/**
 *
 * @author Mitya
 */

public class TestPizzaRepository implements PizzaRepository{

    List<Pizza> pizzas ;

    public TestPizzaRepository() {
    
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    
    @Override
    public List<Pizza> getAllPizzas() {
        return pizzas; 
    }
}
