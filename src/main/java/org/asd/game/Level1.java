package org.asd.game;

import java.util.Random;

public class Level1 extends GameState {
    public Level1(Game game) {
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
        int newPoints = totalPoints + points;
        game.setTotalPoints(newPoints);
        upgradeLevel(newPoints);
    }

    @Override
    void upgradeLevel(int points) {
        if (points >= 10){
            game.setLevel(2);
            game.setTotalPoints(points + 1);
            GameState gameState = new Level2(game);
            game.setState(gameState);
        }
    }

}
