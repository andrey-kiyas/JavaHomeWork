package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Skirt (юбка) реализует интерфейс WomenClothes
 * **/

public class Skirt extends Clothes implements WomenClothes {
    protected Skirt(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super(nameClothing, sizeClothing, priceClothing, colorClothing);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(nameClothing);
        sb.append(" (размер - ").append(sizeClothing);
        sb.append(", цена - ").append(priceClothing).append(" грн.");
        sb.append(", цвет - ").append(colorClothing).append(")");
        return sb.toString();
    }
}