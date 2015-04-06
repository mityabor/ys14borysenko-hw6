/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.domain;

/**
 *
 * @author Mitya
 */
public class Pizza {
    
    public static enum PizzaType {
        Vegetarian, Sea, Meat;    
    }
    
    String name;
    int price;
    PizzaType pizzaType;

    public Pizza(int price, PizzaType pizzaType) {
        name =  String.valueOf(price);
        this.price = price;
        this.pizzaType = pizzaType;
        
    }

    @Override
    public String toString() {
        return "Pizza{" + "name=" + name + ", price=" + price + ", type=" + pizzaType + '}';
    }
    
    
}
