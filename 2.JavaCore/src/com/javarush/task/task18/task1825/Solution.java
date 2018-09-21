package com.javarush.task.task18.task1825;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> parts = new ArrayList<>();
        FileInputStream fileInputStream ;
        String nextFileName;
        //Читаем файлы пока не "end"
        while (true) {
            if ("end".equals(nextFileName = scanner.nextLine())) break;
            else parts.add(nextFileName);
        }
        scanner.close();
        //Сортируем коллекцию
        Collections.sort(parts, Comparator.comparing(String::toString));
        //Выходной файловый поток
        String outputFileName = parts.get(0).split(".part")[0];
        FileOutputStream fileOutputStream = new FileOutputStream(outputFileName);
        //Сливаем файлы
        for (String partsFileNames : parts) {
            fileInputStream = new FileInputStream(partsFileNames);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            fileOutputStream.write(buffer);
            fileInputStream.close();
        }
        fileOutputStream.close();
        System.out.println("Объединение файлов выполнено!");
    }
}
