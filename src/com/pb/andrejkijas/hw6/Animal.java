package com.pb.andrejkijas.hw6;

/**
 * Класс Animal содержит переменные food, location
 * и методы makeNoise, eat, sleep.
 * Метод sleep, например, может выводить на консоль "Такое-то животное спит".
 */
public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise() {
        System.out.println("Животное издает звуки");
    }

    public void sleep() {
        System.out.println("Животное спит...");
    }

    public void eat() {
        System.out.println("Животное ест...");
    }
}