package Lesson_7;

import java.io.*;

public class CSVReaderClass {

    private static String[] header = {"Value1", ";", "Value2", ";", "Value3", "\n"};
    private static int[][] data = new int[][]{{101, 202, 303}, {111, 222, 333}, {121, 112, 221}};

    public static void main(String[] args) throws IOException {
        File file = new File("test.csv");
        AppData appData = new AppData(file);

        try {
            appData.saveCSVFile(header, data);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        appData.readCSVFile(file);
    }
}
