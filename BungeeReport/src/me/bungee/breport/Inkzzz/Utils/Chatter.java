package me.bungee.breport.Inkzzz.Utils;

import net.md_5.bungee.api.ChatColor;

public class Chatter {

	public static String getReason(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < args.length; i++) {
			sb.append(args[i]).append(" ");
		}
		return sb.toString();
	}

	public static String color(String msg) {
		return ChatColor.translateAlternateColorCodes('&', msg);
	}

	public static String arrow() {
		return "»";
	}

}
