package Uebungen;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ue9_buffered_writer {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter=new FileWriter("test25_05.txt",true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.newLine();
//        bufferedWriter("Zeile 1");
//        bufferedWriter("Zeile 2");
        bufferedWriter.flush();

        bufferedWriter.close();




    }
}
