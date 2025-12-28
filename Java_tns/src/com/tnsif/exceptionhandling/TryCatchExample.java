package com.tnsif.exceptionhandling;

public class TryCatchExample {

    static int performDivision(int x, int y) {
        System.out.println("I am in performDivision method");
        int z = x / y;   // may cause exception
        return z;
    }

    static float performDivision(float a, float b) {
        return a / b;
    }

    public static void main(String[] args) {

        try {
            int result = performDivision(10, 0);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        System.out.println("Program finished");
    }
}
