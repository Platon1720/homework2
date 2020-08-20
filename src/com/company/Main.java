package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 2147; // без потери точности
        float b = a;
        System.out.println(b);

        int c = 2147234323; // c потерей точности
        float t = c;
        System.out.println(t);

    }
}
