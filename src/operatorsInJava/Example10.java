package operatorsInJava;
import java.lang.*;
public class Example10 {
    public static void main(String[] args) {
        int a=70,b=33,c=29;
        double s= a+b+c/2;
        double S= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println(S);
    }
}
