package Uebungen;

import java.io.File;

public class Uebung1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\s51645\\Desktop\\uebung1.txt");
        readFileInformation(new File(file.getAbsolutePath()));
        // or
        // Uebung1 s = new Uebung1();
        // s.readFileInformation(file);
    }

    public static void readFileInformation (File file){
        System.out.println("Does this file exist? " + file.exists());  //Does this file exist? false
        System.out.println("Name of the File? " + file.getName());    //Name of the File? uebung1.txt
        System.out.println("Parent Directory of the File " + file.getParent()); // Parent Directory of the File C:\Users\s51645\Desktop
        System.out.println("Path to this File " + file.getAbsolutePath()); //Parent Directory of the File C:\Users\s51645\Desktop
        System.out.println("Is this a directory? " + file.isDirectory());  //Is this a directory? false
        System.out.println("Is this a file? " + file.isFile());            //Is this a file? false
        System.out.println("Is this file readable? " + file.canRead());  // Is this file readable? false
        System.out.println("Is this File writeable " + file.canWrite());  //Is this File writeable false
        System.out.println("File Size " + + file.length());  //File Size 0
    }

}
