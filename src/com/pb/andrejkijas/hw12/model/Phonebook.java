package com.pb.andrejkijas.hw12.model;

import com.pb.andrejkijas.hw11.exception.NoFindRecordException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Обеспечить следующий функционал:
 * - добавление элемента
 * - удаление элемента
 * - поиск элементов
 * - вывод всех записей с сортировкой по указанному полю (можно ограничиться двумя на выбор)
 * - редактирование элемента
 * - запись в файл всех данных
 * - загрузка из файла всех данных
 */

public class Phonebook {
    private static List<Record> recordList = new ArrayList<>();
    private static final String FILE_NAME = "save12.dat";

    public static void addRecord(Record record) {
        recordList.add(record);
    }

    public static Record getRecordByIndex(int index) throws NoFindRecordException {
        if (index < 0) {
            String msg = String.format("Не найдено по индексу: %s", index);
            throw new NoFindRecordException(msg);
        }
        return recordList.get(index);
    }

    public static void searchRecordByLastName(String lastName) {
        recordList.stream()
                .filter(record -> record.getLastName().equalsIgnoreCase(lastName))
                .limit(1)
                .forEach(System.out::println);
    }

    public static void searchRecordByPhone(String phoneNumb) {
        recordList.stream()
                .filter(record -> record.getPhoneByNumber(phoneNumb).equals(phoneNumb))
                .limit(1)
                .forEach(System.out::println);

    }

    public static void saveAllToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(recordList);
            System.out.println("Сохранено в файл... OK!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void loadAllFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<Record> loadRecordList = (List<Record>) ois.readObject();
            System.out.println("Загружено из файла... OK!");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void print() {
        recordList.forEach(System.out::println);
    }

    public static void printFirstNElements(int n) {
        recordList.stream()
                .limit(n)
                .forEach(System.out::println);
    }
}
