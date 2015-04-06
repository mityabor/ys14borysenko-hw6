/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.kiev.shad.main;

import java.util.List;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.kiev.shad.domain.Order;
import ua.kiev.shad.domain.Pizza;
import ua.kiev.shad.service.OrderService;
import ua.kiev.shad.service.PizzaService;

/**
 *
 * @author Mitya
 */
public class AppRunner {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext
                = new ClassPathXmlApplicationContext("annotationConfig.xml");
        for (String str : appContext.getBeanDefinitionNames()) {
            System.out.println(str);
        }
        System.out.println(" ______________");
        String[] paths = {"annotationConfigChild.xml"};
        ConfigurableApplicationContext appContextChild
                = new ClassPathXmlApplicationContext(paths, appContext);
        for (String str : appContextChild.getBeanDefinitionNames()) {
            System.out.println(str);
        }
        PizzaService pizzaService = appContextChild.getBean(PizzaService.class);
        List<Pizza> pizzas = pizzaService.getAllPizzas();

        OrderService orderService = appContextChild.getBean("orderService", OrderService.class);

        Order newOrder1 = orderService.createNewOrder();
        newOrder1.addItems(pizzas.get(0), pizzas.get(1));
        orderService.placeOrder(newOrder1);

        Order newOrder2 = orderService.createNewOrder();
        newOrder2.addItems(pizzas.get(0), pizzas.get(2));
        orderService.placeOrder(newOrder2);
        List<Order> orders = orderService.getAllOrders();

        orders.stream().forEach(System.out::println);

    }

}
