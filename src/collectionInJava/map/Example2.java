package collectionInJava.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example2 {
    public static void main(String[] args) {
        Map<String,Integer>numbers=new HashMap<>();
        numbers.put("Jayati",7);
        numbers.put("Preet",9);
        numbers.put("Himanshu",4);
        numbers.put("Vivek",6);
        System.out.println("first map "+ numbers);
        Map<String,Integer>numbers1=new HashMap<>();
        numbers1.put("Kiran",1);
        System.out.println("second map " + numbers1);
        numbers.putAll(numbers1);
        System.out.println("combining first and second map:"+ numbers);
        numbers.putIfAbsent("J",18);
        System.out.println(numbers);
        Integer x=numbers.get("Jayati");
        System.out.println(x);
        boolean result= numbers.containsKey("Jayati");
        System.out.println(result);
        result=numbers.containsValue(7);
        System.out.println(result);
        numbers.replace("Jayati",007);
        System.out.println(numbers);
        numbers.replace("Jayati",7,07);
        Set<String> keySet = numbers.keySet();
        System.out.println("Keys present in HashMap : " + keySet);

        Collection<Integer> values = numbers.values();
        System.out.println("Values present in hashMap : "+values);

        Set<Map.Entry<String,Integer>> keyvalue =  numbers.entrySet();
        System.out.println(keyvalue);

    }
}
