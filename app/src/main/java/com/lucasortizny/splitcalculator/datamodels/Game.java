package com.lucasortizny.splitcalculator.datamodels;


/**
 * This is going to be the primary Game Class meant to contain information related to a specific
 * game.
 */

public class Game {
    public String gameName;
    public String platform; //This is going to be generically specified.

    public Game(){

    }

    public Game(String gameName, String platform) {
        this.gameName = gameName;
        this.platform = platform;
    }
    public Game(String gameName) {
        this.gameName = gameName;
        this.platform = null;
    }

    public String getGameName() {
        return gameName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}
