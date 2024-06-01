package io.papermc.teamplugin.classes;

public class TeamMember {

    private String playerName;
    private String teamName;

    public TeamMember(String p, String t) {
        playerName = p;
        teamName = t;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isInTeam() {
        return (teamName != null);
    }

    public void setPlayerName(String p) {
        playerName = p;
    }

    public void setTeamName(String t) {
        teamName = t;
    }
    
}
