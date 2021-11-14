package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Pants (штаны) реализует интерфейсы ManClothes и WomenClothes
 * **/

public abstract class Pants extends Clothes implements ManClothes, WomenClothes {
    protected Pants(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super("штаны", sizeClothing, priceClothing, colorClothing);
    }
}