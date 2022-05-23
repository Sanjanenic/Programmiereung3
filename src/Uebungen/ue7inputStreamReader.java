package Uebungen;

import java.io.*;

public class ue7inputStreamReader {
    public static void main(String[] args) throws IOException {
        InputStream stream = new FileInputStream("C:\\Users\\s51639\\Downloads\\Programmiereung3\\src\\Uebungen\\test.txt");
        Reader reader = new InputStreamReader(stream);

        int c;
        while((c=reader.read()) !=-1){
            System.out.print((char)c);
        }

reader.close();

    }
}