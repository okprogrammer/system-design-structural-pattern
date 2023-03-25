package com.design.pattern.structural.facade.email;

public class StationFactory {

	public static Stationary creatStationary() {
		return new HalloweenStationary();
	}

}
