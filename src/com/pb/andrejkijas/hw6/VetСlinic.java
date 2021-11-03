package com.pb.andrejkijas.hw6;

public class VetСlinic {
    public static void main(String[] args) {

        Animal animal = new Animal("Медведь", "Потапыч");
        Horse horse = new Horse();
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal.makeNoise();
        horse.makeNoise();
        cat.makeNoise();
        dog.makeNoise();


    }
}
