package net.otfeg.bukkitsampleplugin;

import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitScheduler;

public class SampleSheduler extends BukkitRunnable{

	public SampleSheduler(BukkitSamplePlugin bukkitSamplePlugin) {
		runTask(bukkitSamplePlugin);
	}

	@Override
	public void run() {
	}

}
