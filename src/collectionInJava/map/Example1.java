package collectionInJava.map;

import java.util.HashMap;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Map<String,Integer>numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("two",2);
        numbers.put("three",3);
        System.out.println(numbers);
    }
}
