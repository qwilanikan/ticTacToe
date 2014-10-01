package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

/**
 * Created by qwillduvall on 10/1/14.
 */
public class TestBoard {
    PrintStream printStream;
    Board board;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        board = new Board(printStream);
    }

    @Test
    public void shouldDrawBoardCorrectly(){
        String verticalLines = "  | |  ";
        String horizontalLine = "-------";

        board.setUp();

        InOrder inOrder = inOrder(printStream);

        inOrder.verify(printStream).println(verticalLines);
        inOrder.verify(printStream).println(horizontalLine);
        inOrder.verify(printStream).println(verticalLines);
        inOrder.verify(printStream).println(horizontalLine);
        inOrder.verify(printStream).println(verticalLines);
    }
}

