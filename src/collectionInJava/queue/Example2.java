package collectionInJava.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Example2 {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>(List.of(1, 2, 3));
        LinkedList<Integer> l2 = new LinkedList<Integer>(List.of(100, 200, 300));
        LinkedList<Integer> l3 = new LinkedList<Integer>(List.of(10, 20, 30));
        LinkedList<Integer> l4 = new LinkedList<>(List.of(-10, -20, -30));

        Queue<LinkedList<Integer>> q = new ArrayDeque<>();
        q.add(l1);
        q.add(l2);
        q.add(l3);
        q.add(l4);

        System.out.println(q.element());

        for (LinkedList<Integer> a: q) {

            System.out.println(a);
        }
    }
}
