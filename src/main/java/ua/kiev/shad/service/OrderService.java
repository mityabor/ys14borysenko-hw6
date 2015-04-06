/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.service;

import java.util.List;
import ua.kiev.shad.domain.Order;

/**
 *
 * @author Mitya
 */
public interface OrderService {

    List<Order> getAllOrders();
    void placeOrder(Order order);
    Order createNewOrder();
}
