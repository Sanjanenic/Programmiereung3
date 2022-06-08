package Uebungen;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class uE14Print {
    public static void main(String[] args) throws FileNotFoundException {

        String data =" das ist einer Text";
        PrintStream output =new PrintStream("test.dat");
        output.print(data);
        output.println(data);
        output.flush();
        output.close();
    }

}
