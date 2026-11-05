package com.snake.game;

public class GameLoop {
    public void run(Game game) {
        game.start();
        // TODO : implémenter la boucle avec temporisation et arrêt sur GAME_OVER ou EXIT.
        game.update();
    }
}
