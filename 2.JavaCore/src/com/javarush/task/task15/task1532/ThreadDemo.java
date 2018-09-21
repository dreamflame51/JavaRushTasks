package com.javarush.task.task15.task1532;

public class ThreadDemo {
    // multithreading example with for loop
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("Child");
        //   NewТhread2 obj2 = new NewТhread2();
        NewThread obj3 = new NewThread("3rd Child");
        NewThread obj4 = new NewThread("4th Child");

        System.out.println("Child thread is ran " + obj1.t.isAlive());
        //  System.out.println("Child thread is ran " + obj2.t.isAlive());
        System.out.println("3rd Child thread is ran " + obj3.t.isAlive());
        System.out.println("4th Child thread is ran " + obj4.t.isAlive());

        try {
            //           Thread.sleep(10000); // Can simply wait till the process ends|| how would you know how much time should it take?
            System.out.println("Waiting till the threads complete");
            obj1.t.join();
            obj3.t.join();
            obj4.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted!");
        }

        System.out.println("Child thread is ran " + obj1.t.isAlive());
        //  System.out.println("Child thread is ran " + obj2.t.isAlive());
        System.out.println("3rd Child thread is ran " + obj3.t.isAlive());
        System.out.println("4th Child thread is ran " + obj4.t.isAlive());


        //   System.out.println("Main thread completed after 10seconds.");
        System.out.println("All threads completed join() method reported");
    }
}
