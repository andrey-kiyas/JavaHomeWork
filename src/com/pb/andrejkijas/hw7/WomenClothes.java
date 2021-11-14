package com.pb.andrejkijas.hw7;

/**
 * Создать интерфейсы
 * WomenClothes (женская оджеда) с методом dressWomen (одеть женщину).
 * Этот метод не принимают параметров, а только выводят информацию о одежде (название, размер, цену, цвет).
 * **/

interface WomenClothes {

    default void dressWomen() {

    }
//        System.out.println("Женщина одела" +
//                ": одежда - "  + getNameClothing() +
//                "; размер - "  + getSizeClothing() +
//                "; цена - "    + getPriceClothing() +
//                "; цвет - "    + getColorClothing());
}