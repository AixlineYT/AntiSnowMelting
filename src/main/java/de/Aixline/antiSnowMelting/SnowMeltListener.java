package de.Aixline.antiSnowMelting;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;

final class SnowMeltListener implements Listener {

    private final AntiSnowMelting plugin;

    SnowMeltListener(AntiSnowMelting plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onSnowMelt(BlockFadeEvent event) {
        if (plugin.isPreventingSnowMelting()
                && event.getBlock().getType().name().contains("SNOW")) {
            event.setCancelled(true);
        }
    }
}
