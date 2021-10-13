package com.pb.andrejkijas.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String symbol;
        int result;
        //String sign = '+'; // + - * /

        System.out.println("Введите целое число: ");
        x = scan.nextInt();
        System.out.println("Введите знак уравнения (+ - * /): ");
        symbol = scan.next(); // + - * /
        System.out.println("Введите целое число: ");
        y = scan.nextInt();

        switch (symbol) {
            case "+":
                result = x + y;
                System.out.println("Результат уравнения: " + result);
                break;
            case "-":
                result = x - y;
                System.out.println("Результат уравнения: " + result);
                break;
            case "*":
                result = x * y;
                System.out.println("Результат уравнения: " + result);
                break;
            case "/":
                if(y == 0){
                    System.out.println("На ноль делить нельзя!");
                }else{
                    result = x / y;
                    System.out.println("Результат уравнения: " + result);
                }
                break;
        }
    }
}