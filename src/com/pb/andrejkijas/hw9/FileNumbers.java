package com.pb.andrejkijas.hw9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Random;

/**
 * В пакете hw9 создать класс FileNumbers.
 * В нем создать методы:
 *
 * - createNumbersFile - создает текстовый файл "numbers.txt" заполненный случайными целыми числами от 1 до 99.
 * 10 строк и по 10 чисел в каждой строке. Числа разделять пробелами.
 *
 * - createOddNumbersFile - читает файл "numbers.txt", и создает на основе него новый файл "odd-numbers.txt" в который
 * входят все числа из "numbers.txt" только все четные заменены на 0.
 *
 * В методе main продемонстрировать работу методов createNumbersFile и createOddNumbersFile.
 *
 * По желанию можно добавить логирование работы программы.
 * **/

public class FileNumbers {
    public static void main(String[] args) throws Exception{
        System.out.println("--------------------------------------------------");
        createNumbersFile();
        System.out.println("--------------------------------------------------");
        printCreatedFile();
        System.out.println("--------------------------------------------------");
        System.out.println("Тута будит - createOddNumbersFile()");
        createOddNumbersFile();
        System.out.println("--------------------------------------------------");
    }

    private static void createNumbersFile(){
        int[] arrayRW = new int[100];
        Random random = new Random();
        for (int i = 0; i < arrayRW.length; i++) {
            arrayRW[i] = 0 + random.nextInt(99 - 0 + 1);
        }
        try (Writer writer = new FileWriter("files09/numbers.txt")) {
            for (int j = 0; j <= arrayRW.length+1; j++) {
                if ((j) % 10 == 0) {
                    if(j == 0){
                        writer.write(arrayRW[j] + " ");
                    } else {
                        writer.write(arrayRW[j] + " \n");
                    }
                } else {
                    writer.write(arrayRW[j] + " ");
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Данные созданы и записаны в файл \"numbers.txt\"");
    }

    private static void printCreatedFile(){
        char[] arrayR = new char[1000];
        try (Reader reader = new FileReader("files09/numbers.txt")) {
            reader.read(arrayR);
            System.out.println("Данные файла");
            System.out.println(arrayR);
        } catch(Exception e) {
            //e.printStackTrace();
            System.out.println("Файл не найден");
        }
    }

    private static void createOddNumbersFile(){
        // Надо как-то вычитать файл и подставить вместо четных значений нолики
    }
}