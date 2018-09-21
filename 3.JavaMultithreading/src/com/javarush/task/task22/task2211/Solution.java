package com.javarush.task.task22.task2211;

import java.io.*;

/* 
Смена кодировки
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        //byte[] buffer = Files.readAllBytes(Paths.get(args[0]));
        //Files.write(Paths.get(args[1]),new String(buffer, "UTF-8").getBytes("Windows-1251"));


        // read files as arguments and write one to another

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[1]);

        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);

        fileOutputStream.write(new String(buffer, "UTF-8").getBytes("Windows-1251"));

        fileInputStream.close();
        fileOutputStream.close();


    }
}
