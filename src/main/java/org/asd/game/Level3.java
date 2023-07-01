package org.asd.game;

import java.util.Random;

public class Level3 extends GameState {

    public Level3(Game game) {
        super(game);
    }

    @Override
    void play() {
        Random rnd = new Random();
        addPoints(rnd.nextInt(7));
    }

    @Override
    void addPoints(int points) {
        int totalPoints = game.getTotalPoints();
        int newPoints = totalPoints + (3 * points);
        game.setTotalPoints(newPoints);
    }

    @Override
    void upgradeLevel(int points) {
        //do nothing.
    }
}
