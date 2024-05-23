package io.papermc.teamplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.papermc.teamplugin.Main;
import io.papermc.teamplugin.classes.Team;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public class CommandListTeams implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        String teamList = "List of teams: ";

        for (Team t : Main.teams) {
            teamList += t.getTeamName();
            teamList += "; ";
        }

        player.sendMessage(Component.text(teamList, NamedTextColor.GOLD));


        
        return true;
    }
}