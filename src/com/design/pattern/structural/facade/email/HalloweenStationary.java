package com.design.pattern.structural.facade.email;

public class HalloweenStationary implements Stationary{

	@Override
	public String getHeader() {
		return "It's Halloweeen!!";
	}

	@Override
	public String getFooter() {
		return "BUY MORE STUFF! It's Halloween, c'mon!!";
	}

}
