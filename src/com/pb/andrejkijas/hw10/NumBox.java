package com.pb.andrejkijas.hw10;

import java.lang.reflect.Array;
import java.util.Arrays;
//import java.util.Objects;
import static jdk.nashorn.internal.objects.NativeString.indexOf;

/**
 * Создать пакет hw10.
 *
 * Реализовать параметризованный класс NumBox, T - параметр типа.
 * Параметром должен быть любой класс-наследник Number (задать необходимое условие при объявлении класса NumBox).
 *
 * Класс содержит:
 * - массив из объектов класса T, инициализировать массив в конструкторе.
 * - конструктор принимающий параметр - максимальную длину массива.
 * - метод void add(T num) добавляющий число в массив. В случае если массив полон - выбросить исключение.
 * - метод T get(int index) возвращающий число по индексу.
 * - метод int length() возвращает текущее количество элементов.
 * - метод double average() - подсчет среднего арифметического среди элементов массива.
 * - метод double sum() - сумма всех элементов массива.
 * - метод T max() - максимальный элемент массива.
 * При подсчете воспользоваться тем, что у любого из объектов подклассов Number есть методы intValue, doubleValue, floatValue и другие.
 *
 * Создать класс Main с методом main где протестировать полученный класс на примере NumBox<Float> и NumBox<Integer>.
 * */

public class NumBox<T extends Number> {
    private T[] arr;
    private int size = 0;

    public NumBox(int maxSize, Class clazz) {
        arr = (T[]) Array.newInstance(clazz, maxSize);
    }

    public void add(T num) {
        final int index = size;
//        Objects.checkIndex(index, arr.length);
        indexOf(index, arr.length);
        arr[index] = num;
        size++;
    }

    public T get(int index) {
//        Objects.checkIndex(index, arr.length);
        indexOf(index, arr.length);
        return arr[index];
    }

    public int length() {
        return size;
    }

    public double average() {
        return sum() / length();
    }

    public double sum() {
        double arrSum = 0;
        for (int i = 0; i < size; i++) {
            arrSum += arr[i].doubleValue();
        }
        return arrSum;
    }

    public T max() {
        if (size - 1 == 0) {
            throw new ArithmeticException("Array is empty");
        }
        T maxValue = arr[0];
        for (int i = 1; i < size; i++) {
            if (maxValue.doubleValue() < arr[i].doubleValue()) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public void printArr() {
        System.out.print(arr.getClass().getSimpleName() + ": ");
        System.out.println(Arrays.toString(arr));
    }

}
