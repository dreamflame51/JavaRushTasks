package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen implements Country {
    @Override
    public int getCountOfEggsPerMonth() {
        return 26;
    }

    String getDescription() {
        return String.format("%s Моя страна - %s. Я несу %d яиц в месяц.", super.getDescription(), MOLDOVA, getCountOfEggsPerMonth());
    }
}

