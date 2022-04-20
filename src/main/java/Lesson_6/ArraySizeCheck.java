package Lesson_6;

public class ArraySizeCheck {

    public static String[][] generalArray = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "2", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};
    public static String[][] invalidSizeArray = new String[][]{{"1", "1", "1", "1"}, {"1", "1", "1", "1"}, {"1", "2", "2", "2"}};
    public static String[][] invalidDataArray = new String[][]{{"1", "1", "1", "1"}, {"2", "2", "WWW", "2"}, {"3", "3", "3", "3"}, {"4", "4", "4", "4"}};

    public static void main(String[] args) {

        arrayValidation(generalArray);
        arrayValidation(invalidSizeArray); // Для демонстрации работы MyArraySizeException
        arrayValidation(invalidDataArray);// Для демонстрации работы MyArrayDataException

    }

    private static void arrayValidation(String[][] array) {

        try {
            arrayCheck(array);
            try {
                transformationArray(array);
            } catch (MyArrayDataException exception) {
                System.out.println(exception.getMessage());
            }
        } catch (MyArraySizeException e) {
            e.displayMessage();
        } finally {
            displayArray(array);
        }
    }


    private static void arrayCheck(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException();
        }
    }

    private static void transformationArray(String[][] array) throws MyArrayDataException {
        int[][] intArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    intArray[i][j] = Integer.valueOf(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
    }

    private static void displayArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
