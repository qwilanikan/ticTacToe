package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class TicTacToe {
    private static PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private Player player1;
    private Player player2;



    public TicTacToe(PrintStream printStream, BufferedReader bufferedReader, Board board, Player player1, Player player2) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() throws IOException {
        printStream.println("Player 1 Enter a number between 1 and 9");
        player1.move("X");
        printStream.println("Player 2 enter a number between 1 and 9");
        player2.move("O");
    }


}
