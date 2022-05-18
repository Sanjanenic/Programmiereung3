import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
public class new_file {
    public static void main(String[] args) throws IOException {

        String fileSeparator = System.getProperty("file.separator");
        File file = new File ("C:\\Users\\s51639\\Desktop\\testt.txt");
        File file2 = new File ("C" + File.separator + "Users" + File.separator + "51639" + File.separator+ "Destop"+ File.separator+"testt.txt");

if (file2.createNewFile()){
    System.out.println("new file");
    System.out.println(file.getName());
    System.out.println(file.getAbsolutePath());
    System.out.println(file.getAbsoluteFile());

}
else {
    System.out.println("alredy exsists");
}

//            // \\ diese wird als separatoren angezeigt
//            File file = new File("C:\\Users\\s51639\\Desktop\\test.txt");
//
//            System.out.println(file.getName());
//            System.out.println(file.getAbsolutePath());
//            System.out.println(file.getAbsoluteFile());


    }
}