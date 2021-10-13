package com.pb.andrejkijas.hw2;

import java.util.Scanner;

/*
1) Напишите программу консольный калькулятор.
Создайте класс Calculator в пакете hw2.
Создайте две целочисленных переменные с именами operand1 и operand2.
Предложите ввести значения operand1 и operand2 пользователю.
Также предложите пользователю ввести знак арифметической операции и поместите его в строковую переменную sign.
Пусть калькулятор может только складывать, отнимать, умножать и делить.
Для организации выбора алгоритма вычислительного процесса, используйте переключатель switch.
Выведите на экран результат выполнения арифметической операции.
В случае использования операции деления, организуйте проверку попытки деления на ноль. И если таковая имеется,
то отмените выполнение арифметической операции и уведомите об ошибке пользователя.
* */

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int y;
        String symbol; // + - * /
        int result;

        System.out.println("Введите первое целое число: ");
        x = scan.nextInt();
        System.out.println("Введите знак уравнения (+ - * /): ");
        symbol = scan.next(); // + - * /
        System.out.println("Введите второе целое число: ");
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