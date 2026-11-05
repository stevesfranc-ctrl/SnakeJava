package com.snake.board;

import java.util.Objects;

public final class Position {
    private final int x;
    private final int y;

    /***
     *
     * @param x
     * @param y
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /***
     *
     * @return
     */
    public int getX() { return x; }

    /***
     *
     * @return
     */
    public int getY() { return y; }

    /***
     *
     * @param dx
     * @param dy
     * @return
     */
    public Position translate(int dx, int dy) {
        return new Position(x + dx, y + dy);
    }

    /***
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Position other)) return false;
        return x == other.x && y == other.y;
    }

    /***
     *
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    /***
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
