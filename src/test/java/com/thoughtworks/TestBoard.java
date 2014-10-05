package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

/**
 * Created by qwillduvall on 10/1/14.
 */
public class TestBoard {
    PrintStream printStream;
    Board board;
    BufferedReader bufferedReader;


    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = new Board(printStream, bufferedReader);
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
    public void shouldMarkXWherePlayerOneChooses() throws IOException {

    }
}

