package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    public static AmigoOutputStream cc;

    public QuestionFileOutputStream(AmigoOutputStream cc) {
        this.cc = cc;
    }


    @Override
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
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.equals("Д")) cc.close();

        reader.close();
    }
}

