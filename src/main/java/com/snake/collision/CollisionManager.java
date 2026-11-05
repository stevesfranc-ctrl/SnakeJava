package com.snake.collision;

import com.snake.board.Board;
import com.snake.board.Position;
import com.snake.snake.Snake;

import java.util.List;

public class CollisionManager {

    /***
     *
     * @param nextHead
     * @param board
     * @return
     */
    public boolean isWallCollision(Position nextHead, Board board) {
        return !board.isInside(nextHead);
    }

    /***
     *
     * @param snake
     * @param nextHead
     * @param willGrow
     * @return
     */
    public boolean isSelfCollision(Snake snake, Position nextHead, boolean willGrow) {
        List<Position> body = snake.getBody();
        int limit = willGrow ? body.size() : body.size() - 1; // La queue libère sa case si le serpent ne grandit pas.
        for (int i = 0; i < limit; i++) {
            if (body.get(i).equals(nextHead)) return true;
        }
        return false;
    }
}
