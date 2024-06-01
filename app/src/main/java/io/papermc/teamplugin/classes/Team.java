package io.papermc.teamplugin.classes;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import io.papermc.teamplugin.Main;

@SuppressWarnings("deprecation")
public class Team {
    
    private String teamName;
    private ArrayList<String> teamPlayers;

    public Team(String name) {
        teamName = name;
        teamPlayers = new ArrayList<String>();
    }

    public void addPlayer(Player player) {
        String playerName = player.getDisplayName();
        Main.teamMembers.add(new TeamMember(playerName, teamName));
        teamPlayers.add(playerName);
    }

    public boolean hasPlayer(Player player) {
        return (teamPlayers.contains(player.getDisplayName()));
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String name) {
        teamName = name;
    }

}
