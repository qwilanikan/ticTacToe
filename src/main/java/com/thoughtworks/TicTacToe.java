package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class TicTacToe {
    private static PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;


    public TicTacToe(PrintStream printstream, BufferedReader bufferedReader){
        this.printStream = printstream;
        this.bufferedReader = bufferedReader;
        board = new Board(printStream, bufferedReader);
    }

    public void play() throws IOException {
        board.draw();
        printStream.println("Enter a number between 1 and 9");
        board.mark();

    }


}
