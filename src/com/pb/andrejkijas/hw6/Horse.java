package com.pb.andrejkijas.hw6;

public class Horse extends Animal{
    private String name;
    private String color;

    public Horse(String food, String location, String name, String color) {
        super(food, location);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Лошадь по кличке " + getName() + " ржет по-лошадиному");
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Horse horse = (Horse) o;

        if (!name.equals(horse.name)) return false;
        return color.equals(horse.color);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Лошадь (");
        sb.append("кличка - \"").append(name).append("\"");
        sb.append(", окрас - ").append(color).append(")");
        return sb.toString();
    }
}
