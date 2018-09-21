package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);

        String fileName = scaner.nextLine();
        int count = 0;
        try {
            FileInputStream f = new FileInputStream (fileName);

            while (f.available() > 0) {
                char ch = (char) f.read();
                if (ch == ',')
                    count++;
            }

            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found1");
        } catch (IOException e) {
            System.out.println("File " + fileName + " can't read");
        }

        System.out.println(count);
    }
}
/*import java.io.*;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try (FileInputStream f0 = new FileInputStream(reader.readLine())) {
            int c;
            int count = 0;
            while ((c = f0.read()) != -1) {
                char ch = (char) c;
                if (ch == ',') count++;
            }
            System.out.println(count);
            f0.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}*/
