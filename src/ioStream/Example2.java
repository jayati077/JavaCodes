package ioStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Example2 {

    public static void main(String[] args) throws IOException {
        InputStream fis = new FileInputStream("C:/Users/Jayati/IdeaProjects/JavaClass/src/ioStream/data/data.csv");
        int c;
        while ( (c = fis.read()) != -1){
            System.out.print((char)c);
        }
        fis.close();
    }
}
