package Uebungen;

import java.io.File;
import java.util.Dictionary;
import java.util.Hashtable;

public class UE2 {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\s51639\\Desktop\\Tagesablauf");
        listf(dir.getAbsolutePath());


    }

    public static void listf(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        for (File f : list) {
            if (f.isDirectory()) {
                System.out.println("Dir" + f.getAbsolutePath());
            } else {
                System.out.println("File" + f.getAbsolutePath());
            }

        }
    }
}





