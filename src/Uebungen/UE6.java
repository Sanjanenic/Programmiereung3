package Uebungen;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class UE6 {
    public static void main(String[] args) throws IOException {

//metoda kojom pravim fajlove u folderu
        File dir = new File("C:\\Users\\s51639\\Desktop\\UE6");
      //  createFiles(dir);
   //rename_files(dir);
  delete_files(dir);
    }

    public static void createFiles(File dirfile) throws IOException {


        for (int i = 0; i < 10; i++) {
            File file = new File(dirfile.getAbsolutePath() + "//" +

                    ThreadLocalRandom.current().nextInt() + ".mp3");
            if (file.createNewFile()) {
                System.out.println("CREATE: " + dirfile.getAbsolutePath());

            } else {
                System.out.println("File already exsist. ");
            }
        }
    }
    //metoda za promjenu imena fajlova
     public static void rename_files(File dirfile){
                if(dirfile.isDirectory()){
                    for(File oldFile : dirfile.listFiles()){
                        File newFile = new File(oldFile.getParent()+ "\\1_"+ oldFile.getName());
                        if(oldFile.renameTo(newFile)){
                            System.out.println("RENAME: " +oldFile.getAbsolutePath()+ "to "+newFile.getAbsolutePath());
                        }
                        else{
                            System.out.println("Sorry, the File can not be renamed");
                        }
                    }
                }

         }
    public static void delete_files(File dirfile)  {
        if(dirfile.isDirectory()){
            for(File file : dirfile.listFiles()){
                file.delete();
                System.out.println("DELETED: " + file.getAbsolutePath());
            }
        }


        }

    }

