package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class TicTacToe {
    private static PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private Player player;


    public TicTacToe(PrintStream printStream, BufferedReader bufferedReader, Board board, Player player) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.player = player;
    }

    public void play() throws IOException {
        printStream.println("Enter a number between 1 and 9");
        player.move();

    }


}
