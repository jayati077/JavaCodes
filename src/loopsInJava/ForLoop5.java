package loopsInJava;
import java.util.*;
//linear search example
public class ForLoop5 {
    public static  int linearSearch(int A[],int key){
        int i;
        for(i=0;i<A.length;i++)
        {
            if(A[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {

     int  A[]={1,0,12,99,-122,7,93,-88};
     int Array=linearSearch(A,77);
        System.out.println(Array);

    }

}
