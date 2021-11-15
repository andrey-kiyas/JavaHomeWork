package com.pb.andrejkijas.hw7;

/**
 * Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
 * **/

public abstract class Clothes {
    private ClothesSize size;
    private int price;
    private Color color;

    public ClothesSize getSize() {
        return size;
    }

    public void setSize(ClothesSize size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "размер = " + size +
                ", цена = " + price +
                ", цвет = " + color +
                '}';
    }
}