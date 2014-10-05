package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class BoardTest {
    PrintStream printStream;
    Board board;
    BufferedReader bufferedReader;


    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawBoardCorrectly(){
        String boardImage =     "   |   |   \n" +
                                "-----------\n" +
                                "   |   |   \n" +
                                "-----------\n" +
                                "   |   |   \n";

        board.draw();

        verify(printStream).println(boardImage);
    }

    @Test
    public void shouldMarkXWherePlayerOneChooses(){

    }
}

