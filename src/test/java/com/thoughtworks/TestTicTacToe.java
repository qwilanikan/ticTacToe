package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

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

        verify(printStream, times(3)).println(verticalLines);
        verify(printStream, times(2)).println(horizontalLine);
    }

}
