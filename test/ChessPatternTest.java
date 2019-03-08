package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessPatternTest {
    String chessArr[][] = new String[8][16];
    String white = "WW";
    String black = "BB";
//    makePattern(chessArr, white, black);
//    printPattern(chessArr);
    ChessPattern obj;
    @Before
    public void setUp() throws Exception {
         obj = new ChessPattern();
    }

    @After
    public void tearDown() throws Exception {
        obj = null;
    }
    @Test
    public void testPattern() {
        String chess[][] = new String[8][16];
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
        assertEquals(chessArr,obj.makePattern(chessArr,"WW","BB"));
    }
}
