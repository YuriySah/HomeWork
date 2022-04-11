package Lesson_2;

import java.util.Scanner;

// Задание № 3
public class CheckIsPositiveNumberReturn {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Введите отрицательное или положительно число:");
        boolean result;
        int number = value.nextInt();
        result = checkIsPositive(number);
        System.out.println(result);
    }

    private static boolean checkIsPositive(int number) {
        if (number >= 0) {
            return false;
        } else {
            return true;
        }
    }
}
