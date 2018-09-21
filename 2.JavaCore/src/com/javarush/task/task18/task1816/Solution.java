package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabethL = "abcdefghijklmnopqrstuvwxyz";
        String alphabethH = alphabethL.toUpperCase();


        FileInputStream file = new FileInputStream(args[0]);

        //  read by one letter/character and compare to initial
        int count = 0;
        while (file.available() > 0) {
            char read = (char) file.read();
            if ((alphabethL.indexOf(read) > -1) || (alphabethH.indexOf(read) > -1)) count++;
        }
        file.close();
        System.out.println(count);

    }
}
