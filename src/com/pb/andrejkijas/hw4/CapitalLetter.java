package com.pb.andrejkijas.hw4;

import java.util.Scanner;

/*
1. Создайте класс CapitalLetter в пакете hw4.
Напишите программу, которая принимает строку и переводит первую букву слова в верхний регистр.
Строку должен ввести пользователь.
Пример работы:
Истина — это то, что выдерживает проверку опытом. Эйнштейн А.
Истина — Это То, Что Выдерживает Проверку Опытом. Эйнштейн А.
При выполнении задания использовать метод(ы).
*/

public class CapitalLetter {

    //МЕТОД преобразования сроки в массив
    static String[] toArray(String str) {
        return str.split(" ");
    }

    //МЕТОД преобразования текстовых значений массива в аперкейс первой буквы
    static String[] toUpperArray(String[] uArr) {
        String[] tempUpperArr = new String[uArr.length];
        for (int i = 0; i < uArr.length; i++) {
            tempUpperArr[i] = uArr[i].substring(0, 1).toUpperCase() + uArr[i].substring(1);
        }
        return tempUpperArr;
    }

    //МЕТОД преобразования сроки в массив
    static String arrToString (String[] toString) {
        return String.join(" ", toString);
    }

    public static void main(String[] args) {

        // Просим пользователя завести строку для преобразования
        System.out.println("Введите произвольную строку:\n");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        // Вызываем метод преобразования строки в массив
        String[] tempArray = toArray(str);

        // Вызываем метод преобразования текстовых значений массива в аперкейс первой буквы
        tempArray = toUpperArray(tempArray); //System.out.println(Arrays.toString(tempArray));

        // Вызываем метод преобразования массива обратно в строку
        String resArr = arrToString(tempArray);

        // Вывод результата обработки
        System.out.println("\nРезультат обработки введенной строки:");
        System.out.println("\n" + resArr);
    }
}