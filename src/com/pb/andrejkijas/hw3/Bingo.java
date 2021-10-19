package com.pb.andrejkijas.hw3;

import java.util.Random;
import java.util.Scanner;

/*
1. Написать программу игру “Bingo”.
Создайте класс Bingo в пакете hw3.
Программа должна загадать целое число в диапазоне от 0 до 100 и предложить пользователю его отгадать.
При вводе числа пользователем, программа проверяет на соответствие с загаданным число и если числа совпали вывести сообщение о том, что число отгадано.
Если числа не совпали, тогда следует вывести надпись о том, что задуманное число является больше или меньше вводимого.
Также программа ведет подсчет попыток, и выводит это количество после того как число угадали.
Предусмотреть возможность досрочного завершения программы, в случае если пользователь не желает продолжать угадывать число.
*/

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int x = 0;
        Random random = new Random();
        int r = random.nextInt(101);    // загадываем число от 0 до 100

        System.out.println("Угадайте задуманное мною число от нуля до ста.");
        System.out.println("Для выхода из программы введите - \"exit\".");

        //System.out.println(r); // Раскомментить на случай если нужно знать загаданное число

        for (; ;){
            counter++;
            // Проверяем введен текст или число
            if (scan.hasNextInt()) {
                x = scan.nextInt();
                if (x > r){
                    System.out.println("Попробуйте ввести число меньше");
                }else if (x < r){
                    System.out.println("Попробуйте ввести число больше");
                }else{
                    System.out.println("Верный ответ угадан! Это была попытка номер: " + counter + ".");
                    break;
                }
            } else if (scan.hasNextLine()) {
                if (scan.hasNext("exit")) {
                    System.out.println("Вы ввели \"exit\", игра окончена!");
                } else {
                    System.out.println("Вы не ввели \"exit\", но понятно, что игра окончена!");
                }
                break;
            }
        }
    }
}
