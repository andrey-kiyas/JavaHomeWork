package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Tie (галстук) реализует интерфейс ManClothes
 * **/

public abstract class Tie extends Clothes implements ManClothes {
    protected Tie(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super("галстук", sizeClothing, priceClothing, colorClothing);
    }
}