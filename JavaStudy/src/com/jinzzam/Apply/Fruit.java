package com.jinzzam.Apply;

import java.util.Arrays;
import java.util.Comparator;

public class Fruit {
    public String name;
    public int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
        public int compare(Fruit fruit1, Fruit fruit2) {
            return fruit1.name.compareTo(fruit2.name);
        }
    };

    public static Comparator<Fruit> quantComparator = new Comparator<Fruit>() {
        public int compare(Fruit fruit1, Fruit fruit2) {
            return fruit1.quantity - fruit2.quantity;
        }
    };

    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[5];
        fruits[0] = new Fruit("Pineapple", 70);
        fruits[1] = new Fruit("Apple", 90);
        fruits[2] = new Fruit("Orange", 40);
        fruits[3] = new Fruit("Banana", 100);
        fruits[4] = new Fruit("Strawberry", 20);

        Arrays.sort(fruits, nameComparator);
        for (Fruit f : fruits) {
            System.out.println(f.name + ", " + f.quantity);
        }
        System.out.println("");
        Arrays.sort(fruits, quantComparator);
        for (Fruit f : fruits) {
            System.out.println(f.name + ", " + f.quantity);
        }
    }
}