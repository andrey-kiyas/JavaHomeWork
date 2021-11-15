package com.pb.andrejkijas.hw7;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Создать класс Atelier с методом main, и еще двумя статическими методами:
 * - dressMan(Clothes[] clothes)
 * - dressWomen(Clothes[] clothes)
 * На вход которых будет поступать массив, содержащий все типы одежды.
 * **/

public class Atelier {
    public static void main(String[] args) {
        Tshirt tshirtM = new Tshirt(ClothesSize.M, Color.BLACK, 50);
        Tshirt tshirtW = new Tshirt(ClothesSize.S, Color.PINK, 500);
        Tie tie = new Tie(Color.GRAY, 25);
        Pants pantsM = new Pants(ClothesSize.M, Color.GRAY, 100);
        Pants pantsW = new Pants(ClothesSize.XS, Color.PINK, 1000);
        Skirt skirt = new Skirt(ClothesSize.XS, Color.RED, 700);
        Clothes[] clothes = generateArrClothes(tshirtM, tshirtW, pantsM, pantsW, tie, skirt);

        dressMan(clothes);
        dressWomen(clothes);

        printClothes(clothes);
    }

    public static void dressMan(Clothes[] clothes) {
        if (clothes.length == 0) {
            return;
        }
        System.out.println("Мужская одежда: ");
        for (Clothes cl: clothes) {
            if (cl instanceof ManClothes) {
                System.out.println(cl);
            }
        }
        System.out.println("--------------------------------------------------");
    }

    public static void dressWomen(Clothes[] clothes) {
        final int size = clothes.length;
        if (size == 0) {
            return;
        }
        System.out.println("Женская одежда: ");
        for (int i = 0; i < size; i++) {
            if (clothes[i] instanceof WomenClothes) {
                //System.out.printf("%d) %s\n", i+1, clothes[i].toString());
                System.out.printf(clothes[i].toString() + "\n");
            }
        }
    }

    private static Clothes[] generateArrClothes(Clothes... args) {
        int size = args.length;
        if (size > 0) {
            Clothes[] clothes = new Clothes[size];
            for (int i = 0; i < size; i++) {
                clothes[i] = args[i];
            }
            return clothes;
        } else {
            throw new NoSuchElementException();
        }
    }

    private static void printClothes(Clothes[] clothes) {
        System.out.println("--------------------------------------------------");
        System.out.println("Варианты купленной одежды:");
        Arrays.stream(clothes).forEach(System.out::println);
        System.out.println("--------------------------------------------------");
    }
}