package com.teamtreehouse.model;

import java.util.TreeMap;
import java.util.Map;

public class Players implements Comparable {
    private static Map<String,Player> mPlayers = new TreeMap<>();
    private static Player[] playerList = load();

    public static Player[] load() {
        return new Player[]{
                new Player("Joe", "Smith", 42, true),
                new Player("Jill", "Tanner", 36, true),
                new Player("Bill", "Bon", 43, true),
                new Player("Eva", "Gordon", 45, false),
                new Player("Matt", "Gill", 40, false),
                new Player("Kimmy", "Stein", 41, false),
                new Player("Sammy", "Adams", 45, false),
                new Player("Karl", "Saygan", 42, true),
                new Player("Suzane", "Greenberg", 44, true),
                new Player("Sal", "Dali", 41, false),
                new Player("Joe", "Kavalier", 39, false),
                new Player("Ben", "Finkelstein", 44, false),
                new Player("Diego", "Soto", 41, true),
                new Player("Chloe", "Alaska", 47, false),
                new Player("Arfalseld", "Willis", 43, false),
                new Player("Phillip", "Helm", 44, true),
                new Player("Les", "Clay", 42, true),
                new Player("Herschel", "Krustofski", 45, true),
                new Player("Andrew", "Chalklerz", 42, true),
                new Player("Pasan", "Membrane", 36, true),
                new Player("Kenny", "Lovins", 35, true),
                new Player("Alena", "Sketchings", 45, false),
                new Player("Carling", "Seacharpet", 40, false),
                new Player("Joseph", "Freely", 41, false),
                new Player("Gabe", "Listmaker", 45, false),
                new Player("Jeremy", "Smith", 42, true),
                new Player("Ben", "Droid", 44, true),
                new Player("James", "Dothnette", 41, false),
                new Player("Nick", "Grande", 39, false),
                new Player("Will", "Guyam", 44, false),
                new Player("Jason", "Seaver", 41, true),
                new Player("Johnny", "Thunder", 47, false),
                new Player("Ryan", "Creedson", 43, false)
        };

    }

    public static void loadListToMap(){
        for (Player player : playerList){
            String first = player.getFirstName();
            String last = player.getLastName();
            String name = first + " " + last;
            mPlayers.put(name, player);
        }
    }

    public static void setMaxTeams(){
        int max = (playerList.length / 5);
        Teams.setMaxTeams(max);
    }

    static void listPlayers(){
        for (Player player : mPlayers.values()){
            String print = String.format("%s %s Height: %s Previous Experience: %s",
                                            player.getFirstName(),
                                            player.getLastName(),
                                            player.getHeightInInches(),
                                            player.isPreviousExperience());
            System.out.println(print);
        }
    }

    static Player getPlayer(String playerName){
        Player player = mPlayers.get(playerName);
        mPlayers.remove(playerName);
        return player;
    }

    static void addPlayer(String name, Player player){
        mPlayers.put(name,player);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}