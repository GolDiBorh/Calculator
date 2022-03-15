package com.company;

public class NoRoman {
    public static int[] romantoint(String s, String k) {
        String[] roman;
        int b=0, z=0;

            roman = new String[]{"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
            for (int i = 0; i < roman.length; i++) {
                if (roman[i].equals(s)) {
                    b = i;
                }

                if (roman[i].equals(k)) {
                    z = i;
                }
            }
            return new int[] {b, z};
        }
    }