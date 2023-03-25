package com.design.pattern.structural.facade;

import com.design.pattern.structural.facade.email.EmailFacade;

public class Client {

	public static void main(String[] args) {
		Order order = new Order("101", 99.99);
		EmailFacade facade = new EmailFacade();
		boolean result = facade.sendOrderEmail(order);
		System.out.println("Order Email " + (result ? "sent" : "Not sent...."));
	}

}
