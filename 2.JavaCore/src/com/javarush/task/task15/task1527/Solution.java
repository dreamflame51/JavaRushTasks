package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Парсер реквестов
*/
// String or link parser via  Pattern matcher to array or string replace and match
public class Solution {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String s;
//        s = sc.nextLine();
//
//        String sS = s.substring(s.lastIndexOf("?") + 1);
//        Pattern p = Pattern.compile("[A-z]*");
//        Matcher m = p.matcher(sS);
//
//        while (m.find()) {
//
//            String strToArr = m.group();
//
//            if (!strToArr.equals("")) {
//                String[] animals = strToArr.split("\\s+");
//                for (String animal : animals) {
//                    System.out.print(animal + " ");
//                }
//            }
//        }
        String url = new BufferedReader(new InputStreamReader(System.in)).readLine();

        url = url.substring(url.indexOf("?") + 1).replace("&", " ");

        System.out.println(url.replaceAll("=\\S+", ""));

        if (url.contains("obj")) {
            url = url.substring(url.indexOf("=") + 1, url.indexOf(" "));
            if (url.matches("\\d+.\\d+")) alert(Double.valueOf(url));
            else alert(url);
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
// http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
//lvl view name Amigo

//http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo