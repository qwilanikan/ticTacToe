package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Board {

    private final PrintStream printStream;

    public Board(PrintStream printStream){
        this.printStream = printStream;


    }


    public void mark(int i) {
        int xLocation;




    }

    public void draw() {
        printStream.println("   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n");

    }
}
