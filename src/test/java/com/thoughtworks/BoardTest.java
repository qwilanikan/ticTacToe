package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertThat;
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
    public void shouldMarkXInFirstSpotWhen1Chosen(){
        board.mark(1);

        verify(printStream).println(" X |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n");

    }

    @Test
    public void shouldMarkXInMiddleSpotWhen5Chosen(){
        board.mark(5);

        verify(printStream).println("   |   |   \n" +
                                    "-----------\n" +
                                    "   | X |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n");

    }

    @Test
    public void shouldNotMarkBoardWhenChoiceIsNotValid(){
        board.mark(90);

        verify(printStream).println("   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n" +
                                    "-----------\n" +
                                    "   |   |   \n");
    }
}

