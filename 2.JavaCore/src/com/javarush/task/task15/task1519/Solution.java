package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // prase input by type

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while (true) {
            s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }

            try {
                if (s.indexOf(".") > 0) {
                    Double value = Double.parseDouble(s);
                    print(value);
                    continue;
                }

                int value = Integer.parseInt(s);
                if (value > 0 && value < 128) {
                    print((short) value);
                    continue;
                }
                print(value);
                continue;


            } catch (NumberFormatException e) {

            }
            print(s);


        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
