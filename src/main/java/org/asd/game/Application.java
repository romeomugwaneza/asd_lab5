package org.asd.game;

public class Application {
    public static void main(String[] args) {
        Game game = new Game(0, 1);
        game.setState(new Level1(game));
        game.play();
        System.out.println(game);
        game.play();
        System.out.println(game);
        game.play();
        System.out.println(game);
        game.play();
        System.out.println(game);
        game.play();
        System.out.println(game);

    }
}
