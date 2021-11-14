package com.pb.andrejkijas.hw7;

/**
 * Создать пакет hw7 и в нем создать перечисление (enum) Size со значениями XXS, XS, S, M, L.
 * Перечисление содержит метод getDescription, возвращающий строку для XXS "Детский размер",
 * для остальных "Взрослый размер".
 * Так же перечисление должно иметь метод getEuroSize() возвращающий числовое значение (32, 34, 36, 38, 40)
 * соответствующее каждому размеру.
 * Создать конструктор принимающий на вход description и euroSize.
**/

public enum ClothesSize {
    XXS(32, "Детский размер"), // Не нашел в инете этот размер, но следую задаче
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private final int euroSize;

    private final String description;

    ClothesSize(int euroSize, String description) { // private
        this.euroSize = euroSize;
        this.description = description;
    }
}