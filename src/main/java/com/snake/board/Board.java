package com.snake.board;

public class Board {
    private final int width;
    private final int height;

    public Board(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("La largeur et la hauteur doivent être positives.");
        }
        this.width = width;
        this.height = height;
    }

    public int getWidth() { return width; }
    public int getHeight() { return height; }

    public boolean isInside(Position position) {
        return position != null
                && position.getX() >= 0 && position.getX() < width
                && position.getY() >= 0 && position.getY() < height;
    }
}
