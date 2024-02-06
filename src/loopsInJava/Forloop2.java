package loopsInJava;
import java.lang.reflect.Array;
import java.util.*;
public class Forloop2 {
    public static void main(String[] args) {
        int i, j = 0;
        int A[][] = {{1, 10, 100}, {2, 20, 200}, {3, 30, 0}
        };
        int B[][] = {{1, 11, 0}, {2, 22, 0}, {3, 33, 30}};
        int C[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++)
                System.out.printf("C[%d][%d]=%d\n", i, j, C[i][j]);
        }
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                System.out.printf("C[%d][%d]=%d\n", i, j, C[i][j] = A[i][j] + B[i][j]);

            }

        }
    }
}