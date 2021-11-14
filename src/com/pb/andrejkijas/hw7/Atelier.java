package com.pb.andrejkijas.hw7;

import static com.pb.andrejkijas.hw7.ClothesSize.*;

/**
 * Создать класс Atelier с методом main, и еще двумя статическими методами:
 * - dressMan(Clothes[] clothes)
 * - dressWomen(Clothes[] clothes)
 * На вход которых будет поступать массив, содержащий все типы одежды.
 * **/

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothing = new Clothes[]{
                new Tshirt("футболка", XXS, 800, "красный"),
                new Pants("штаны", L, 1500, "зеленый"),
                new Skirt("юбка", S, 2800, "желтый"),
                new Tie("галстук", M, 500, "синий")
        };

            System.out.println("--------------------------------------------\n");
    }
}