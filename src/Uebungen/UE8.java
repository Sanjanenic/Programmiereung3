package Uebungen;

import java.io.*;
import java.util.Scanner;

public class UE8 {
    public static void main(String[] args) throws IOException {


        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader= new BufferedReader(inputStreamReader);

      String line;
 while ((line= bufferedReader.readLine()) !=null){
     System.out.println(line);
     if(line.equals("STOP")){
         break;
     }
 }

    }
}
