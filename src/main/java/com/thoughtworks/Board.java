package com.thoughtworks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

public class Board {

    private PrintStream printStream;
    private ArrayList<String> locations;

    public Board(PrintStream printStream){
        this.printStream = printStream;
        locations = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            locations.add(" ");
        }
    }


    public void mark(int location) {
        if (location < 10 && location > 0) {
            locations.set(location - 1, "X");
        }
        draw();
    }

    public void draw() {
        printStream.println(" " + locations.get(0) + " | " + locations.get(1) + " | " + locations.get(2) + " \n" +
                            "-----------\n" +
                            " " + locations.get(3) + " | " + locations.get(4) + " | " + locations.get(5) + " \n" +
                            "-----------\n" +
                            " " + locations.get(6) + " | " + locations.get(7) + " | " + locations.get(8) + " \n" );
    }
}
