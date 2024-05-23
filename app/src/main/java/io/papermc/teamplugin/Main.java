package io.papermc.teamplugin;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import io.papermc.teamplugin.classes.Team;
import io.papermc.teamplugin.commands.CommandCreateTeam;

public class Main extends JavaPlugin implements Listener {

    public static ArrayList<Team> teams;

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

        this.getCommand("createteam").setExecutor(new CommandCreateTeam());

        teams = new ArrayList<Team>();
    }
}