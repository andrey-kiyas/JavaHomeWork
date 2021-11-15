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
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);
    String description;
    int euroSize;


    ClothesSize(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

}