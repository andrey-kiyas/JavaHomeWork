package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Tie (галстук) реализует интерфейс ManClothes
 * **/

public class Tie extends Clothes implements ManClothes {
    Tie(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super(nameClothing, sizeClothing, priceClothing, colorClothing);
    }
}