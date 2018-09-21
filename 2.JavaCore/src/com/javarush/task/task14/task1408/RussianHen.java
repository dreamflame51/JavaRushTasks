package com.javarush.task.task14.task1408;

public class RussianHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 22;
    }

    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), RUSSIA, getCountOfEggsPerMonth());
    }
}
