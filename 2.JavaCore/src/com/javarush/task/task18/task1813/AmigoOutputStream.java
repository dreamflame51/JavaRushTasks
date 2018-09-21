package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream  {
    private FileOutputStream cc;
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(FileOutputStream cc) throws FileNotFoundException {
        super(fileName);
        this.cc = cc;
    }
    public void flush() throws IOException {
        cc.flush();
    }
//    public void deposit(String money) {
//        deposit(new BigDecimal(money));
//    }

    @Override
    public void write(int b) throws IOException {
        cc.write(b);

    }

    @Override
    public void write(byte[] c) throws IOException {
        cc.write(c);
    }

    @Override
    public void write(byte[] d, int off, int len) throws IOException {
        cc.write(d, off, len);

    }

    @Override
    public void close() throws IOException {
    cc.flush();
    write("JavaRush © All rights reserved.".getBytes());
    cc.close();
    }


    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
