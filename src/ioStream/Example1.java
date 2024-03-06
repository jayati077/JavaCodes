package ioStream;

import java.io.FileInputStream;

public class Example1 {
    public static void main(String args[]){

        try {
            FileInputStream fis = new FileInputStream("C:/Users/Jayati/IdeaProjects/JavaClass/src/ioStream/data/file_input.abc");
            int x = fis.read();
            System.out.println((char)x);

            while ((x = fis.read()) != -1){
                System.out.print((char) x);
            }

        }catch (Exception e){
            System.out.println("Ahhh File Does Not Exsit");
        }
        }
}
