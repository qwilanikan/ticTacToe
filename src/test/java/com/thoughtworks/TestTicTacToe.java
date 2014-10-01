package test.java.com.thoughtworks;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.*;

public class TestTicTacToe {
    PrintStream printStream;

    @Before
    public void setUp(){
        printStream = mock(PrintStream.class);
    }

    @Test
    public void shouldPrintOneTitleWhenOneBookInList(){
        verify(printStream).println("");
    }

}
