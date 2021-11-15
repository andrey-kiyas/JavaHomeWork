package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Skirt (юбка) реализует интерфейс WomenClothes
 * **/

public class Skirt extends Clothes implements WomenClothes{

    public Skirt() {
        super();
    }

    public Skirt(ClothesSize size, Color color, int price) {
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    @Override
    public void dressWomen() {
        StringBuilder info = new StringBuilder("Женская одежда: ");
        info.append(getSize()).append(", ");
        info.append(getColor()).append(", ");
        info.append(getPrice()).append(".");
        System.out.println(info);
    }

    @Override
    public String toString() {
        //return getClass().getSimpleName() + ": " + super.toString();
        return "Юбка (" +
                "размер = " + getSize() +
                ", цена = "   + getPrice() +
                ", цвет = " + getColor() +
                ')';
    }
}