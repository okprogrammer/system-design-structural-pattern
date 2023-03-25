package com.design.pattern.structural.decorator;

import java.util.Base64;

public class HtmlEncodeMessage implements Message {

	private Message msg;

	public HtmlEncodeMessage(Message msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}

}
