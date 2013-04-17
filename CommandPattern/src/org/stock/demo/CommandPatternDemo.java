package org.stock.demo;

import org.stock.Broker;
import org.stock.Stock;
import org.stock.order.BuyStock;
import org.stock.order.SellStock;

public class CommandPatternDemo {
	public static void main(String[] args) {
		Stock abcStock = new Stock();
		
		BuyStock buyStock = new BuyStock(abcStock);
		SellStock sellStock = new SellStock(abcStock);
		
		Broker broker = new Broker();
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStock);
		broker.placeOrders();
	}
}
