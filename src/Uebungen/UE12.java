package Uebungen;

import java.io.*;

public class UE12 {
    public static void main(String[] args) throws IOException {
        File file = new File("test25_05.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);


        int byteRead;
        while((byteRead=bufferedInputStream.read()) !=-1);
        System.out.println((char)byteRead);

        bufferedInputStream.close();
    }
}
