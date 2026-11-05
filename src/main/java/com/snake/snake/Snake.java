package com.snake.snake;

import com.snake.board.Position;
import com.snake.config.GameConfig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Snake {
    private final List<Position> body = new ArrayList<>();
    private Direction direction = Direction.RIGHT;

    public Snake(Position initialPosition) {
        if (initialPosition == null) throw new IllegalArgumentException("Position initiale obligatoire.");
        for (int i = 0; i < GameConfig.INITIAL_SNAKE_LENGTH; i++) {
            body.add(new Position(initialPosition.getX() - i, initialPosition.getY()));
        }
    }

    public Position getHead() { return body.get(0); }
    public List<Position> getBody() { return Collections.unmodifiableList(body); }
    public Direction getDirection() { return direction; }

    public boolean changeDirection(Direction newDirection) {
        if (newDirection == null || direction.isOpposite(newDirection)) return false;
        direction = newDirection;
        return true;
    }

    public Position getNextHeadPosition() {
        return getHead().translate(direction.getDx(), direction.getDy());
    }

    public void move(boolean grow) {
        body.add(0, getNextHeadPosition());
        if (!grow) body.remove(body.size() - 1);
    }
}
