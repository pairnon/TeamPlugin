package io.papermc.teamplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.papermc.teamplugin.Main;
import io.papermc.teamplugin.classes.Team;

public class CommandJoinTeam implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        
        Player player = (Player) sender;

        if (args.length == 0) {
            Broadcasting.sendError(player, "You must specify a team name");
            return true;
        }

        String teamName = args[0];

        for (Team t : Main.teams) {
            if (teamName.equals(t.getTeamName())) {
                if (t.hasPlayer(player)) {
                    Broadcasting.sendError(player, "You are already in that team");
                    return true;
                }
            t.addPlayer(player);
            Broadcasting.sendSuccess(player, "Successfully joined " + t.getTeamName());
            return true;
            }
        }

        Broadcasting.sendError(player, "Team not found");


        return true;
    }

}
