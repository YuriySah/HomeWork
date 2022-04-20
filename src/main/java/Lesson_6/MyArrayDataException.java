package Lesson_6;

public class MyArrayDataException extends Exception {

    private int i, j;

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String getMessage() {
        String errorMessage = "ERROR: Неправильный формат данных масива по индексу [" + i + "]" + " [" + j + "]";
        return errorMessage;
    }
}
