package com.design.pattern.structural.decorator;

import java.util.Base64;

public class Base64EncodeMessage implements Message {

	private Message msg;

	public Base64EncodeMessage(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}

}
