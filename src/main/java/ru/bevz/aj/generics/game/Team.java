package ru.bevz.aj.generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T>{
    private String name;
    private List<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getPlayers() {
        return players;
    }

    public void setPlayers(List<T> players) {
        this.players = players;
    }

    public void addPlayer(T player) {
        players.add(player);
        System.out.println("Team update: add a new player: " + ((Player) player).getName());
    }

    public void playWith(Team<T> team) {
        Random random = new Random();
        int i = random.nextInt(2);
        String winner = i == 0 ? this.getName() : team.getName();
        System.out.println("The winner is " + winner);
    }
}
