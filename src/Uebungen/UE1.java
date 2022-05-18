package Uebungen;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.File;

public class UE1 {


    public static void printInfo(File f) {

            System.out.println(f.exists());
            System.out.println(f.getName());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.getPath());
        System.out.println(f.isDirectory());
        //nije zavrsen



    }
}

