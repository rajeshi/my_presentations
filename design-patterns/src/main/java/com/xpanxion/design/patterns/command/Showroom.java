package com.xpanxion.design.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    private final List<Order> orders = new ArrayList<>();

    public void takeOrder(Order order) {
        orders.add(order);
    }

    public void placeOrders() {
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
