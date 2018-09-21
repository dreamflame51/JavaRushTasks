package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь четыре ошибки
*/

public class Solution {

// populate list, check list entry value and act accordingly, list all the list values

    static List initList(List list) {

        list.add(new Float(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Double(-90 / -3));
        list.remove(new Double("123e-445632"));
        return list;
    }

    static List processCastedObjects(List<Number> list) {
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (Float) object;
                System.out.println("Is float value defined? " + !(a.isNaN()));
            } else if (object instanceof Double) {
                Double a = (Double) object;
                System.out.println("Is double value infinite? " + a.isInfinite());
            }
        }
        return list;
    }


    static List<Number> printListValues(List<Number> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        return list;
    }


    public static void main(String[] args) {
         List<Number> list = new LinkedList<>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }
}
