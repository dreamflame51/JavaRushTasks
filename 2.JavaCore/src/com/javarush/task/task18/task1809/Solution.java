package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

//read bytes from file and write reversed to another
public class Solution {
    private static FileInputStream file1;
    private static FileOutputStream file2;
    static byte temp;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            file1 = new FileInputStream(reader.readLine());
            file2 = new FileOutputStream(reader.readLine());

        } catch (IOException e) {
            e.getMessage();
        }
        int fileSize = file1.available();
        byte[] buf2 = new byte[fileSize];

        for (int i = 0; i < fileSize; i++) {
            buf2[i] = (byte) file1.read();
        }
// reverse array
        for (int i = 0; i < buf2.length / 2; i++) {
            temp = buf2[i];
            buf2[i] = buf2[buf2.length - 1 - i];
            buf2[buf2.length - 1 - i] = temp;
        }

        file2.write(buf2);

        file1.close();
        file2.close();


    }
}
