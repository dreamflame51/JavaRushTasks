package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

// read two files to string array and compare

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> forRemoveLines = new ArrayList<>();
    public static String firstFileName;
    public static String secondFileName;


    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        readToArr(firstFileName, allLines);
        readToArr(secondFileName, forRemoveLines);

        Solution sol = new Solution();
        try {
            sol.joinData();
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

    }

    public static void readToArr(String fileName, List<String> arr) {
        try {
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while (fileReader.ready()) {
                String s = fileReader.readLine();
                arr.add(s);
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void joinData() throws CorruptedDataException {
        for (String temp1 : forRemoveLines) {
            if (allLines.contains(temp1)) {
                allLines.remove(temp1);
            } else {
                allLines.clear();
                throw new CorruptedDataException();

            }
        }
    }
}
