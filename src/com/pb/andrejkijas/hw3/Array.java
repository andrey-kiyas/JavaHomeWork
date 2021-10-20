package com.pb.andrejkijas.hw3;

import java.util.Arrays;
import java.util.Random;

/*
Создайте класс Array в пакете hw3.
Программа должна позволить пользователю ввести одномерный массив целых чисел размерностью 10 элементов.
Вывести на экран введенный массив.
Подсчитать сумму всех элементов массива и вывести ее на экран.
Подсчитать и вывести на экран количество положительных элементов.
Произвести сортировку этого массива от меньшего к большему по алгоритму сортировки пузырьком.
(https://en.wikipedia.org/wiki/Bubble_sort)
Вывести на экран отсортированный массив.
 */

public class Array {
    public static void main(String[] args) {

        // Создаем пустой массив на 10 позиций
        int[] array = new int[10];

        // Задаем диапазон для "рандома" (от -20 до 20)
        int min = -20;
        int max = 20;
        Random random = new Random();

        // Заполнение массива случайными числами в заданном диапазоне
        for (int i = 0; i < array.length; i++) {
            //int rand = min + (int)(Math.random() * ((max - min) + 1));
            int rand = min + random.nextInt(max - min + 1);
            array[i] = rand;
        }

        // Вывод массива на экран (вид массива)
        System.out.println("Изначально массив имел такой вид:");
        System.out.println(Arrays.toString(array) + "\n");

        // Определяем сумму всех элементов массива и сумму только положительных элементов
        int sum = 0;
        int sumPositive = 0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
            if (array[i] > 0){
                sumPositive = sumPositive + array[i];
            }
        }

        // Вывод суммы всех чисел массива
        System.out.println("Сумма всех значений массива:");
        System.out.println(sum+ "\n");

        // Вывод суммы только положительных чисел массива
        System.out.println("Сумма положительных значений массива:");
        System.out.println(sumPositive+ "\n");

        // Сортируем пузырьком по возрастанию
        boolean isSorted = false;
        int[] tempArr = new int[array.length];
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;
                    tempArr[i] = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tempArr[i];
                }
            }
        }

        // Вывод отсортированного массива
        System.out.println("Вид массива после сортировки пузырьком:");
        System.out.println(Arrays.toString(array));
    }
}
