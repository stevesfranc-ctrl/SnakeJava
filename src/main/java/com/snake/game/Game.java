package com.snake.game;

import com.snake.board.Board;
import com.snake.board.Position;
import com.snake.collision.CollisionManager;
import com.snake.config.GameConfig;
import com.snake.food.Food;
import com.snake.score.ScoreManager;
import com.snake.snake.Snake;

public class Game {
    private Board board;
    private Snake snake;
    private Food food;
    private final ScoreManager scoreManager;
    private final CollisionManager collisionManager;
    private GameState state;

    public Game() {
        this.scoreManager = new ScoreManager();
        this.collisionManager = new CollisionManager();
        reset();
        state = GameState.MENU;
    }


    public void start() {
        state = GameState.PLAYING;
    }

    /***
     *
     */
    public void update() {
        // TODO : orchestrer un tour de jeu selon l'ordre défini dans le contrat d'intégration.
    }

    public void reset() {
        board = new Board(GameConfig.BOARD_WIDTH, GameConfig.BOARD_HEIGHT);
        Position start = new Position(GameConfig.BOARD_WIDTH / 2, GameConfig.BOARD_HEIGHT / 2);
        snake = new Snake(start);
        food = new Food(new Position(2, 2)); // TODO : générer une case libre aléatoire.
        scoreManager.reset();
        state = GameState.MENU;
    }

    /***
     *
     * @return GameState
     */
    public GameState getState() { return state; }

    /***
     *
     * @return Board
     */
    public Board getBoard() { return board; }

    /***
     *
     * @return Snake
     */
    public Snake getSnake() { return snake; }

    /***
     *
     * @return Food
     */
    public Food getFood() { return food; }

    /***
     *
     * @return ScoreManager
     */
    public ScoreManager getScoreManager() { return scoreManager; }

    /***
     *
     * @return CollisionManager
     */
    public CollisionManager getCollisionManager() { return collisionManager; }
}
