package com.pb.andrejkijas.hw2;

import java.util.Scanner;

/*
2) Напишите программу определения интервала.
Создайте класс Interval в пакете hw2.
Предложите пользователю ввести целое число и сохраните его в переменную с произвольным именем.
Программа должна выяснить в какой промежуток попадает введенное число [0 -14] [15 - 35] [36 - 50] [51 - 100].
Вывести на экран сообщение с подходящим промежутком.
Если введенное число не попадает в один из имеющихся промежутков, то вывести соответствующее сообщение.
*/
public class Interval {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x;

        System.out.println("Введите целое число: ");
        x = scan.nextInt();

        if(x >= 0 && x <= 14){
            System.out.println("Введенное целое число в диапазоне от 0 до 14. Вы ввели: " + x);
        }else if(x >= 15 && x <= 35){
            System.out.println("Введенное целое число в диапазоне от 15 до 35. Вы ввели: " + x);
        }else if(x >= 36 && x <= 50){
            System.out.println("Введенное целое число в диапазоне от 36 до 50. Вы ввели: " + x);
        }else if(x >= 51 && x <= 100){
            System.out.println("Введенное целое число в диапазоне от 51 до 100. Вы ввели: " + x);
        }else{
            System.out.println("Введенное целое число не соответствует ни одному из диапазонов. Вы ввели: " + x);
        }
    }
}