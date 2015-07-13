package com.xpanxion.design.patterns.command;

public class SellOrder implements Order {

    private final Trade trade;

    public SellOrder(Trade trade) {
        this.trade = trade;
    }

    @Override
    public void execute() {
        trade.sell();
    }

}
