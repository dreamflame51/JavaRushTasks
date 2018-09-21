package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    final static int BUF_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        sc.close();

        ByteArrayOutputStream mem = new ByteArrayOutputStream();
        fileToMem(mem, name2);
        fileToMem(mem, name1);
        FileOutputStream f1 = new FileOutputStream(name1);
        mem.writeTo(f1);

        f1.close();

    }

    public static void fileToMem(ByteArrayOutputStream mem, String fileName) throws IOException {
        FileInputStream f = new FileInputStream(fileName);
        int readByte;
        while (f.available() > 0) {
            byte[] buf = new byte[Solution.BUF_SIZE];
            readByte = f.read(buf);
            mem.write(buf, 0, readByte);
        }
        f.close();
    }

}
