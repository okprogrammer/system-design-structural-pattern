package com.design.pattern.structural.flyweight;

public class CounterTerrorist implements Player {

	// Instrinsic Attribute
	private final String Task;

	// Extrinsic Attribute
	private String weapon;

	public CounterTerrorist() {
		this.Task = "DIFFUSE BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void missin() {
		System.out.println("Conter Terrorist with Weapon " + weapon + " | " + "Task is " + Task);

	}

}
