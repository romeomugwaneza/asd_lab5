package org.asd.game;

import java.util.Random;

public class Level2 extends GameState {

    public Level2(Game game) {
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
        int newPoints = totalPoints + (2 * points);
        game.setTotalPoints(newPoints);
        upgradeLevel(newPoints);
    }

    @Override
    void upgradeLevel(int points) {
        if (points >= 15){
            game.setLevel(2.5F);
            game.setTotalPoints(points + 1);
            GameState gameState = new Level2_5(game);
            game.setState(gameState);
        }

    }
}
