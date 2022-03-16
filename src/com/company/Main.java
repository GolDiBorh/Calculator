package com.company;

import java.util.Scanner;

public class Main  {

    public static void main(String[] args) {
        System.out.println("Для последней попытки работы с калькулятором введите [7 * 7]");
        while (true) {

            String b1 = "";
            String b2 = "";
            String b3 = "";
            String b4 = "";

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите выражение - [10 * 10] или [X + X] + Enter : ");
            String var[] = new String[1];
            String mas1[] = new String[4];
            mas1[3] = "";
            var[0] = scanner.nextLine();
            b1 = var[0];
            for (int i = 0; i < mas1.length; i++) {
                mas1 = b1.split(" ");
            }
            if (mas1.length > 4) {
                throw new NumberFormatException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
            b1 = mas1[0];
            try {
                b2 = mas1[2];
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new ArrayIndexOutOfBoundsException("Cтрока не является математической операцией");

            }
            b3 = mas1[1];
            b4 = mas1[0] + mas1[2];

            int v1[] = NoRoman.romantoint(b1, b2);
            int k, l;
            if (v1[1] != 0 | v1[0] != 0) {
                k = Oper.op(b3, v1[0], v1[1]);
                if(k<1) throw new NumberFormatException("Неверный формат данных");
                System.out.println(ToRoman.torom(k));
            }
            try {
                for (char c : b4.toCharArray()) {
                    if (Character.isDigit(c)) {
                        int v = Integer.parseInt(b1);
                        int x = Integer.parseInt(b2);

                        l = Oper.op(b3, v, x);
                        System.out.println(l);

                        if(l==49) return;
                    }
                    break;
                }
            } catch (NumberFormatException e) {
                b2 = "";
                throw new NumberFormatException("Неверный формат данных");
            }

        }
    }
    }

