package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader readFile = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writeFile = new BufferedWriter(new FileWriter(args[1]));
        StringBuffer sb = new StringBuffer();
        while (readFile.ready()) {
            String s = readFile.readLine();
            String[] words = s.split(" ");
            for (String word : words) {
                if (word.length() > 6) {
                    sb.append(word).append(",");
                }
            }
        }
        sb.delete(sb.length()-1,sb.length());
        writeFile.write(sb.toString());
        readFile.close();
        writeFile.close();
    }
}
