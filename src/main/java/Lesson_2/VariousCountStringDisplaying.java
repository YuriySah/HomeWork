package Lesson_2;

import java.util.Scanner;

// Задание № 4
public class VariousCountStringDisplaying {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        String string = enterString(value);
        int count = enterCount(value);
        stringDisplaying(string, count);
    }

    private static void stringDisplaying(String string, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }

    private static int enterCount(Scanner value) {
        System.out.println("Введите количество:");
        int c = value.nextInt();
        return c;
    }

    private static String enterString(Scanner value) {
        System.out.println("Введите строку:");
        String str = value.nextLine();
        return str;
    }
}
