package com.pb.andrejkijas.hw9;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

//import java.nio.file.Paths;

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






        Path path = Paths.get("files09/numbers.txt");
        // чтение всех строк файла
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for (String s: lines) {
            System.out.println(s);
        }





//        Path path = Paths.get("files09/numbers.txt");
//
//        try (Scanner scan = new Scanner(path)) {
//            int[] arrayC = new int[100];
//            int in;
//
//            String str = scan.nextLine();
//
//            while (true) {
//                in = Integer.parseInt(str);
//                if (in % 2 == 0){
//                    in = 0;
//                }
//                String b = String.valueOf(in);
//
//
//                System.out.println(b);
//            }
//
//
//        } catch (NoSuchElementException ex) {
//            System.out.println("Файл прочитан");
//        } catch (IOException ex) {
////            ex.printStackTrace();
//            System.out.println("Файл не найден");
//        }






    }










    private static void createNumbersFile(){
        int[] arrayR = new int[100];
        Random random = new Random();
        for (int i = 0; i < arrayR.length; i++) {
            arrayR[i] = 0 + random.nextInt(99 - 0 + 1);
        }
        try (Writer writer = new FileWriter("files09/numbers.txt")) {
            for (int j = 0; j <= arrayR.length+1; j++) {
                if ((j) % 10 == 0) {
                    if(j == 0){
                        writer.write(arrayR[j] + " ");
                    } else {
                        writer.write(arrayR[j] + " \n");
                    }
                } else {
                    writer.write(arrayR[j] + " ");
                }
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
        System.out.println("Данные созданы и записаны в файл \"numbers.txt\"");
    }

    private static void printCreatedFile(){
        try (InputStream is = new FileInputStream("files09/numbers.txt")) {
            System.out.println("Так выглядит файл \"numbers.txt\" изнутри:\n");
            int available = is.available();
            byte[] arrayR = new byte[available];
            int i = 0;
            int data = is.read();
            while (data != -1) {
            arrayR[i] = (byte) data;
            data = is.read();
            i++;
            }
        System.out.println(new String(arrayR));
        } catch (Exception ex) {
        //ex.printStackTrace();
        System.out.println("Файл не найден");
        }
    }

    private static void createOddNumbersFile(){
        // Надо как-то вычитать файл и подставить вместо четных значений нолики
    }
}