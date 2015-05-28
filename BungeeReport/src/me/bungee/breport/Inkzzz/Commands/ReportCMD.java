package me.bungee.breport.Inkzzz.Commands;

import me.bungee.breport.Inkzzz.Utils.Chatter;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

public class ReportCMD extends Command {

	public ReportCMD() {
		super("report", null);
	}

	@SuppressWarnings("deprecation")
	@Override
	public void execute(CommandSender sender, String[] args) {
		ProxiedPlayer p = (ProxiedPlayer) sender;
		if (args.length < 2) {
			p.sendMessage(Chatter.color("&c&lReport &8&l"
					+ Chatter.arrow()
					+ " &7To report a player use the command &e/report <player> <reason>&7."));
			return;
		} else {
			ProxiedPlayer target = ProxyServer.getInstance().getPlayer(args[0]);
			if (target != null) {
				for (ProxiedPlayer on : ProxyServer.getInstance().getPlayers()) {
					if (on.hasPermission("report.staff")) {
						on.sendMessage(Chatter.color("&8&l[&c&lSTAFF&8&l] &e"
								+ p.getName() + " &7has reported &e"
								+ target.getName() + " &7for &e"
								+ Chatter.getReason(args)));
					}
				}
				p.sendMessage(Chatter.color("&c&lReport &8&l" + Chatter.arrow()
						+ " &7Your report has been recorded!"));
				return;
			}
		}
	}
}
