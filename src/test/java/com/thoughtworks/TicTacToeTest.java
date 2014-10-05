package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class TicTacToeTest {
    PrintStream printStream;
    TicTacToe ticTacToe;
    BufferedReader bufferedReader;
    private Board board;
    private Player player;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player = mock(Player.class);
        ticTacToe = new TicTacToe(printStream, bufferedReader,board, player);
    }

    @Test
    public void shouldPromptPlayerForNumber() throws IOException {
        ticTacToe.play();
        verify(printStream).println(contains("Enter a number between 1 and 9"));
    }

    @Test
    public void shouldDrawBoard() throws IOException {
        ticTacToe.play();

        verify(board).draw();

    }


//
//    Make a move
//    Prompt player 1 to enter a number between 1 and 9 to
//    indicate where they wish to move. Redraw the board with an ‘X’ in
//    that location. It doesn’t matter what happens if they enter anything
//    besides a number from 1 to 9.

}
