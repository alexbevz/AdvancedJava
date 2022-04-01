package ru.bevz.aj.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player) {
        players.add(player);
        System.out.println("Team update: add a new player: " + player.getName());
    }

    public void playWith(Team team) {
        Random random = new Random();
        int i = random.nextInt(2);
        String winner = i == 0 ? this.getName() : team.getName();
        System.out.println("The winner is " + winner);
    }
}
