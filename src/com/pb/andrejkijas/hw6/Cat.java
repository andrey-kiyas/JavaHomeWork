package com.pb.andrejkijas.hw6;

/**
 * Dog, Cat, Horse переопределяют методы makeNoise, eat.
 *
 * Добавьте переменные (поля) в классы Dog, Cat, Horse, характеризующие только этих животных.
 *
 * В классах Dog, Cat, Horse переопределить методы toString, equals, hashCode.
 */

public class Cat extends Animal{
    private String name;
    private int weight;
    private String color;

    public Cat(String food, String location, String name, int weight, String color) {
        super(food, location);
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Кот " + getName() + " мяукает");
    }

    @Override
    public void eat() {
        System.out.println("Кот " + getName() + " ест,  уже весит " + getWeight() + " килограмм.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (weight != cat.weight) return false;
        if (!name.equals(cat.name)) return false;
        return color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + weight;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Кот (");
        sb.append("кличка - \"").append(name).append("\"");
        sb.append(", вес - ").append(weight).append(" кг");
        sb.append(", цвет - ").append(color).append(")");
        return sb.toString();
    }
}
