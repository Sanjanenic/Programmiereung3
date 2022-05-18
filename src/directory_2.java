import java.io.File;
import java.util.Scanner;

public class directory_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory Path where new folder schould be created");
        String path= scanner.next();
        System.out.println("Enter Name of the  new Directory");
        String Path= scanner.next();
        System.out.println("new Directory: " + path);


        File file = new File(path);
        boolean created = file.mkdirs();
        if (created){
            System.out.println("Has been created");
        }
        else{
            System.out.println("has not been created");
        }


    }
    }

