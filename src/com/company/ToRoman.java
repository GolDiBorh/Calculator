package com.company;
import java.lang.String;
public class ToRoman {
    public static String torom(int i) {
        String s = "";
        String z = "";
        while (i >= 100) {
            s += "C";
            i -= 100;
        }
        while (i >= 90) {
            s += "XC";
            i -= 90;
        }
        while (i >= 50) {
            s += "L";
            i -= 50;
        }
        while (i >= 40) {
            s += "XL";
            i -= 40;
        }
        while (i >= 10) {
            s += "X";
            i -= 10;
        }
        while (i >= 9) {
            s += "IX";
            i -= 9;
        }
        while (i >= 5) {
            s += "V";
            i -= 5;
        }
        while (i >= 4) {
            s += "IV";
            i -= 4;
        }
        while (i >= 1) {
            s += "I";
            i -= 1;
        }
        if (s!=z) return s;
        else throw new NumberFormatException("В римской системе нет отриц. чисел");
    }
}