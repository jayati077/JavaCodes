package userInputOutput;
import java.lang.*;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a,b,sum;

        System.out.println("Enter the value of a:");
        a=input.nextInt();

        System.out.println("Enter the value of b");
        b=input.nextInt();
        sum=a+b;

        System.out.println("The sum of a+b:"+sum);




    }
}
