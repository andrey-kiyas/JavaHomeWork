package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes
 * **/

public class Tshirt extends Clothes implements ManClothes,WomenClothes{

    public Tshirt() {
        super();
    }

    public Tshirt(ClothesSize size, Color color, int price) {
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    @Override
    public void dressMan() {
        StringBuilder info = new StringBuilder("Мужская одежда: ");
        info.append(getSize()).append(", ");
        info.append(getColor()).append(", ");
        info.append(getPrice()).append(".");
        System.out.println(info);
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
        return "Футболка {" +
                "размер = " + getSize() +
                ", цена = "   + getPrice() +
                ", цвет = " + getColor() +
                '}';
    }
}