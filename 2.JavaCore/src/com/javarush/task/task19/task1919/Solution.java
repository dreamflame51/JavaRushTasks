package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


//
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new TreeMap<>();
        while (reader.ready()) {
            String[] s = reader.readLine().split(" ");
            if (map.containsKey(s[0])) {
                map.put(s[0], map.get(s[0]) + Double.parseDouble(s[1]));
            } else {
                map.put(s[0], Double.parseDouble(s[1]));
            }
        }
        for (Map.Entry<String, Double> pair: map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
       // fileReader.close();
        reader.close();
    }
}
