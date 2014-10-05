package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Board {

    private PrintStream printStream;
    private String boardString;

    public Board(PrintStream printStream){
        this.printStream = printStream;
        boardString =   "   |   |   \n" +
                        "-----------\n" +
                        "   |   |   \n" +
                        "-----------\n" +
                        "   |   |   \n";


    }


    public void mark(int i) {
        boardString =   " X |   |   \n" +
                        "-----------\n" +
                        "   |   |   \n" +
                        "-----------\n" +
                        "   |   |   \n";
        draw();
    }

    public void draw() {
        printStream.println(boardString);

    }
}
