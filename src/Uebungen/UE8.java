package Uebungen;

import java.io.*;
import java.util.Scanner;

public class UE8 {
    public static void main(String[] args) throws IOException {

//spreman je da ucita Input
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        //
      BufferedReader bufferedReader= new BufferedReader(inputStreamReader);
//liniju po liniju ucitati
      String line;
 while ((line= bufferedReader.readLine()) !=null){
     System.out.println(line);
     if(line.equals("STOP")){
         break;
     }
 }
bufferedReader.close();
        System.out.println("Closed");
    }
}
