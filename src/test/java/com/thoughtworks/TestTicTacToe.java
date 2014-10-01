package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class TestTicTacToe {
    PrintStream printStream;
    TicTacToe ticTacToe;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        ticTacToe = new TicTacToe(printStream);
    }

    @Test
    public void shouldDrawBoardCorrectly(){
        String verticalLines = "  | |  ";
        String horizontalLine = "-------";

        ticTacToe.play();

        InOrder inOrder = inOrder(printStream);

        inOrder.verify(printStream).println(verticalLines);
        inOrder.verify(printStream).println(horizontalLine);
        inOrder.verify(printStream).println(verticalLines);
        inOrder.verify(printStream).println(horizontalLine);
        inOrder.verify(printStream).println(verticalLines);
    }

}
