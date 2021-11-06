package com.pb.andrejkijas.hw6;

/**
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 *
 * Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
 *
 * В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
 */

public class Dog extends Animal{
    private String name;
    private String dogBreed;

    public Dog(String food, String location, String name, String dogBreed) {
        super(food, location);
        this.name = name;
        this.dogBreed = dogBreed;
    }

    public String getName() {
        return name;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Пес по кличке " + getName() + " лает");
    }

    @Override
    public void eat() {
        System.out.println("Порода собак " + getDogBreed() + " отличается высокой дрессируемостью");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (!name.equals(dog.name)) return false;
        return dogBreed.equals(dog.dogBreed);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + dogBreed.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Пес (");
        sb.append("кличка - \"").append(name).append("\"");
        sb.append(", порода - \"").append(dogBreed).append("\")");
        return sb.toString();
    }
}
