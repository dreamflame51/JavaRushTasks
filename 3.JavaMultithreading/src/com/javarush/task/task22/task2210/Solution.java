package com.javarush.task.task22.task2210;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getTokens("level22.lesson13.task01", ".")));



    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        ArrayList<String> token = new ArrayList<>();
        //String token;
        while (st.hasMoreTokens()){
            //token = st.nextToken();
            token.add(st.nextToken());

        }
        return token.toArray(new String[0]);

    }
}
