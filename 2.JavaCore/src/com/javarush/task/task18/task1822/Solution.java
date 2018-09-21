package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader f = new BufferedReader(new FileReader(br.readLine()));
        br.close();

        while (f.ready()) {
            String s = f.readLine();
            if (s.startsWith(args[0] + " ")) System.out.println(s);
        }
        f.close();
    }
}