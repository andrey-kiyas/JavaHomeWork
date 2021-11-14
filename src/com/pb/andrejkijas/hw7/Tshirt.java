package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes
 * **/

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    protected Tshirt(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
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