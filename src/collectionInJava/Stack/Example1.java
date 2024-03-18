package collectionInJava.Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.*;

public class Example1 {
    public static void main(String[] args) {
        Collection<Character> c1 =new ArrayList<>();
        Collection<Character> c3= new ArrayList<>(List.of('J','A','Y','A'));
        c1.add('T');
        c1.addAll(List.of('I','N','A'));
        boolean result = c1.remove('E');
        System.out.println("Status of Removal of E : " + result);
        System.out.println(c1);

        // AnB
        // retainAll()
        System.out.println("Collection c1 : "+c1);
        System.out.println("Collection C2 : " +c3);
        c1.retainAll(c3);
        System.out.println("Collection C1 : " + c1);


        Collection<Integer> c5 = new ArrayList<>(List.of(1,2,3,4,5,6,7));
        Collection<Integer> c4 = new ArrayList<>(List.of(5,6,76));
        c3.remove(1);
        c3.removeAll(c4);
        System.out.println(c3);
        result = c3.containsAll(c4); // much more-closer to subset operation
        System.out.println(result);

        Collection<String> c6 = new LinkedList<>(List.of("John","Bruce","Jayati","Vidya"));
        Iterator<?> it =  c5.iterator();

        System.out.println("Travsersing using Iterator:");
        // Itrators
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Traversing using for-each:");
        // For Each
        for (Integer x : c5){
            System.out.println(x);
        }

        System.out.println("Traversing using streams : ");
        // Streams
        c5.stream().forEach(System.out::println);

        Object[] string_array = c5.toArray();
        System.out.println(Arrays.deepToString(string_array));
    }


    }

