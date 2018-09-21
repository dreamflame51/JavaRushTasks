package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        int count = 0;
//        int index = 0;
        String word = "world";
        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.split("\\W");
            for (String s : words)
                if (s.equals(word))
                    count++;
//            while ((index = s.indexOf(word, index+1)) >= 0)
//                count++;
        }
        fileReader.close();

        System.out.println(count);
/*        final String REGEX = "world";
        int i = 0;
        String line;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader(reader.readLine()));

        while ((line = br.readLine()) != null) {

            Pattern p = Pattern.compile(REGEX);
            Matcher m = p.matcher(line);
            while (m.find()) {
                i++;
            }
            System.out.print(i);
        }
        reader.close();
        br.close();
        */

    }
}
