package io.papermc.teamplugin.classes;

import java.util.ArrayList;

import org.bukkit.entity.Player;

@SuppressWarnings("deprecation")
public class Team {
    
    private String teamName;
    private ArrayList<String> teamPlayers;

    public Team(String name) {
        teamName = name;
        teamPlayers = new ArrayList<String>();
    }

    public void addPlayer(Player player) {
        teamPlayers.add(player.getDisplayName());
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String name) {
        teamName = name;
    }

}
