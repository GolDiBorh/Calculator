package com.company;
import java.lang.String;

public class Oper {


    public static int op(String k,int a,int b) {
        String op[] = new String[] {"+", "-","/" ,"*" };
        int t=0;
        for(int i=0; i<op.length;i++) {
            switch (k){
               case "+": t= a + b;
               break;
               case "-": t= a - b;
               break;
               case "/":
               try {

                       t = a / b;
               }
               catch (ArithmeticException e){
                   throw new ArithmeticException("Деление на ноль");
               }
               break;
               case "*": t= a * b;
               break;
               default:
                    throw new IllegalArgumentException("Не верный знак операции");
            }
        }
        if (a > 10 | b > 10) throw new NumberFormatException("Неверный формат данных");
        if (a == 0 | b == 0) throw new NumberFormatException("Неверный формат данных");
        return t;
            }
        }
