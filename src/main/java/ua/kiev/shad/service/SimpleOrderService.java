/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;
import ua.kiev.shad.domain.Order;
import ua.kiev.shad.domain.Pizza;
import ua.kiev.shad.repository.OrderRepository;

/**
 *
 * @author Mitya
 */

@Service(value = "orderService")
public class SimpleOrderService implements OrderService{

    private OrderRepository orderRepository;

    @Autowired
    public SimpleOrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    
    @Override
    public List<Order> getAllOrders() {
        return orderRepository.getAllOrders(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void placeOrder(Order order) {
        orderRepository.saveOrder(order); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Order createNewOrder() {
        int newOrderId = orderRepository.getNewOrderID(); //To change body of generated methods, choose Tools | Templates.
        Date date = new Date();
//        Order  newOrder = new Order(newOrderId, date);
        Order newOrder = createOrder();
        newOrder.setDate(date);
        newOrder.setId(newOrderId);
        newOrder.setName(date.toString()+" "+String.valueOf(newOrderId));
        newOrder.setPizzas(new ArrayList<Pizza>());
        newOrder.setPrice(0);
        return newOrder;
    }
    
    @Lookup
    protected  Order createOrder()
    {
        return null;
    }
    
}
