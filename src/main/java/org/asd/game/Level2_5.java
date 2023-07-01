package org.asd.game;

import java.util.Random;

public class Level2_5 extends GameState{
    public Level2_5(Game game) {
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
        if (points >= 20){
            game.setLevel(3);
            game.setTotalPoints(points + 2);
            GameState gameState = new Level3(game);
            game.setState(gameState);
        }

    }
}
