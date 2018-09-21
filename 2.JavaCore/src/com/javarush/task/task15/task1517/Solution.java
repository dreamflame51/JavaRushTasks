package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;

    static {
       // Exception ex = new Exception();
        try {
            throw new ExceptionInInitializerError();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int B = 5;

    public static void main(String[] args) throws ExceptionInInitializerError  {
        System.out.println(B);
    }
}
