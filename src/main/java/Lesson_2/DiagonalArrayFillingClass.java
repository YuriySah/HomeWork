package Lesson_2;

// Задание № 8
public class DiagonalArrayFillingClass {
    public static void main(String[] args) {
        int[][] array = new int[7][7];
        diagonalArrayFilling(array);
    }

    private static void diagonalArrayFilling(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else if (j + i == array.length - 1) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
