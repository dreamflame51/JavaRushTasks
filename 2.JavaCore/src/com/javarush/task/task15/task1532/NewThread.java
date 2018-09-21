package com.javarush.task.task15.task1532;

import com.sun.org.apache.xpath.internal.SourceTree;

public class NewThread implements Runnable {
    String name;
    Thread t;

    NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println(name + " thread was created: " + t.toString());
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; --i) {
                System.out.println(name + " thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " thread interrupted!");
        }
        System.out.println(name + " thread completed.");


    }
}
