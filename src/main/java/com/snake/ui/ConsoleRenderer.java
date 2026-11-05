package com.snake.ui;

import com.snake.board.Board;
import com.snake.food.Food;
import com.snake.score.ScoreManager;
import com.snake.snake.Snake;

public class ConsoleRenderer {
    public void displayBoard(Board board, Snake snake, Food food, ScoreManager scoreManager) {
        // TODO : afficher le plateau, le serpent, la nourriture et le score.
    }

    public void displayMenu() {
        System.out.println("=== SNAKE ===");
        System.out.println("Le jeu est en cours de construction.");
    }

    /***
     *
     * @param finalScore
     */
    public void displayGameOver(int finalScore) {
        System.out.println("GAME OVER - Score : " + finalScore);
    }
}
