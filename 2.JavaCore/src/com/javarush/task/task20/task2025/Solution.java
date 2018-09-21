package com.javarush.task.task20.task2025;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;

/*
Алгоритмы-числа
*/
public class Solution {
    public static void main(String[] args) {
       File file = new File("C:/javaFiles/2.txt");
       File folder = new File(file.getParent());

       for (File fl : folder.listFiles()){
           System.out.println(fl.getName());
       }


    }
    }

