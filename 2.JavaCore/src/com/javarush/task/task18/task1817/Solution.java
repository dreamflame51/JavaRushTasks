package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    static String bl = " ";
    static int blCount = 0;
    static int total = 0;
    static double round;

    public static void main(String[] args) throws IOException {


        FileInputStream file = new FileInputStream(args[0]);
        while (file.available() > 0) {
            total++;
            char a = (char) file.read();
            if (bl.indexOf(a) > -1) {
                blCount++;
            }
        }
        file.close();

        System.out.printf("%.2f", ((float) blCount / total) * 100);
    }
}
