package Uebungen;

import java.io.*;

public class UE14 {
    public static void main(String[] args) throws IOException {
        File file=new File("testbinary.txt");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        String outputText ="Das ist ein neuer Test";

        for(char c: outputText.toCharArray()){
            bufferedOutputStream.write(c);
            System.out.println(c);
        }
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }
}
