package com.pb.andrejkijas.hw7;

/**
 * Создать абстрактный класс Clothes (одежда) содержащий переменные размер (типа Size), стоимость, цвет.
 * **/

public abstract class Clothes {
    final String nameClothing; // далее по коду нужно, но нет в условии
    final ClothesSize sizeClothing;
    final int priceClothing;
    final String colorClothing;

    protected Clothes(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        this.nameClothing = nameClothing;
        this.sizeClothing = sizeClothing;
        this.priceClothing = priceClothing;
        this.colorClothing = colorClothing;
    }

    public String getNameClothing() {
        return nameClothing;
    }

    public ClothesSize getSizeClothing() {
        return sizeClothing;
    }

    public int getPriceClothing() {
        return priceClothing;
    }

    public String getColorClothing() {
        return colorClothing;
    }
}