package Uebungen;

import java.io.IOException;
import java.io.StringReader;

public class UE7String_Reader {
    public static void main(String[] args) throws IOException {

        String text= "Hallo, das ist ein Text";
        StringReader stringReader = new StringReader(text);
        int c;
        while((c = stringReader.read()) !=-1){
            System.out.print((char)c);
        }
    }
}

