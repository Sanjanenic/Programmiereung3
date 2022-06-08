package Uebungen;

import java.io.*;

public class UE16 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String s ="Hallo Welt";
        byte[]b={'e','x','a', 'm', 'p','l','e'};
        File file=new File("object.dat");

        //Schreiben Objec in Datei
        FileOutputStream fileOutputStream=new FileOutputStream(file);

        ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
//Write somthing in the File
        objectOutputStream.writeObject(s);
        objectOutputStream.writeObject(b);
        objectOutputStream.flush();
        objectOutputStream.close();

        //create an ObjectImputSream for the File we created before
FileInputStream fileInputStream = new FileInputStream(file);
ObjectInputStream objectInputStream= new ObjectInputStream( fileInputStream);


        System.out.println(" "+(String)objectInputStream.readObject());
        System.out.println(" "+(String)objectInputStream.readObject());
        byte[]text2=(byte[]) objectInputStream.readObject();
        String s2= new String(text2);
        System.out.println("BYTE []: " +s2);
//
    }
}
//https://www.javatpoint.com/java-objectinputstream link sa objasnjenjima