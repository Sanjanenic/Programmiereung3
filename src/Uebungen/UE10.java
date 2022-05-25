package Uebungen;

import java.io.*;

public class UE10 {
    public static void main(String[] args) throws IOException {
// Datei wird geöffnet und in PrintWriter gekapselt
        File f = new File("uebungen.txt");
        FileWriter fileWriter = new FileWriter(f);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        System.out.println("Bitte geben Sie ihr Fach sowie Note ein:");
        // User Input kann empfangen werden
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // legt einen BufferedReader über den inputStreamReader.

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line;
        while(!(line= bufferedReader.readLine()).equals("STOP")){
            printWriter.println(line);
            System.out.println(line);

        }

        bufferedReader.close();
      //  printWriter.flush();
        printWriter.close();
    }
}


//OVO moram skontati ne radi , ovo ce biti na ispitu ovakakv primjer