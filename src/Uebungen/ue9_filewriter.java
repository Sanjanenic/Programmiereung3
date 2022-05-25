package Uebungen;

import java.io.FileWriter;
import java.io.IOException;

public class ue9_filewriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("test25_05.txt");

        fileWriter.write("Test\n");
        fileWriter.write("zeile 2");

        fileWriter.flush();
        fileWriter.close();
    }

}
