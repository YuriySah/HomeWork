package Lesson_2;

import java.util.Scanner;

//Дополнительное задание
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = value.nextInt();
        boolean isLeapYear;
        isLeapYear = checkIsLeapYear(year);
        System.out.println(isLeapYear);
    }

    private static boolean checkIsLeapYear(int year) {
        if (year % 100 == 0 && year % 400 == 0 )
            return true;
        else if (year % 4 == 0 && year % 100 > 0)
            return true;
        else if (year % 100 == 0)
            return false;
        else
            return false;
    }
}
