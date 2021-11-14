package com.pb.andrejkijas.hw7;

/**
 * Создать интерфейсы
 * ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
 * Этот метод не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
 * **/

interface ManClothes extends Clothes {
    public ManClothes(String nameClothing, ClothesSize sizeClothing, int priceClothing, String colorClothing) {
        super(nameClothing, sizeClothing, priceClothing, colorClothing);
    }

    public String dressMan(){
        return "Мужчина одел" +
                ": одежда - "  + getNameClothing() +
                "; размер - "  + getSizeClothing() +
                "; цена - "    + getPriceClothing() +
                "; цвет - "    + getColorClothing();
    }
}