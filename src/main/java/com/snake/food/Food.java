package com.snake.food;

import com.snake.board.Position;

public class Food {
    private Position position;

    public Food(Position position) {
        setPosition(position);
    }

    public Position getPosition() { return position; }

    public void setPosition(Position position) {
        if (position == null) throw new IllegalArgumentException("La position de la nourriture est obligatoire.");
        this.position = position;
    }
}
