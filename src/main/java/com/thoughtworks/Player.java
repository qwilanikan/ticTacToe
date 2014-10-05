package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;

public class Player {
    private BufferedReader bufferedReader;
    private Board board;

    public Player(BufferedReader bufferedReader, Board board) {
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public void move() throws IOException {
        int choice = Integer.parseInt(bufferedReader.readLine());
        board.mark(choice);
    }
}
