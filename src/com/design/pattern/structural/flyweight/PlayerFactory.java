package com.design.pattern.structural.flyweight;

import java.util.HashMap;

public class PlayerFactory {

	private static HashMap<String, Player> hm = new HashMap<>();

	// method to get player

	public static Player getPlayer(String type) {
		Player p = null;

		if (hm.containsKey(type)) {
			p = hm.get(type);
		} else {
			switch (type) {
			case "Terrorist":
				p = new Terrorist();
				break;
			case "CounterTerrorist":
				p = new CounterTerrorist();
				break;
			default:
				System.out.println("Unreachable code!");
				break;
			}
			hm.put(type, p);
		}
		return p;
	}

}
