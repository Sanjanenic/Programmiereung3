package Uebungen.UE11;

import java.io.*;

public class BinaryOutputBeispiel {
    public static void main(String[] args) throws IOException {
        File file=new File("uebung14Beispiel");
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        String outputText="Hallo File- first output";
        for( char c : outputText.toCharArray()){
    fileOutputStream.write(c);

            System.out.println(c);
        }
fileOutputStream.flush();
        fileOutputStream.close();
    }
}
