package Lesson_2;

// Задание № 6
public class ArrayFillingClass {
    public static void main(String[] args) {
        int[] array = new int[100];
        arrayFilling(array);
    }

    private static void arrayFilling(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
