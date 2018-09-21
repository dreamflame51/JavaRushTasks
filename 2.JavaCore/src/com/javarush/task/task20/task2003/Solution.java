package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    FileInputStream fis;


    public void fillInPropertiesMap() throws IOException {
        //implement this method - реализуйте этот метод
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        fis = new FileInputStream(reader.readLine());
        try {
            load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prp = new Properties();
        prp.putAll(properties);
        prp.store(outputStream, "");
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties prp = new Properties();
        prp.load(inputStream);

        for (Map.Entry<Object, Object> entry : prp.entrySet()) {
            properties.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static void main(String[] args) {

    }
}
