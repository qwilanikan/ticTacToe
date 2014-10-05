package com.thoughtworks;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {


    @Test
    public void shouldMoveTo5WhenPlayerChooses5(){


        Player player = new Player();
        player.move(5);
    }
}