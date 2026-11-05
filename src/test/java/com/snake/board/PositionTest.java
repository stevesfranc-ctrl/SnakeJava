package com.snake.board;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @Test
    void positionsWithSameCoordinatesAreEqual() {
        assertEquals(new Position(2, 3), new Position(2, 3));
    }

    @Test
    void translateReturnsNewPosition() {
        assertEquals(new Position(4, 5), new Position(2, 3).translate(2, 2));
    }
}
