package Lesson_6;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super();
    }

    public void displayMessage() {
        System.out.println("ERROR: Размер массива не правильный!");
    }
}
