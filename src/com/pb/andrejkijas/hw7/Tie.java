package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Tie (галстук) реализует интерфейс ManClothes
 * **/

public class Tie extends Clothes implements ManClothes{

    public Tie() {
        super();
    }

    public Tie(Color color, int price) {
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
    public String toString() {
        return "Галстук {"  +
                "цена = "   + getPrice() +
                ", цвет = " + getColor() +
                '}';
    }
}