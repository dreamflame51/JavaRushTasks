package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        // keyboard input accepts only certain string value
        String s;
        while (true) {
            s = reader.readLine();
            if (s.equals("user")) {
                person = new Person.User();
                doWork(person);
                continue;
            }

            if (s.equals("coder")) {
                person = new Person.Coder();
                doWork(person);
                continue;
            }
            if (s.equals("proger")) {
                person = new Person.Proger();
                doWork(person);
                continue;
            }
            if (s.equals("loser")) {
                person = new Person.Loser();
                doWork(person);
                continue;
            }
            break;
        }


    }


    public static void doWork(Person person) {

        if (person instanceof Person.User) {
            ((Person.User) person).live();
            return;
        }

        if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
            return;
        }

        if (person instanceof Person.Coder) {
            ((Person.Coder) person).coding();
            return;
        }

        if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
            return;
        }
    }
}
