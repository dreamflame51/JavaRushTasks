package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    // read float numbers from file, round to full numbers and write to another space separated
  //  public static float a;

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        BufferedReader f1 = new BufferedReader(new FileReader(sc.nextLine()));
        while (f1.ready()) {
            list.add(f1.readLine());
        }


        ArrayList<Long> values = new ArrayList<>();
        for (String s : list) {
            for (String part : s.split(" ")) {
                double a = Double.parseDouble(part);
                values.add(Math.round(a));
            }
        }
        f1.close();

        FileWriter f2 = new FileWriter(sc.nextLine());
        for(Long value : values){
            f2.write(value.toString()+" ");
        }

        sc.close();
        f2.close();
    }
}
