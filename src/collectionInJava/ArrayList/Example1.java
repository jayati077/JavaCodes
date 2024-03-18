package collectionInJava.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Integer>arr1= new ArrayList<>();
        ArrayList<Integer>arr2=new ArrayList<>(List.of(78,89,67,56,34,44,90));
        ArrayList<Integer>arr3=new ArrayList<>(20);
        System.out.println("Array1: "+arr1);
        System.out.println("Array2: "+arr2);
        System.out.println("Array3: "+arr3);
        arr1.add(8);
        arr1.add(8,50);
        System.out.println(arr1);


        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1.equals(o2)){
                    return 0;
                }else if(o1<o2){
                    return 1;
                }else {
                    return -1;
                }
            }
        };

        arr3.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Array :" + arr3);
        arr3.sort(c);
        System.out.println("Array Sorted in Reverse :" + arr3);


        // sorts the collection object in reverse order
        Collections.sort(arr3);
        System.out.println("Natural Sorting order : "+arr3);


    }

}

