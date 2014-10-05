package com.thoughtworks;

import java.io.IOException;

public class Player {
    private Board board;

    public Player(Board board) {
        this.board = board;
    }

    public void move() {
        board.mark(5);
    }
}
