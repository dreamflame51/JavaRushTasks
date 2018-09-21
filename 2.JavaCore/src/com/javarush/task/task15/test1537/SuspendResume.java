package com.javarush.task.task15.test1537;

public class SuspendResume {

    // thread manipulations
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("First");
        NewThread ob2 = new NewThread("Second");

        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Thread suspended One");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Thread resumed One");
            ob2.mySuspend();
            System.out.println("Thread suspended Two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Thread resumed Two");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        // wait until execution thread would complete
        try {
            System.out.println("...wait until execution thread would complete");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread completed");


    }
}
