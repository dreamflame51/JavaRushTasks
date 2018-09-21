package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader conReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = conReader.readLine();
        String fileName2 = conReader.readLine();
        conReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));

        while (fileReader.ready()) {
            String s = fileReader.readLine();
            String[] digital = s.split("\\s");

            for (String str : digital)
                try {
                    System.out.println(Integer.parseInt(str));
                    fileWriter.write(str + " ");
                } catch (NumberFormatException e) {
                    continue;
                }
        }
        fileWriter.close();
        fileReader.close();

       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter fileWrite = new BufferedWriter(new FileWriter(reader.readLine()));
        reader.close();
        String line;
        while (fileReader.ready()) {
            line = fileReader.readLine();

            line = line.replaceAll("[^0-9]", " ");
            line = line.replaceAll("\\s+", " ");
            fileWrite.write(line);

        }
        fileReader.close();
        fileWrite.close();
        reader.close();*/


    }
}
