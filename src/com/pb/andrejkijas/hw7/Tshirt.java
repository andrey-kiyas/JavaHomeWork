package com.pb.andrejkijas.hw7;

/**
 * Создать классы наследники Clothes:
 * - Tshirt (футболка) реализует интерфейсы ManClothes и WomenClothes
 * **/

public class Tshirt extends Clothes implements ManClothes, WomenClothes {
    protected Tshirt(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super(nameClothing, sizeClothing, priceClothing, colorClothing);
    }
}