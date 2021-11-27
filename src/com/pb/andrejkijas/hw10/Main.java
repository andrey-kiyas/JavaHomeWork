package com.pb.andrejkijas.hw10;

public class Main {
    public static void main(String[] args) {
        exampleInt();
        exampleLong();
        exampleFloat();
        exampleDouble();
    }

    private static void exampleDouble() {
        System.out.println("\n---------------------------------\nDouble");
        NumBox<Double> doubleBox = new NumBox<>(11, Double.class);
        doubleBox.add(2.4);
        doubleBox.add(40.0);
        doubleBox.add(26.5);
        doubleBox.add(1.6);
        doubleBox.add(52.0);
        doubleBox.add(50.5);
        doubleBox.add(50.0);
        doubleBox.add(15.0);
        doubleBox.printArr();
        System.out.println("\nget[1]: " + doubleBox.get(1));
        System.out.println("length: " + doubleBox.length());
        System.out.println("average: " + doubleBox.average());
        System.out.println("sum: " + doubleBox.sum());
        System.out.println("max: " + doubleBox.max());
    }

    private static void exampleFloat() {
        System.out.println("\n---------------------------------\nFloat");
        NumBox<Float> floatBox = new NumBox<>(12, Float.class);
        floatBox.add(24F);
        floatBox.add(40F);
        floatBox.add(265F);
        floatBox.add(16F);
        floatBox.add(52F);
        floatBox.add(505F);
        floatBox.add(50F);
        floatBox.add(58F);
        floatBox.add(5F);
        floatBox.add(15F);
        floatBox.printArr();
        System.out.println("\nget[5]: " + floatBox.get(5));
        System.out.println("length: " + floatBox.length());
        System.out.println("average: " + floatBox.average());
        System.out.println("sum: " + floatBox.sum());
        System.out.println("max: " + floatBox.max());
    }

    private static void exampleLong() {
        System.out.println("\n---------------------------------\nLong");
        NumBox<Long> longBox = new NumBox<>(7, Long.class);
        longBox.add(24L);
        longBox.add(40L);
        longBox.add(265L);
        longBox.add(16L);
        longBox.add(10L);
        longBox.add(5L);
        longBox.printArr();
        System.out.println("\nget[3]: " + longBox.get(3));
        System.out.println("length: " + longBox.length());
        System.out.println("average: " + longBox.average());
        System.out.println("sum: " + longBox.sum());
        System.out.println("max: " + longBox.max());
    }

    private static void exampleInt() {
        System.out.println("--------------------------------\nInteger");
        NumBox<Integer> intBox = new NumBox<>(6, Integer.class);
        intBox.add(2);
        intBox.add(4);
        intBox.add(6);
        intBox.add(8);
        intBox.printArr();
        System.out.println("\narr[2]: " + intBox.get(2));
        System.out.println("length: " + intBox.length());
        System.out.println("average: " + intBox.average());
        System.out.println("sum: " + intBox.sum());
        System.out.println("max: " + intBox.max());
    }
}
