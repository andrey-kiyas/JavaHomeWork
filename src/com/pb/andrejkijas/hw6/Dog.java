package com.pb.andrejkijas.hw6;

public class Dog extends Animal{
    public Dog() {
        super("Пес", "Шарик");
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalKind() + " " + getAnimalName() + " лает");
        //super.makeNoise();
    }
}
