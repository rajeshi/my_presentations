package com.xpanxion.design.patterns.command;

public class Client {

    public static void main(String[] args) {
        Trade trade = new Trade();

        BuyOrder bo = new BuyOrder(trade);
        SellOrder so = new SellOrder(trade);

        Showroom showroom = new Showroom();
        showroom.takeOrder(bo);
        showroom.takeOrder(so);

        showroom.placeOrders();
    }
}
