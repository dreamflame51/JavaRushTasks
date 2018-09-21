package com.javarush.task.task15.test1534;

public class Synch {
    // synchronized block example
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller obj1 = new Caller(target, "Welcome to");
        Caller obj2 = new Caller(target, "the synchronized");
        Caller obj3 = new Caller(target, "world!");


        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

    }


}
