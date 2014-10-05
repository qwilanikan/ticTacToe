package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        TicTacToe ticTacToe = new TicTacToe(System.out, new BufferedReader(new InputStreamReader(System.in)));
        ticTacToe.play();
        */
        Board board = new Board(System.out, new BufferedReader((new InputStreamReader(System.in))));
        board.draw();
    }

}
