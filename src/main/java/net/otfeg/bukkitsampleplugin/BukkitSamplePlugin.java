package net.otfeg.bukkitsampleplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class BukkitSamplePlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		saveDefaultConfig();
		new SampleCommand(this);
		new SampleListener(this);
		new SampleSheduler(this);
	}
}
