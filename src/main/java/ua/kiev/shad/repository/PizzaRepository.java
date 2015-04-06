/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.repository;

import java.util.List;
import ua.kiev.shad.domain.Pizza;

/**
 *
 * @author Mitya
 */
public interface PizzaRepository {

    public List<Pizza> getAllPizzas();
    
}
