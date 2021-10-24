package com.pb.andrejkijas.hw4;

import java.util.Arrays;
import java.util.Scanner;

/*
2. Создайте класс Anagram в пакете hw4.
Напишите программу, которая определяет, является ли одна строка анаграммой другой строки.
Обе строки вводит пользователь.
Анаграмма - это слово или фраза, сделанная путем переноса букв другого слова или фразы.
Программа должна игнорировать пробелы и знаки препинания.
Пример анаграмм:
Аз есмь строка, живу я, мерой остр. -> За семь морей ростка я вижу рост.
Я в мире — сирота. -> Я в Риме — Ариост.
При выполнении задания использовать метод(ы).
*/


public class Anagram {
    // Метод определения анаграмм в двух строках
    public static String isAnagram(String a, String b) {
        String itog = "Нет, строки не являются анаграммой!";          // умолчательно не анаграмма до проверки
        String stA = a.replaceAll("[.,\\- ]", "");    // исключаем точки, запятые, тире и пробелы из "А"
        String stB = b.replaceAll("[.,\\- ]", "");    // исключаем точки, запятые, тире и пробелы из "В"
        char[] arrA = stA.toCharArray();                              // преобразуем "А" в массив
        char[] arrB = stB.toCharArray();                              // преобразуем "В" в массив
        Arrays.sort(arrA);                                            // сортируем массив "А"
        Arrays.sort(arrB);                                            // сортируем массив "В"
        if (Arrays.equals(arrA, arrB)) {                              // Сверяем массивы "А" и "В"
            itog = "Да, то - анаграмма!";                             // меняем "itog" если совпадают массивы "А" и "В"
        }
        return itog;                                                  // возвращаем ответ (да/нет)
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ручной ввод первой строки
        System.out.print("Введите первую строку для проверки на \"анаграммность\": \n");
        String first = in.nextLine().toUpperCase();

        // Ручной ввод второй строки
        System.out.print("Введите вторую строку для проверки на \"анаграммность\": \n");
        String second = in.nextLine().toUpperCase();

        // Проверка введенных строк на "анаграммность" вызовом метода
        String result = isAnagram(first, second);

        // Вывод ответа (да/нет)
        System.out.println("\n" + result);
    }
}

