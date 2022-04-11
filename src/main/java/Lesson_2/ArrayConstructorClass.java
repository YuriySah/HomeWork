package Lesson_2;

import java.util.Scanner;

// Задание № 9
public class ArrayConstructorClass {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        int len = value.nextInt();
        System.out.println("Введите значение");
        int initialValue = value.nextInt();
        arrayConstructor(len, initialValue);
    }

    private static int[] arrayConstructor(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}
