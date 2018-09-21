package com.javarush.task.task14.task1421;

// Singleton pattern realization
public class Singleton {
    private static Singleton instance;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {

        if (instance == null) instance = new Singleton();

        return instance;
    }
}
