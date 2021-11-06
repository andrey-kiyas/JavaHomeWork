package com.pb.andrejkijas.hw6;

import java.lang.reflect.Field;

/**
 * Создайте класс VetСlinic в его методе main создайте массив типа Animal,
 * в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте животных на прием к ветеринару.
 * Объект класса Veterinarian создайте с помощью рефлексии.
 */

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Veterinarian[] veterinarians = doctorGeneratorWithReflection();
        Animal[] animals = getAnimals();

        final int animalLen = animals.length;
        int queue = 0;
        for (int i = 0; i < animalLen; i++) { // имитируем рандомим лекарей
            queue = i;
            Animal animal = animals[i];
            Veterinarian vetDoctor = veterinarians[queue];
            vetDoctor.treatAnimal(animal);
        }
    }

    private static Veterinarian[] doctorGenerator() {
        Veterinarian vet1 = new Veterinarian("Светлана", "Ж", 5);
        Veterinarian vet2 = new Veterinarian("Александр", "М", 6);
        Veterinarian vet3 = new Veterinarian("Михаил", "М", 2);
        Veterinarian vet4 = new Veterinarian("Ирина", "Ж", 7);

        return new Veterinarian[]{vet1, vet2, vet3, vet4};
    }

    // Заветная рефлексия
    private static Veterinarian[] doctorGeneratorWithReflection() throws Exception {
        Class clazz = Veterinarian.class;
        Field[] fields = clazz.getDeclaredFields();
        Object obj1 = clazz.newInstance();
        Veterinarian vetDoc1 = (Veterinarian) obj1;

        Field f1 = clazz.getDeclaredField("nameDoctor");
        f1.setAccessible(true);
        f1.set(vetDoc1, "Иван");
        f1.setAccessible(false);

        Field f2 = clazz.getDeclaredField("sex");
        f2.setAccessible(true);
        f2.set(vetDoc1, "М");
        f2.setAccessible(false);

        Field f3 = clazz.getDeclaredField("yearExperience");
        f3.setAccessible(true);
        f3.set(vetDoc1, 8);
        f3.setAccessible(false);

        Veterinarian[] result = doctorGenerator();
        result[1] = vetDoc1;

        return result;
    }

    private static Animal[] getAnimals() {
        Cat cat = new Cat("\"Kitty\"", "г. Ирта", "Матроскин", 7, "рыжий");
        Dog dog = new Dog("\"Chappy\"", "г. Снегирево", "Амур", "овчарка");
        Horse horse = new Horse("овес", "с. Поречино", "Буран", "серый");
        Animal unknown = new Animal("сено", "с. Пригорное");
        addAnimal(cat); addAnimal(dog); addAnimal(horse);
        printAllAnimals();
        return new Animal[]{cat, dog, horse, unknown};
    }

    private static Animal[] animals = new Animal[10];
    private static int indexAnimal = 0;
    private static void addAnimal(Animal animal) {
        animals[indexAnimal++] = animal;
    }

    public static void printAllAnimals() {
        System.out.println("--------------------------------------------");
        System.out.println("Список пациентов:");
        for (int i = 0; i < indexAnimal; i++) {
            System.out.println(" - " + animals[i]);
        }
        System.out.println("--------------------------------------------\n");
    }
}