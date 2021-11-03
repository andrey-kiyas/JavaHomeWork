package com.pb.andrejkijas.hw6;

public class Horse extends Animal{
    public Horse() {
        super("Лошадь", "Зорька");
    }

    @Override
    public void makeNoise() {
        System.out.println(getAnimalKind() + " " + getAnimalName() + " ржет");
        //super.makeNoise();
    }
}
