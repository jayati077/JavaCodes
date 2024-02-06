package loopsInJava;
import java.util.*;
public class ForLoop4 {
    public static void main(String[] args) {
        int i = 0;int max = 0;
        int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (i = 0; i < A.length; i++) {
            System.out.printf("A[%d]=%d\n", i, A[i]);
            if (A[i]>max) {
                max = A[i];


            }

        }
        System.out.println("Maximum element:" + max);
    }
}
