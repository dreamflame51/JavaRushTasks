package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
            exceptions.add(new Exception("похоть"));
            exceptions.add(new Exception ("чревоугодие"));
            exceptions.add(new Exception ("жадность"));
            exceptions.add(new Exception ("лень"));
            exceptions.add(new Exception ("гнев"));
            exceptions.add(new Exception ("зависть"));
            exceptions.add(new Exception ("гордыня"));
            exceptions.add(new Exception ("уныние"));
            exceptions.add(new Exception ("тщеславие"));
        }

        //напишите тут ваш код

    }
}
