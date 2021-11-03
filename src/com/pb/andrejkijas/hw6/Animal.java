package com.pb.andrejkijas.hw6;

public class Animal {

    private String animalKind; // вид животного
    private String animalName; // имя животного
    private String food;       // еда
    private String location;   // местонахождение


    public Animal(String animalKind, String animalName) {
        this.animalKind = animalKind;
        this.animalName = animalName;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void makeNoise() {
        System.out.println(animalKind + " " + animalName + " издает звуки");
        //System.out.println(animalKind + " издает звуки");
    }
}