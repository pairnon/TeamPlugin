package io.papermc.teamplugin.commands;

import org.bukkit.entity.Player;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class Broadcasting {

    public static void sendMessage(Player player, String message) {
        player.sendMessage(Component.text("[TeamPlugin]" + message, NamedTextColor.GOLD));
    }
    
    public static void sendSuccess(Player player, String message) {
        player.sendMessage(Component.text("[TeamPlugin]" + message, NamedTextColor.GREEN));
    }

    public static void sendError(Player player, String message) {
        player.sendMessage(Component.text("[TeamPlugin]" + message, NamedTextColor.RED));
    }

}
