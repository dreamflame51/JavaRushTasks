package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        FileInputStream f1;
        Scanner sc = new Scanner(System.in);

        while (true){
            String filename = sc.nextLine();
            try {
                f1 = new FileInputStream(filename);
                f1.close();
            } catch (IOException e) {
                System.out.println(filename);
                sc.close();
                return;
            }
        }

    }

}
