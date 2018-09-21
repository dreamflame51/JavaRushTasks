package com.javarush.task.task15.task1532;

public class NewТhread2 extends Thread {
    NewТhread2() {
        super("2nd Child thread");
        System.out.println("2nd Child thread" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println("2nd Child thread " + i);
                Thread.sleep(700);

            }
        } catch (InterruptedException e) {
            System.out.println("2nd Child thread was interrupted");
        }
        System.out.println("2nd Child thread completed ");


    }

}
