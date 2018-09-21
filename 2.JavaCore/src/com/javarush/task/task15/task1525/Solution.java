package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/
// read lines from file and put to arraylist
public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(Statics.FILE_NAME));
            String s = br.readLine();
            while (s != null) {
                lines.add(s);
                s = br.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" not found!");
        } catch (IOException e) {
            System.out.println("ERROR: File "+Statics.FILE_NAME+" can't read!");
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
