package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {

        if (string != null && !string.isEmpty()) {
            String s[] = string.split(" ");
            if (s.length < 5) {
                throw new TooShortStringException();
            } else {
                return s[1] + " " + s[2] + " " + s[3] + " " + s[4];
            }


        } else throw new TooShortStringException();

    }

    public static class TooShortStringException extends RuntimeException {
    }
}
