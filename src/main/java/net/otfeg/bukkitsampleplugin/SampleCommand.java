package net.otfeg.bukkitsampleplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SampleCommand implements CommandExecutor{

	public SampleCommand(BukkitSamplePlugin bukkitSamplePlugin) {
		bukkitSamplePlugin.getCommand("command").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		return false;
	}
}
