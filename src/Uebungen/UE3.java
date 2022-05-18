package Uebungen;

import java.io.File;

public class UE3 {
    public static void main(String[] args) {

        File dir = new File("C:\\Users\\s51639\\Desktop\\Tagesablauf\\Bilder");

        listfilesUndDyretions(dir.getAbsolutePath());

    }

    public static void listfilesUndDyretions(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {

            if (f.isDirectory()) {
                //rekursiv
                System.out.println("Dir" + f.getAbsolutePath());
                listfilesUndDyretions(f.getAbsolutePath());
            }
            else {
                System.out.println("File" + f.getAbsolutePath());
            }

        }
    }
}





