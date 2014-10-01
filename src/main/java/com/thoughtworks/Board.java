package com.thoughtworks;

import java.io.PrintStream;

/**
 * Created by qwillduvall on 10/1/14.
 */
public class Board {

    private final PrintStream printStream;

    public Board(PrintStream printStream){
        this.printStream = printStream;
    }

    public void setUp(){
        String verticalLines = "  | |  ";
        String horizontalLine = "-------";

        printStream.println(verticalLines);
        printStream.println(horizontalLine);
        printStream.println(verticalLines);
        printStream.println(horizontalLine);
        printStream.println(verticalLines);
    }
}
