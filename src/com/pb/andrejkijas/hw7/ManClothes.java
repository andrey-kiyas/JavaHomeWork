package com.pb.andrejkijas.hw7;

/**
 * Создать интерфейсы
 * ManClothes (мужская одежда) c методом dressMan (одеть мужчину)
 * Этот метод не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
 * **/

interface ManClothes {

    default void dressMan() {

    }
//        return "Мужчина одел" +
//                ": одежда - "  + getNameClothing() +
//                "; размер - "  + getSizeClothing() +
//                "; цена - "    + getPriceClothing() +
//                "; цвет - "    + getColorClothing();
}