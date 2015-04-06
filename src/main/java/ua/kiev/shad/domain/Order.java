/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mitya
 */
@Component
@Scope("prototype")
public class Order {
    
    private int id;
    private Date date;
    private String name;
    private List<Pizza> pizzas;
    private int price;

    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
        this.name = String.valueOf(id) + date.toString();
        pizzas = new ArrayList<>();
        this.price = 0;
        
    }
    
    public Order() {
        this(0, new Date());
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    public void addItems(Pizza get, Pizza get0) {
        pizzas.add(get); 
        pizzas.add(get0);
        price += get.price;
        price += get0.price;
    }
    @Override
    public String toString() {
        return String.valueOf(id)+" " + date.toString()+ " " +
                String.valueOf(price) + pizzas.toString();
    }
    
}
