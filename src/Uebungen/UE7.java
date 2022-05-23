package Uebungen;

import java.io.*;

public class UE7 {


    public static void main(String[] args) throws IOException {

       // File file = new File("test.txt"); ovako ne moze mi pronaci tekst fajl, imam gresku ne radi

        File file = new File ("C:\\Users\\s51639\\Downloads\\Programmiereung3\\src\\Uebungen\\test.txt");
        FileReader fileReader= new FileReader((file));
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
        }
//        int c;
//        while((c = bufferedReader.read()) !=null){
//            char charakter=(char)c;
//            System.out.println(charakter);
//        }
        bufferedReader.close();

    }
}
