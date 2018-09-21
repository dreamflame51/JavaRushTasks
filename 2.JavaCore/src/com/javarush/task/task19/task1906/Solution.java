package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
    //    ArrayList<Byte> arr = new ArrayList<>();

        FileReader fr = new FileReader(sc.readLine());
        FileWriter fw = new FileWriter(sc.readLine());
        sc.close();

        int i=1;
        while (fr.ready()) {
            int value = fr.read();
            if (i % 2 == 0)
                fw.write(value);
            i++;
        }
        fr.close();
        fw.close();
    }
}

