/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.repository;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import ua.kiev.shad.domain.Order;

/**
 *
 * @author Mitya
 */
@Repository
public class TestOrderRepository implements OrderRepository{

    List<Order> orderList;
    int id = 0;

    public TestOrderRepository() {
        orderList = new ArrayList<Order>();
        id = 0;
    }
    
    @Override
    public int getNewOrderID() {
        return ++id;
    }

    @Override
    public void saveOrder(Order order) {
        orderList.add(order);
    }
    
    @Override
    public List<Order> getAllOrders() {
        return orderList;
    }
}
