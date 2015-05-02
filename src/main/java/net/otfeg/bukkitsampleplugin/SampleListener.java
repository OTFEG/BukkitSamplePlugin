package net.otfeg.bukkitsampleplugin;

import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class SampleListener implements Listener{

	public SampleListener(BukkitSamplePlugin bukkitSamplePlugin) {
		bukkitSamplePlugin.getServer().getPluginManager().registerEvents(this, bukkitSamplePlugin);
	}
	void PlayerJoinEvent(PlayerJoinEvent event){
		
	}
}
