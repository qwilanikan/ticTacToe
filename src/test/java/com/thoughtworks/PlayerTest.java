package com.thoughtworks;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PlayerTest {


    @Test
    public void shouldMarkTo5WhenPlayerChooses5() throws IOException {
        Board board = mock(Board.class);

        Player player = new Player(board);
        player.move();
        verify(board).mark(5);
    }
}