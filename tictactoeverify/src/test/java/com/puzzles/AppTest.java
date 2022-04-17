package com.puzzles;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest 
{
    @Test
    public void shouldGetWinnerXForLine()
    {
        char[] line = new char[]{'X', 'X', 'X'};
        assertEquals( 'X', App.getWinner(line));
    }

    @Test
    public void shouldNotGetWinnerXForLine()
    {
        char[] line = new char[]{'O', 'X', 'X'};
        assertEquals( Character.MIN_VALUE, App.getWinner(line));
    }

    @Test
    public void shouldTranspose()
    {
        char[][] board = {{'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}};

        char[][] transposed = {{'A', 'D', 'G'},
                            {'B', 'E', 'H'},
                            {'C', 'F', 'I'}};

        assertArrayEquals(transposed, App.transpose(board));
    }

    @Test
    public void shouldDiagonals()
    {
        char[][] board = {{'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}};

        char[][] diagonals = {{'A', 'E', 'I'},
                {'C', 'E', 'G'}};

        assertArrayEquals(diagonals, App.getDiagonals(board));
    }
}
