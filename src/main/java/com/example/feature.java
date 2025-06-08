package com.example;

public class Feature {

    public static void main(String[] args) {
        System.out.println("This will compile!");

        int result = addNumbers(5, 10);
        System.out.println("Result: " + result);
    }

    public static int addNumbers(int a, int b) {
        return a + b;

