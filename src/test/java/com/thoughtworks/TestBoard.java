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
        String verticalLines = "   |   |   ";
        String horizontalLine = "---------";

        board.drawBoard();

        InOrder inOrder = inOrder(printStream);

        inOrder.verify(printStream).println(verticalLines);
        inOrder.verify(printStream).println(horizontalLine);
        inOrder.verify(printStream).println(verticalLines);
        inOrder.verify(printStream).println(horizontalLine);
        inOrder.verify(printStream).println(verticalLines);
    }

    @Test
    public void shouldMarkXWherePlayerOneChooses() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        board.markX();
        verify(printStream).println("   | X |   ");
    }
}

