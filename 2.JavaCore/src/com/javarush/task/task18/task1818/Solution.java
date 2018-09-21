package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

// read from 2nd file and write to 1st then read from 3rd and append to 1st

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String file1 = sc.nextLine();
        String file2 = sc.nextLine();
        String file3 = sc.nextLine();
        sc.close();

        FileOutputStream f1 = new FileOutputStream(file1);
        FileInputStream f2 = new FileInputStream(file2);
        FileInputStream f3 = new FileInputStream(file3);

        while (f2.available() > 0) {
            f1.write(f2.read());
        }

        f2.close();

        while (f3.available() > 0) {
            f1.write(f3.read());
        }

        f1.close();
        f3.close();


    }
}
