package Uebungen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class ue9_outputstreamwriter {
    public static void main(String[] args) throws IOException {
        String data = " ä ö EXAMPLE - examole";
        FileOutputStream fileOutputStream = new FileOutputStream( "test111.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);

        outputStreamWriter.write(data);
        outputStreamWriter.flush();
        outputStreamWriter.close();
    }
}
