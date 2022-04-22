package Lesson_7;

import java.io.*;

public class AppData {
    private String[] header;
    private int[][] data;
    private File file;

    public AppData(File file) {
        this.file = file;
    }

    public void saveCSVFile(String[] header, int[][] data) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);

        for (int i = 0; i < 6; i++) {
            writer.write(header[i]);
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                writer.write(String.valueOf(data[i][j]));
                if (j != data.length - 1) {
                    writer.write(";");
                } else {
                    writer.write("\n");
                }

            }
        }
        writer.close();
    }

    public void readCSVFile(File file) throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String str = reader.readLine();
            while (str != null) {
                System.out.println(str);
                str = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
