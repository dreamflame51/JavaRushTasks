package com.javarush.task.task17.task1723;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileInputStreamDemo {


    public static void main(String[] args) throws Exception {
        String source = "Now it is time for all good men\n" + " to come and to the aid of their country\n" + " and pay their due taxes.";
        byte buf[] = source.getBytes();


        try (OutputStream f0 = new FileOutputStream("c:/javaFiles/file1.txt");
             OutputStream f1 = new FileOutputStream("c:/javaFiles/file2.txt");
             OutputStream f2 = new FileOutputStream("c:/javaFiles/file3.txt")) {
            //first file
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);
            //second file
            f1.write(buf);
            // write third file
            // array, bytes off set from the beginning, amount to write
            f2.write(buf, buf.length - buf.length / 4, buf.length / 4);

        } catch (IOException e) {
            System.out.println("Whoops...");
        }

    }
}
