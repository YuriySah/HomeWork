package Lesson_5;

import java.util.ArrayList;
import java.util.Scanner;


public class Box<T> {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество яблок:");
        int appleCount = scanner.nextInt();
        System.out.println("Введите количество апельсин:");
        int orangeCount = scanner.nextInt();

        class FruitBox<T> {
            float currentWeight = 0;
            ArrayList<T> arrayList = new ArrayList<>();

            public void addFruit(T fruit) {
                arrayList.add(fruit);
                if (fruit.equals(apple)) {
                    new Apple().addAppleBox();
                } else new Orange().addOrangeBox();
            }

            public float getWeight(T fruit) {
                if (fruit.equals(apple)) {
                    return new Apple().getAppleWeightBox();
                } else return new Orange().getOrangeWeightBox();
            }

            public boolean compare() {
                if ((new Apple().getAppleWeightBox()) == (new Orange().getOrangeWeightBox())) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Orange> orangeFruitBox = new FruitBox<>();

        for (int i = 0; i < appleCount; i++) {
            appleFruitBox.addFruit(apple);
        }
        for (int i = 0; i < orangeCount; i++) {
            orangeFruitBox.addFruit(orange);
        }

        System.out.println(appleFruitBox.getWeight(apple));
        System.out.println(orangeFruitBox.getWeight(orange));
        System.out.println(orangeFruitBox.compare());

    }

}
