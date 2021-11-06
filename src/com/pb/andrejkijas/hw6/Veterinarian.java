package com.pb.andrejkijas.hw6;

/**
 * Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод печатает на экран food и location пришедшего на прием животного.
 */
public class Veterinarian {
    private String nameDoctor;
    private String sex;
    private int yearExperience;

    public Veterinarian() {
    }

    public Veterinarian(String nameDoctor, String sex, int yearExperience) {
        this.nameDoctor = nameDoctor;
        this.sex = sex;
        this.yearExperience = yearExperience;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void treatAnimal(Animal animal) {
        String name;
        if (animal instanceof Cat) {
            name = ((Cat) animal).getName();
            printTreat(name, animal);
            System.out.println("Назначенные процедуры: обработка когтей, профилактика ушей\n");
        } else if (animal instanceof Dog) {
            name = ((Dog) animal).getName();
            printTreat(name, animal);
            System.out.println("Назначенные процедуры: профилактика блох, стрижка\n");
        } else if (animal instanceof Horse) {
            name = ((Horse) animal).getName();
            printTreat(name, animal);
            System.out.println("Назначенные процедуры: обслуживание подков, прививка\n");
        } else {
            System.out.println("Извините, но профиль нашей клиники не позволяет принять данное животное\n");
            return;
        }
    }

    private void printTreat(String name, Animal animal) {
        System.out.println("Доктор: " + nameDoctor + ". Пациент: " + name + ". Еда животного: " + animal.getFood()
                + " расположение: " + animal.getLocation());
    }
}
