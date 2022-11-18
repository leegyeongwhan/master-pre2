package com.week3.playboard;

public class MainBoard {
    public static void main(String[] args) {

        Player player = new Player();
        PlayerLevel beginnerLevel = new BeginnerLevel();
        player.upgradeLevel(beginnerLevel);
        player.getLevel().showLevelMessage();
        player.play(1);

        PlayerLevel advanccedLevel = new AdvanccedLevel();
        player.upgradeLevel(advanccedLevel);
        player.getLevel().showLevelMessage();
        player.play(2);

        PlayerLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.getLevel().showLevelMessage();
        player.play(3);

    }
}
