package Lesson_5;

import java.util.ArrayList;

// Задание №1
public class ChangeValuePlaces {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(54);
        arrayList.add(13);
        //arrayList.add(22);

        changeValue(arrayList);
        System.out.println(arrayList);
    }

    private static void changeValue(ArrayList<Integer> arrayList) {
        int c = 0;
        for (int i = 0; i < arrayList.size()-1; i++) {
            c = arrayList.get(i);
            arrayList.set(i, arrayList.get(i+1));
            arrayList.set(i+1, c);
        }
    }
}
