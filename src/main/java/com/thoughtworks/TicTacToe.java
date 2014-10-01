package com.thoughtworks;

import java.io.PrintStream;

public class TicTacToe {
    private static PrintStream printStream;

    public TicTacToe(PrintStream printstream){
        this.printStream = printstream;
    }

    public static void play() {
        String verticalLines = "  | |  ";
        String horizontalLine = "-------";

        printStream.println(verticalLines);
        printStream.println(verticalLines);
        printStream.println(verticalLines);
        printStream.println(horizontalLine);
        printStream.println(horizontalLine);
    }


}
