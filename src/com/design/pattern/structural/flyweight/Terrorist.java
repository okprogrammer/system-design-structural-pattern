package com.design.pattern.structural.flyweight;

public class Terrorist implements Player {

	// Instrinsic Attribute
	private final String Task;

	// Extrinsic Attribute
	private String weapon;

	public Terrorist() {
		this.Task = "PLANT A BOMB";
	}

	@Override
	public void assignWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public void missin() {
		System.out.println("Terrorist with weapon " + weapon + " | " + "Task is " + Task);

	}

	@Override
	public String toString() {
		return "Terrorist [Task=" + Task + ", weapon=" + weapon + "]";
	}
}
