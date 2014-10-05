package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class TicTacToeTest {
    PrintStream printStream;
    TicTacToe ticTacToe;
    BufferedReader bufferedReader;
    private Board board;
    private Player player1;
    private Player player2;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        ticTacToe = new TicTacToe(printStream, bufferedReader,board, player1, player2);
    }

    @Test
    public void shouldPromptPlayerForNumber() throws IOException {
        ticTacToe.play();
        verify(printStream).println(contains("Enter a number between 1 and 9"));
    }

    @Test
    public void shouldCallMove() throws IOException {
        ticTacToe.play();
        verify(player1).move("X");
    }

    @Test
    public void shouldPerformActionsInCorrectOrder() throws IOException {
        ticTacToe.play();

        InOrder inOrder = inOrder(player1, player2);

        inOrder.verify(player1).move("X");
        inOrder.verify(player2).move("X");
    }


}
