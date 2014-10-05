package com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.mockito.Mockito.*;

public class PlayerTest {

    private BufferedReader bufferedReader;
    private Board board;
    private Player player;

    @Before
    public void setUp(){
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player = new Player(bufferedReader, board);
    }

    @Test
    public void shouldMark5WhenPlayerChooses5() throws IOException {
        when(bufferedReader.readLine()).thenReturn("5");
        player.move("X");
        verify(board).mark(5, "X");
    }

    @Test
    public void shouldMark1WhenPlayerChooses1() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        player.move("X");
        verify(board).mark(1, "X");


    }
}