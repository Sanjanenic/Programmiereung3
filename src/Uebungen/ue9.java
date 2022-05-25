package Uebungen;  //ovo ne radi

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ue9 {


    public static void main(String[] args) throws IOException {

         File file=new File("25-05.txt");
        FileWriter fileWriter=new FileWriter(file,true);
//        PrintWriter = new PrintWriter(fileWriter);
//        String java = "Java";
//        printWriter.println("Zeile 1");
//        printWriter.println("Zeile 2");
//        printWriter.println("Zeile 3");
//        printWriter.print("OhneLN");
//        printWriter.println("Zeile 4");
//        printWriter.format("This is a %s with %d MB", java,100);
//
//        printWriter.flush();
//        printWriter.close();
        System.out.println(" Schreiben ist fertig");
    }
}
