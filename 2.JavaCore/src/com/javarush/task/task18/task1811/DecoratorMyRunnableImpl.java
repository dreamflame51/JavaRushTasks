package com.javarush.task.task18.task1811;

public class DecoratorMyRunnableImpl implements Runnable  {
    private Runnable cc;

    public DecoratorMyRunnableImpl(Runnable cc) {
        this.cc = cc;
    }

    @Override
    public void run() {
        System.out.printf("DecoratorMyRunnableImpl body ");
        cc.run();

    }
}
