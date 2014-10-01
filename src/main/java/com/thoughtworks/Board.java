package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by qwillduvall on 10/1/14.
 */
public class Board {
    String lineOne;
    String lineTwo;
    String lineThree;
    String lineFour;
    String lineFive;

    private final PrintStream printStream;
    private BufferedReader bufferedReader;

    public Board(PrintStream printStream, BufferedReader bufferedReader){
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        lineOne = "   |   |   ";
        lineTwo = "---------";
        lineThree = "   |   |   ";
        lineFour = "---------";
        lineFive = "   |   |   ";
    }


    public void markX() throws IOException {
        int xLocation = Integer.parseInt(bufferedReader.readLine());

//        System.out.println("greater than 0");
//        String lineToChange = lineOne;
//        if (xLocation > 3){
//            System.out.println("greater than 3");
//            lineToChange = lineThree;
//        }
//        else if (xLocation > 6){
//            lineToChange = lineFive;
//            System.out.println("greater than 6");
//        }
//
//        int locationOnLine = xLocation % 3;
//        if (locationOnLine == 2) {
//            lineToChange = " X |   |   ";
//        }
//        else if(locationOnLine == 1) {
//            lineToChange = "   | X |   ";
//        }
//        else {
//            lineToChange = "   |   | X ";
//        }

        //s = s.replace(s.substring(3,6), "foobar");

        drawBoard();


    }

    public void drawBoard() {
        printStream.println(lineOne);
        printStream.println(lineTwo);
        printStream.println(lineThree);
        printStream.println(lineFour);
        printStream.println(lineFive);
    }
}
