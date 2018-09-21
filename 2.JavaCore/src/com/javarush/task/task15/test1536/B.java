package com.javarush.task.task15.test1536;

public class B {
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name + " stepped into method B.bar()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Class was interrupted");
        }
        System.out.println(name + " trying to call method A.last()");
    }
    synchronized void last(){
        System.out.println("Inside method A.last()");
    }
}
