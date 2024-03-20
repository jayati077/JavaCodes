package collectionInJava.queue;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class Example1 {
    public static void main(String[] args) {
        Queue<Character> queue =new ArrayDeque<Character>(List.of('J','A','Y'));
        queue.add('T');
        queue.add('I');
        queue.add('N');
        queue.add('A');

        System.out.println(queue);

        Character c =queue.remove();
        System.out.println(c);
        c=queue.peek();
        System.out.println(c);

    }
}
