package com.pluralsight.organized;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float floatval = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float result3 = longVal - floatval;


    }
}