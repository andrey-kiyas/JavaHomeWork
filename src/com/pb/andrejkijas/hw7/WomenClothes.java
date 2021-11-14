package com.pb.andrejkijas.hw7;

/**
 * Создать интерфейсы
 * WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
 * Этот метод не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
 * **/

interface WomenClothes extends Clothes {
    default WomenClothes(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super(nameClothing, sizeClothing, priceClothing, colorClothing);
    }

    public String dressWomen(){
        return "Женщина одела" +
                ": одежда - "  + getNameClothing() +
                "; размер - "  + getSizeClothing() +
                "; цена - "    + getPriceClothing() +
                "; цвет - "    + getColorClothing();
    }
}