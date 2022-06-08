//package Uebungen.UE11;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class ProductManager {
//    private ArrayList<Product> list1 = new ArrayList<>();
//
//
//    public void add(Product p) {
//        list1.add(p);
//    }
//
//    public void saveTOFile(String path) throws IOException {
//
//        File file= new File(path);
//        FileWriter fileWriter = new FileWriter(file);
//        BufferedWriter bufferedWriter = new BufferedWriter(FileWriter);
//         for(Product p :list1){
//             bufferedWriter.write(p.toString());
//             bufferedWriter.newLine();
//
//         }
//         bufferedWriter.flush();
//         bufferedWriter.close();
//        System.out.println("Product info seved");
//
//    }
//    public void readFromFile(String path) throws FileNotFoundException {
//        FileReader fileReader = new FileReader(path);
//        BufferedReader bufferedReader = new BufferedReader(FileReader);
//
//        String line;
//        while (!(line= bufferedReader.readLine())!=null){
//            System.out.println(line);
//
//        }
//        System.out.println( "Info reead");
// //metoda nije gotova
//    }
//}