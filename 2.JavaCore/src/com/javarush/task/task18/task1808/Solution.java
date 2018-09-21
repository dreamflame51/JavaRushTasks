package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;


public class Solution {
    static FileInputStream file1;
    static FileOutputStream file2;
    static FileOutputStream file3;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            file1 = new FileInputStream(reader.readLine());
            file2 = new FileOutputStream(reader.readLine());
            file3 = new FileOutputStream(reader.readLine());

        } catch (IOException e) {
            e.getMessage();
        }
        int fileSize = file1.available();
        int part1 = fileSize % 2 == 0 ? fileSize / 2 : fileSize / 2 + 1;

        while (file1.available() > 0) {
            byte[] buf1 = new byte[part1];
            byte[] buf2 = new byte[fileSize - part1];

            file1.read(buf1);
            file1.read(buf2);
            file2.write(buf1);
            file3.write(buf2);
        }
        file1.close();
        file2.close();
        file3.close();

    }
}
