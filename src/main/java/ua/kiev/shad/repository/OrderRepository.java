/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.repository;

import java.util.List;
import ua.kiev.shad.domain.Order;

/**
 *
 * @author Mitya
 */
public interface OrderRepository {

    public int getNewOrderID();

    public void saveOrder(Order order);

    public List<Order> getAllOrders();
    
}
