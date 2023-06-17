package com.chocksaway;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CharTest {
    @Test
    public void testNumberChar() {
        int seqCount = 0;
        char[] charArray = "this is a sequence of chars in a list".toCharArray();
        for (int counter=0; counter < charArray.length / 2; counter++) {
            System.out.println(charArray[counter] + " " + charArray[(charArray.length-1) - counter] + " " + seqCount);

            if (charArray[counter] == 'i') {
                //System.out.println("+ " + counter);
                seqCount++;
            }
            if (charArray[(charArray.length-1) - counter] == 'i') {
                //System.out.println((charArray.length-1) - counter);
                seqCount++;


            }
        }

        assertEquals(4,seqCount);
    }
}
