package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/
// parse arguments to values of object
public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        // create person
        switch (args[0]) {
            case "-c":
                for (int step = 1; step < args.length; step += 3) {
                    Date date = null;
                    try {
                        date = dateFormat.parse(args[step + 2]);
                    } catch (ParseException e) {
                        e.getMessage();
                    }
                    Person person;
                    if (args[step + 1].startsWith("м")) {
                        person = Person.createMale(args[step], date);
                    } else {
                        person = Person.createFemale(args[step], date);
                    }
                    synchronized (allPeople) {
                        allPeople.add(person);
                    }
                    System.out.println(allPeople.indexOf(person));

                }
                break;

            case "-u": {

                synchronized (allPeople) {
                    for (int step = 1; step < args.length; step += 4) {
                        int index = Integer.parseInt(args[step]);
                        Person person = allPeople.get(index);

                        //update name
                        person.setName(args[step + 1]);

                        // update date

                        Date date = null;
                        try {
                            date = dateFormat.parse(args[step + 3]);
                        } catch (ParseException e) {
                            e.getMessage();
                        }

                        person.setBirthDay(date);
                        //update sex

                        if (args[step + 2].startsWith("м")) {
                            person.setSex(Sex.MALE);
                        } else {
                            person.setSex(Sex.FEMALE);

                        }
                    }
                } // sync
                break;
            }
            case "-d": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        person.setSex(null);
                        person.setBirthDay(null);
                        person.setName(null);


                    }
                }
                break;
            }
            // create string with stringbuffer
            case "-i": {
                synchronized (allPeople) {
                    for (int i = 0; i < args.length; i++) {
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        StringBuffer s = new StringBuffer();
                        s.append(person.getName());
                        s.append(" ");
                        s.append(person.getSex() == Sex.MALE ? "м" : "ж");
                        s.append(" ");
                        s.append(dateFormatPrt.format(person.getBirthDay()));

                    }
                }
            }
            break;
        }

    }
}
