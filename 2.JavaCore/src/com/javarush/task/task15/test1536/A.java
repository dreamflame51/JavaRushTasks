package com.javarush.task.task15.test1536;

public class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " stepped into method A.foo()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Class was interrupted");
        }
        System.out.println(name + " trying to call method B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("Inside method A.last()");
    }

}
