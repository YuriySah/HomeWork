package Lesson_2;

import java.util.Scanner;

// Задание № 2
public class CheckIsPositiveNumber {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Введите отрицательное или положительно число:");
        int number = value.nextInt();
        checkIsPositive(number);
    }

    private static void checkIsPositive(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else System.out.println("Число отрицательное");
    }
}
