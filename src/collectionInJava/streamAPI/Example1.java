package collectionInJava.streamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {


        Collection<String> collection = new LinkedHashSet<>(List.of("apple", "orange", "grapes", "strawberry"));
        Collection<String> filteredList = collection.stream().filter(s -> s.matches("^[aeiou].*")).toList();
        System.out.println(filteredList);
        Collection<Integer>collection1=new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
        Collection<Integer> filteredList1=collection1.stream().filter(num->num%2==0).toList();
        System.out.println("Even List: " +filteredList1);
    }
}
