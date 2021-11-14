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

        Clothes[] clothes = getСlothes();

    }


    private static Clothes[] getСlothes() {
        Tshirt tshirt = new Tshirt("футболка", XXS, 800, "красный");
        Pants pants = new Pants("штаны", L, 1500, "зеленый");
        Skirt skirt = new Skirt("юбка", S, 2800, "желтый");
        Tie tie = new Tie("галстук", M, 500, "синий");
        addClothes(tshirt); addClothes(pants); addClothes(skirt); addClothes(tie);
        printAllClothes();
        return new Clothes[]{tshirt, pants, skirt, tie};
    }

    private static Clothes[] сlothes = new Clothes[10];
    private static int indexClothes = 0;
    private static void addClothes(Clothes clothes) {
        сlothes[indexClothes++] = clothes;
    }

    public static void printAllClothes() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Перечень одежды:");
        for (int i = 0; i < indexClothes; i++) {
            System.out.println(" - " + сlothes[i]);
        }
        System.out.println("-----------------------------------------------------------\n");
    }
}