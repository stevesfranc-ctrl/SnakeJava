package com.snake.score;

public class ScoreManager {
    private int score;

    public void addPoints(int points) {
        if (points < 0) throw new IllegalArgumentException("Le nombre de points ne peut pas être négatif.");
        score += points;
    }

    public int getScore() { return score; }
    public void reset() { score = 0; }
}
