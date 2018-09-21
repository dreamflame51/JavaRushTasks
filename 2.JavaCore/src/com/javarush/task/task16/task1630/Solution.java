package com.javarush.task.task16.task1630;


import java.io.*;
import java.util.ArrayList;

// in 2 threads read existing file name and contents and write to console

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут
    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());

    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private ArrayList<String> content;

        public ReadFileThread() {
            this.fileName = null;
            this.content = new ArrayList<>();
        }

        public void run() {
            try {
                BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
                while (fileReader.ready()) {
                    content.add(fileReader.readLine());
                }
                fileReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("File "+fileName+" not found");
            } catch (IOException e) {
                System.out.println("File "+fileName+" can't read");
            }

        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            StringBuffer sbuf = new StringBuffer();
            for (String s : content) {
                sbuf.append(s).append(" ");
            }
            return sbuf.toString();
        }
    }
}

//public class Solution {
//    public static String firstFileName;
//    public static String secondFileName;
//    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//    static {
//        try {
//            firstFileName = reader.readLine();
//            secondFileName = reader.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) throws InterruptedException {
//        systemOutPrintln(firstFileName);
//        systemOutPrintln(secondFileName);
//    }
//
//    public static void systemOutPrintln(String fileName) throws InterruptedException {
//        ReadFileInterface f = new ReadFileThread();
//        f.setFileName(fileName);
//        f.start();
//        f.join();
//
//        System.out.println(f.getFileContent());
//    }
//
//    public interface ReadFileInterface {
//
//        void setFileName(String fullFileName);
//
//        String getFileContent();
//
//        void join() throws InterruptedException;
//
//        void start();
//    }
//
//    public static class ReadFileThread extends Thread implements ReadFileInterface {
//        BufferedReader br = null;
//
//        public void run() {
//            try {
//
//                System.out.print(getFileContent() + " ");
//                reader.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        @Override
//        public void setFileName(String fullFileName) {
//            String path = "C://javaFiles/";
//            try {
//                br = new BufferedReader(new FileReader(path + fullFileName));
//            } catch (FileNotFoundException e) {
//
//            }
//
//        }
//
//        @Override
//        public String getFileContent() {
//
//            try {
//                String contentLine = br.readLine();
//                while (contentLine != null) {
//                    System.out.print(contentLine + " ");
//                    contentLine = br.readLine();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return "";
//        }
//
//
//    }
//
//}
