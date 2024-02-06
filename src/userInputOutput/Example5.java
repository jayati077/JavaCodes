package userInputOutput;
import java.util.Scanner;


public class Example5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float p,q,mul;
        System.out.println("Enter the value of p:");
        p=input.nextFloat();
        System.out.println("Enter the value of q:");
        q=input.nextFloat();
        mul=p*q;
        System.out.println("Answer is :"+mul);
    }
}
