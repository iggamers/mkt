package com.code.base.interactive.jv.adv;

import java.io.FileNotFoundException;

public class D04Java {
    public static void main(String[] args) {
        D04Kotlin myClass3 = new D04Kotlin();

        try {
            myClass3.method();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        System.out.println("hello world");
    }
}




