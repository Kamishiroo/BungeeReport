package me.bungee.breport.Inkzzz;

import me.bungee.breport.Inkzzz.Commands.ReportCMD;
import net.md_5.bungee.api.plugin.Plugin;

public class Main extends Plugin {

	private static Main instance;

	public void onEnable() {
		instance = this;
		getProxy().getPluginManager().registerCommand(this, new ReportCMD());
	}
	
	public static Main getInstance() {
		return instance;
	}

}
