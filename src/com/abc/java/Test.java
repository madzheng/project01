package com.abc.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

public class Test {


    private static Date ff;
    String[] arr = new String[]{"tom", "jerry", "lilei"};
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Test.main");
        System.out.println("args = " + args);
        if (args == null) {

        }
    }
    public static void ss() {
        System.out.println("Hello world!");
        ff = new Date();
        ff = new Date();
    }

    public Test() {
        try {
            FileInputStream fis = new FileInputStream("hello");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void testTest(){
        String s = new String();

    }

}
