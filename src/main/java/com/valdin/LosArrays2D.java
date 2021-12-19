package com.valdin;

import java.util.Arrays;

public class LosArrays2D {
    public static void main(String[] args) {
        char [][] board = new char[3][3];
        for(int i=0;i<3;i++) {
            for(int j=0; j<3; j++) {
                board[i][j] = '-';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo = new char[][] {
                new char[] {'-','-','-'},
                new char[] {'-','-','-'},
                new char[] {'-','-','-'},
        };

        System.out.println(Arrays.deepToString(boardTwo));
    }
}
