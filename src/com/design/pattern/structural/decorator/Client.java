package com.design.pattern.structural.decorator;

public class Client {
	public static void main(String[] args) {
		Message m = new TextMessage("The <Force> is strong with this");
		System.out.println("My text content " + m.getContent());
		
		// Wrap decorator in another decorator
		m = new HtmlEncodeMessage(m);
		System.out.println(m.getContent());
		
		// Wrap decorator in another in another decorator
		m = new Base64EncodeMessage(m);
		System.out.println(m.getContent());
	}
}
