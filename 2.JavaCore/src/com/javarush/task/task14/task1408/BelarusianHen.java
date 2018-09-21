package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen implements Country {

    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }
 // Returns formatted simple string
    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), BELARUS, getCountOfEggsPerMonth());
    }
}
