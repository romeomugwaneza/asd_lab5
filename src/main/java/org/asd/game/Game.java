package org.asd.game;

public class Game {
    private int totalPoints = 0;
    private float level = 1;
    private GameState state;

    public float getLevel() {
        return level;
    }

    public void setLevel(float level) {
        this.level = level;
    }

    public Game(int totalPoints, float level) {
        this.level = level;
        this.totalPoints = totalPoints;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public GameState getState() {
        return state;
    }

    public void setState(GameState state) {
        this.state = state;
    }
    public void play(){
        state.play();
    }

    @Override
    public String toString() {
        return "Game:: " +
                " Points=" + totalPoints +
                ", level=" + getState().game.getLevel();
    }
}
