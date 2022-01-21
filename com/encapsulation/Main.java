package com.encapsulation;

public class Main {
    // This example can be improven with proper encapsulation
    public static void main(String[] args) {
        Player player = new Player();
        player.name = "Tmi";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 21;
        player.health = 200;
        player.loseHealth(damage);

        // Enhanced player has proper encapsulation
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Time", 100, "Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHealth());
    }
}
