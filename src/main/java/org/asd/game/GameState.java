package org.asd.game;

import org.asd.game.Game;

public abstract class GameState {
    protected final Game game;

    public GameState(Game game) {
        this.game = game;
    }

    abstract void play();

    abstract void addPoints(int points);
    abstract void upgradeLevel(int points);
}
