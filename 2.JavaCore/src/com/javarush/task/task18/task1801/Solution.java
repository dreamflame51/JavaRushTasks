package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        //   int i = Integer.parseInt(reader.readLine());
        byte max = (byte) Integer.parseInt(String.valueOf(inputStream.read()));
        ;
        while (inputStream.available() > 0) {
            byte bt = (byte) Integer.parseInt(String.valueOf(inputStream.read()));
            if (bt > max) {
                max = bt;
            }

        }
        inputStream.close();
        System.out.println(max);

    }
}
