package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream out = System.out;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(out);
        Player player1 = new Player(reader, board);
        Player player2 = new Player(reader, board);
        TicTacToe ticTacToe = new TicTacToe(out, reader, board, player1, player2);
        ticTacToe.play();
    }

}
