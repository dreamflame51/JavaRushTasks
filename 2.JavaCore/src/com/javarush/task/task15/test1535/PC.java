package com.javarush.task.task15.test1535;

public class PC {
    // wait() notify() synchronized
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Ctrl-C to cancel.");
    }
}
