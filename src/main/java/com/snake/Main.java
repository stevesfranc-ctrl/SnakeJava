package com.snake;

import com.snake.game.Game;
import com.snake.ui.ConsoleRenderer;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        ConsoleRenderer renderer = new ConsoleRenderer();
        renderer.displayMenu();
        System.out.println("Squelette Snake initialisé. La boucle de jeu sera implémentée ensuite.");
    }
}
