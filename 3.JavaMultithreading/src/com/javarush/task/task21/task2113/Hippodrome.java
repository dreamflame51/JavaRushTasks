package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    private List<Horse> horses;

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move() {
        for (int i = 0; i < horses.size(); i++) {
            horses.get(i).move();

        }
    }


    public void print() {
        for (Horse hrs : horses) {
            hrs.print();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = null;
        double maxDst = 0;
        for (Horse hrs : getHorses()) {
            if (hrs.getDistance() > maxDst) {
                maxDst = hrs.getDistance();
                winner = hrs;
            }
        }
        return winner;
    }

    public void printWinner() {

        System.out.println("Winner is " + getWinner().getName() + "!");

    }

    public static void main(String[] args) throws InterruptedException {

        game = new Hippodrome(new ArrayList<>());

        Horse h1 = new Horse("h1", 3, 0);
        Horse h2 = new Horse("h2", 3, 0);
        Horse h3 = new Horse("h3", 3, 0);

        game.getHorses().add(h1);
        game.getHorses().add(h2);
        game.getHorses().add(h3);

        game.run();
        game.printWinner();

    }
}
