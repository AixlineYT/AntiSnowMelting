package de.Aixline.antiSnowMelting;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSnowMelting extends JavaPlugin {

    private boolean preventSnowMelting = true;

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new SnowMeltListener(this), this);
        getLogger().info("AntiSnowMelting enabled.");
    }

    @Override
    public void onDisable() {
        getLogger().info("AntiSnowMelting disabled.");
    }

    boolean isPreventingSnowMelting() {
        return preventSnowMelting;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!command.getName().equalsIgnoreCase("antisnowmelting")) {
            return false;
        }

        if (args.length == 1 && args[0].equalsIgnoreCase("on")) {
            preventSnowMelting = true;
            sender.sendMessage(ChatColor.GREEN + "Snow melting prevention enabled!");
            return true;
        }

        if (args.length == 1 && args[0].equalsIgnoreCase("off")) {
            preventSnowMelting = false;
            sender.sendMessage(ChatColor.RED + "Snow melting prevention disabled!");
            return true;
        }

        sender.sendMessage(ChatColor.YELLOW + "Usage: /antisnowmelting <on|off>");
        return false;
    }
}
