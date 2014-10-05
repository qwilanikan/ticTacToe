package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by qwillduvall on 10/1/14.
 */
public class Board {

    private final PrintStream printStream;
    private BufferedReader bufferedReader;

    public Board(PrintStream printStream, BufferedReader bufferedReader){
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;

    }


    public void mark() throws IOException {
        int xLocation = Integer.parseInt(bufferedReader.readLine());



        draw();


    }

    public void draw() {
        printStream.println("   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n" +
                            "-----------\n" +
                            "   |   |   \n");

    }
}
