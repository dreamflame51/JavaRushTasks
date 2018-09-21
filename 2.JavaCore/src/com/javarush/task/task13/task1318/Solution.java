package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String contentLine = reader.readLine();

        BufferedInputStream bis;
        FileInputStream fis;


        fis = new FileInputStream(contentLine);
        bis = new BufferedInputStream(fis);
        while (bis.available() > 0) {
            System.out.print((char) bis.read());
        }

        fis.close();
        bis.close();
        reader.close();

    }
}
