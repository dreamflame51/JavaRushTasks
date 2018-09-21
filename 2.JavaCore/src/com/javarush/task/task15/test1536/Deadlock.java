package com.javarush.task.task15.test1536;

public class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Main thread");
        Thread t = new Thread(this, "Competing thread");
        t.start();

        a.foo(b); // block the A object in this execution thread
        System.out.println("back to the main thread");
    }

    @Override
    public void run() {
        b.bar(a); // block the B object in another execution thread
        System.out.println("Back to the other tread");

    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
