package com.pb.andrejkijas.hw9;

import java.io.*;
import java.util.Random;
import java.util.stream.Collectors;

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
    private static final String FILE_NAME = "files09/numbers.txt";
    private static final String NEW_FILE_NAME = "files09/odd-numbers.txt";

    public static void main(String[] args) {
        System.out.println("\n--------------------------------------------------");
        createNumbersFile();
        System.out.println("\nСоздан файл \"numbers.txt\"");
        System.out.println("\n--------------------------------------------------");
        System.out.println("\nТак выглядит файл \"numbers.txt\" изнутри:\n");
        printCreatedFile();
        System.out.println("\n--------------------------------------------------");
        System.out.println("\nТак выглядит файл \"odd-numbers.txt\" изнутри:\n");
        createOddNumbersFile(FILE_NAME);
        System.out.println("\n--------------------------------------------------");
    }

    public static void createNumbersFile() {
        try (FileWriter writer = new FileWriter(FILE_NAME, false)) {
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 1; i < 100; i++) {
                int j = 0 + random.nextInt(99 - 0 + 1);
                String textVal = String.format("%-3d", j);
                sb.append(textVal);
                if (i % 10 == 0) {
                    sb.append("\n");
                }
            }
            writer.write(sb.toString());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printCreatedFile(){
        try (InputStream is = new FileInputStream("files09/numbers.txt")) {
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

    public static void createOddNumbersFile(String fileName) {
        String textFromFile = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            textFromFile = reader.lines()
                    .map(n -> checkAndReplaceOddNum(n))
                    .collect(Collectors.joining("\n"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeOggNumbToFile(textFromFile);
        System.out.println(textFromFile);
    }

    private static void writeOggNumbToFile(String textFromFile) {
        try (FileWriter writer = new FileWriter(NEW_FILE_NAME, false)) {
            writer.write(textFromFile);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String checkAndReplaceOddNum(String strNum) {
        String[] arrNumb = strNum.split(" ");
        StringBuilder sb = new StringBuilder();
        String textVal = "";
        try {
            final int size = arrNumb.length;
            for (int i = 0; i < size; i++) {
                if (arrNumb[i].length() > 0) {
                    int number = Integer.parseInt(arrNumb[i]);
                    if (number % 2 == 0) {
                        number = 0;
                        textVal = String.format("%-3d", number);
                    } else {
                        textVal = String.format("%-3d", number);
                    }
                    sb.append(textVal);
                }
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}