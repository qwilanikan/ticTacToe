package com.thoughtworks;

import java.io.PrintStream;

public class TicTacToe {
    private static PrintStream printStream;
    private Board board;


    public TicTacToe(PrintStream printstream){
        this.printStream = printstream;
        board = new Board(printStream);
    }

    public void play() {
        board.setUp();

    }


}
