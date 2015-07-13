package com.xpanxion.design.patterns.command;

public class BuyOrder implements Order {

    private final Trade trade;

    public BuyOrder(Trade trade) {
        this.trade = trade;
    }

    @Override
    public void execute() {
        trade.buy();
    }

}
