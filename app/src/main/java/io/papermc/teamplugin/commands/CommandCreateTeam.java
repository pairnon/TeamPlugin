package io.papermc.teamplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.papermc.teamplugin.Main;
import io.papermc.teamplugin.classes.Team;

public class CommandCreateTeam implements CommandExecutor {
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        if (args.length == 0) { return false; }

        String teamName = args[0];

        for (Team t : Main.teams) {
            if (teamName.equals(t.getTeamName())) {
                Broadcasting.sendError(player, "A team with that name already exists");
                return true;
            }
        }


        Main.teams.add(new Team(teamName));

        Broadcasting.sendSuccess(player, "Created team with name " + teamName);


        return true;
    }
}
