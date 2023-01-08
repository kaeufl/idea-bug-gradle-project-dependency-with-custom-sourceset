package org.example;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        new ClassInMainSourceSet();
        Class.forName("org.example.ClassInCustomSourceSet");
        System.out.println("Hello world!");
    }
}