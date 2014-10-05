package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class TicTacToe {
    private static PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;


    public TicTacToe(PrintStream printStream, BufferedReader bufferedReader, Board board) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public void play() throws IOException {
        printStream.println("Enter a number between 1 and 9");
        board.draw();

    }


}
