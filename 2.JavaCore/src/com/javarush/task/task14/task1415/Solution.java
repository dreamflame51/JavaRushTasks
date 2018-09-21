package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<>();
        apartments.add(new Apt1Room());
        apartments.add(new Apt2Room());
        apartments.add(new Apt3Room());

        cleanAllApartments(apartments);
    }
// iterate through the list and execute appropriate class method
    public static void cleanAllApartments(List<Apartment> apartments) {
        for (Apartment arr : apartments) {
            if (arr instanceof Apt1Room) {
                ((Apt1Room) arr).clean1Room();
                continue;
            }
            if (arr instanceof Apt2Room) {
                ((Apt2Room) arr).clean2Rooms();
                continue;
            }
            if (arr instanceof Apt3Room) {
                ((Apt3Room) arr).clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class Apt1Room implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class Apt2Room implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class Apt3Room implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
