package com.pb.andrejkijas.hw12;

import com.pb.andrejkijas.hw11.exception.NoFindRecordException;
import com.pb.andrejkijas.hw12.model.Phone;
import com.pb.andrejkijas.hw12.model.Phonebook;
import com.pb.andrejkijas.hw12.model.Record;

public class DemoAppStreams {
    public static void main(String[] args) throws NoFindRecordException {
        Phonebook phonebook = new Phonebook();
        Phone phone = new Phone("+38 073 123-45-67");
        Record record1 = Record.newBuilder()
                .setAddress("с. Иваново, Ивановская обл.")
                .setDob(1984, 4, 4)
                .setLastName("Иванов")
                .setPhone(phone)
                .setFirstName("Иван")
                .build();

        Record record2 = Record.newBuilder()
                .setLastName("Петров")
                .setFirstName("Петр")
                .setDob(1985,5,5)
                .setAddress("Днепр, Набережная Победы - 555")
                .setPhone(new Phone("+38 063 985-05-05"))
                .setPhone(new Phone("+38 099 985-05-05"))
                .build();

        Record record3 = Record.newBuilder()
                .setLastName("Сидоров")
                .setFirstName("Сидор")
                .setDob(1986,6,6)
                .setAddress("Украина")
                .setPhone(new Phone("+38 050 086-06-06"))
                .setPhone(new Phone("+38 067 086-06-06"))
                .build();

        Phonebook.addRecord(record1);
        Phonebook.addRecord(record2);
        Phonebook.addRecord(record3);

        phonebook.print();

        System.out.println("-- Запись по индексу");
        Record record = Phonebook.getRecordByIndex(0);
        System.out.println(record);

        System.out.println("-- Запись по фамилии (Stream)");
        Phonebook.searchRecordByLastName("Franklin");

        System.out.println("-- Запись по номеру телефона (Stream)");
        Phonebook.searchRecordByPhone("+38 063 985-05-05");

        System.out.println("-- Сохраняем данные в файл");
        Phonebook.saveAllToFile();

        System.out.println("-- Получаем данные из файла");
        Phonebook.loadAllFromFile();

        System.out.println("-- Печать первых двух элементов (Stream)");
        Phonebook.printFirstNElements(2);
    }
}