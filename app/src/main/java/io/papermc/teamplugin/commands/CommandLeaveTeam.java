package io.papermc.teamplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import io.papermc.teamplugin.Main;
import io.papermc.teamplugin.classes.Team;
import io.papermc.teamplugin.classes.TeamMember;

@SuppressWarnings("deprecation")
public class CommandLeaveTeam implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player) sender;

        String playerName = player.getDisplayName();

        for (int i = 0; i < Main.teamMembers.size(); i++) {
            TeamMember tm = Main.teamMembers.get(i);
            if (tm.getPlayerName().equals(playerName) && tm.isInTeam()) {
                removePlayerFromTeam(player, tm.getTeamName());
            }
        }

        return true;

    }

    private void removePlayerFromTeam(Player player, String t) {
        for (int i = 0; i < Main.teams.size(); i++) {

            Team team = Main.teams.get(i);

            if (team.hasPlayer(player)) {
                Main.teams.get(i).removePlayer(player);
            }

        }
    }
}
