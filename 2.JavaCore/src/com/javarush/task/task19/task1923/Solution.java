package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read1 = new BufferedReader(new FileReader(args[0]));
        BufferedWriter write1 = new BufferedWriter(new FileWriter(args[1]));

        while (read1.ready()){
            String line = read1.readLine();
            String[] words = line.split(" ");
            for (String word : words)
                if (!word.matches("^\\D*$"))
                    write1.write(word + " ");
        }
        read1.close();
        write1.close();
    }
}
