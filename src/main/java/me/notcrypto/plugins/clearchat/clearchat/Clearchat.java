package me.notcrypto.plugins.clearchat.clearchat;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Clearchat extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("ClearChat is enabled");
        getConfig().addDefault("broadcast", "&aChat has been cleared by &7&l%player%");
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

    @Override
    public void onDisable() {
        getLogger().info("ClearChat is Disabled");
        // Plugin shutdown logic
    }
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player player = (Player) sender;
        if ((commandLabel.equalsIgnoreCase("clearchat") || commandLabel.equalsIgnoreCase("cc")) &&
                !sender.hasPermission("clearchat.clear")) {
            sender.sendMessage(ChatColor.DARK_RED + "You dont have the enough permissions to execute this command!");
            return true;
        }
        Bukkit.broadcastMessage(" \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', getConfig().getString("broadcast")).replaceAll("%player%", player.getPlayerListName()));
        return true;
    }
}
