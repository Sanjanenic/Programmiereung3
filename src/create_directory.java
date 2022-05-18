import java.io.File;
import java.util.Scanner;

public class create_directory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Directory Name, witch should by created");
        String path= scanner.next();
        System.out.println("New Directory : " + path);


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

