package com.design.pattern.structural.flyweight;

import java.util.Random;

public class ClientCounterStrike {

	private static String[] playerType = { "Terrorist", "CounterTerrorist" };

	private static String[] weapons = { "AK-47", "Maverick", "Gut Knife", "Desert Eagle" };

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Player p = PlayerFactory.getPlayer(getRandomPlayerType());
			p.assignWeapon(getRandomWeapon());
			p.missin();
		}
	}

	private static String getRandomWeapon() {
		Random r = new Random();
		int randomInt = r.nextInt(weapons.length);
		return weapons[randomInt];
	}

	private static String getRandomPlayerType() {
		Random r = new Random();
		int randomInt = r.nextInt(playerType.length);
		return playerType[randomInt];
	}

}
