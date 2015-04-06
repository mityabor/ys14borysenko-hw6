/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kiev.shad.domain.Pizza;
import ua.kiev.shad.repository.PizzaRepository;

/**
 *
 * @author Mitya
 */
@Service
public class SimplePizzaService implements PizzaService{

    private PizzaRepository pizzaRepository;

    @Autowired
    public SimplePizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }
    
    @Override
    public List<Pizza> getAllPizzas() {
        return pizzaRepository.getAllPizzas();
    }
    
}
