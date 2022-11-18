package com.week3.playboard;

public class Player {
    private PlayerLevel level;

    public void play(int time) {
        this.level.go(time);
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;

    }
    public PlayerLevel getLevel() {
        return level;
    }
}
