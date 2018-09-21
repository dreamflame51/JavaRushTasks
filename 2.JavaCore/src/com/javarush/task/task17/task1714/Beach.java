package com.javarush.task.task17.task1714;

/* 
Comparable
*/

import jdk.nashorn.internal.ir.annotations.Ignore;
// compare int with compareTo method
public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

    }

    @Override
    public synchronized int compareTo(Beach o) {
//        int better = this.quality.compareTo(o.quality);
//        //Sorting by first name if last name is same d
//        return better == 0 ? this.distance.compareTo(o.distance) : better;

        // return Integer.compare(this.quality, o.quality);
        //  return Integer.compare(this.distance, o.distance);
        return name.compareTo(o.getName()) + (int) (distance * quality - o.getDistance() * o.getQuality());
    }
}
