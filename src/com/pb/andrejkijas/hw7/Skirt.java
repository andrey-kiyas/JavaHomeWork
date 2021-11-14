package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Skirt (юбка) реализует интерфейс WomenClothes
 * **/

public abstract class Skirt extends Clothes implements WomenClothes {
    protected Skirt(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super("юбка", sizeClothing, priceClothing, colorClothing);
    }
}