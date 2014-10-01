package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class TestTicTacToe {
    PrintStream printStream;
    TicTacToe ticTacToe;
    BufferedReader bufferedReader;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        ticTacToe = new TicTacToe(printStream);
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void shouldPromptPlayerOneForNumber(){
        ticTacToe.play();
        verify(printStream).println(contains("Enter a number between 1 and 9"));
    }


//
//    Make a move
//    Prompt player 1 to enter a number between 1 and 9 to
//    indicate where they wish to move. Redraw the board with an ‘X’ in
//    that location. It doesn’t matter what happens if they enter anything
//    besides a number from 1 to 9.

}
