package com.stackroute;

public class chessPattern {
    public static void printPattern(String chessArr[][]){
        int i, j;
        for (i=0; i<8; i++) {
            for (j = 0; j < 16; j++) {
                System.out.print(chessArr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void makePattern(String chessArr[][], String white, String black){
        int i, j, flag=0;
        for (i=0; i<8; i++){
            for (j=0; j<16; j++){
                if(flag == 0 && j%2 == 0){
                    chessArr[i][j] = white;
                    flag = 1;
                }
                else if(flag == 1 && j%2 == 0){
                    chessArr[i][j] = black;
                    flag = 0;
                }
                if(j%2 != 0){
                    chessArr[i][j] = "|";
                }
                if(j == 15 && i%2 == 0){
                    flag = 1;
                }
                else if(j == 15 && i%2 != 0){
                    flag = 0;
                }
            }
        }
    }
    public static void main(String args[]){
        String chessArr[][] = new String[8][16];
        String white = "WW";
        String black = "BB";
        makePattern(chessArr, white, black);
        printPattern(chessArr);
    }
}
