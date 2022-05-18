package Uebungen;

import java.io.File;

public class UE5 {
    public static void main(String[] args) {
        File dir= new File("C:\\Users\\s51639\\Desktop\\ubung5\\file1\\file2");
createDirectories(dir);
    }

    private static void createDirectories(File x) {
        boolean created = x.mkdirs();

        if(x.isDirectory()){
            System.out.println("Directory" + x.getAbsolutePath() + "reated?: "+x.mkdirs());

        }
        else{
            System.out.println("Directory" + x.getAbsolutePath() + " created?" + x.mkdirs());
        }
    }
}
