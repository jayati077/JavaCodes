package loopsInJava;
import java.util.*;
public class ForLoop {
    public static void main(String[] args) {
        int i=0,j=0;
        int A[][]={{1,10,100},{2,20,200},{3,30,300}
        };
        for (i=0;i<3;i++){

            for (j=0;j<3;j++)

                System.out.printf("A[%d][%d]=%d\n",i,j,A[i][j]);
            System.out.printf("Matrix\n",A);
        }


    }
}
