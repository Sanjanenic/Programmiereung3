package Uebungen;

import java.io.IOException;
import java.io.StringWriter;

public class ue9_stringwriter {
    public static void main(String[] args) throws IOException {
        String data = "Das ist ein neue Datei";
        StringWriter stringWriter= new StringWriter();

        stringWriter.write(data + "\n");
        stringWriter.write("Hi");

        stringWriter.flush();
        stringWriter.close();

        System.out.println(stringWriter);

    }
}
