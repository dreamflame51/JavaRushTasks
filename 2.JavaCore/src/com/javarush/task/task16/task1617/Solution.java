package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 5;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();


    }

    public static class RacingClock extends Thread {

        public RacingClock() {
            start();
        }

        public void run() {
            int i = 0;
            try {
                while (!isInterrupted()) {
                    System.out.print(countSeconds + " ");
                    Thread.sleep(1000);
                    countSeconds--;
                    if (countSeconds == i) {
                        System.out.print("Марш!");
                        return;
                    }

                }


            } catch (InterruptedException e) {
                System.out.print("Прервано!");
            }


        }
    }
}
