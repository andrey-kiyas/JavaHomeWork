package com.pb.andrejkijas.hw6;

public class Cat extends Animal{
    public Cat() {
        super("Кошка","Мурка");
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalKind() + " " + getAnimalName() + " мяукает");
        //super.makeNoise();
    }
}
