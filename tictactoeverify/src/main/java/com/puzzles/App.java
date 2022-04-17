package com.puzzles;


public class App {

    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}};

        for (char[] chars : board) {
            System.out.println(chars);
            System.out.println("winner: " + getWinner(chars));
        }
        char[][] transposed = transpose(board);
        System.out.println("#### transposed ###");
        for (char[] chars : transposed) {
            System.out.println(chars);
            System.out.println("winner: " + getWinner(chars));
        }

        System.out.println("#### diagonals ###");
        char[][] diagonals = getDiagonals(board);
        for (char[] chars : diagonals) {
            System.out.println(chars);
            System.out.println("winner: " + getWinner(chars));
        }
    }

    // transposes lines and columns in a matrix
    public static char[][] transpose(char[][] board) {
        char[][] transposed = new char[board.length][];
        for (int i = 0; i < board.length; i++) {
            char[] line = new char[board[i].length];
            for (int j = 0; j < board[i].length; j++) {
                line[j] = board[j][i];
            }
            transposed[i] = line;
        }
        return transposed;
    }

    public static char[][] getDiagonals(char[][] board) {
        char[] lr = new char[board.length];
        char[] rl = new char[board.length];

        for (int i = 0; i < board.length; i++) {
            lr[i] = board[i][i];
            rl[i] = board[i][board.length - i - 1];
        }
        return new char[][]{lr, rl};
    }

    // finds winners
    public static char getWinner(char[] line) {
        for (int i = 1; i < line.length; i++) {
            if (line[i] != line[i-1]) return Character.MIN_VALUE;
        }
        return line[0];
    }


}

