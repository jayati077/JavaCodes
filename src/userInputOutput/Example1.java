package userInputOutput;
import java.util.Scanner;
import java.lang.*;


public class Example1 {
    public static void main(String[] args){
         int x ;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of x :");

        x = input.nextInt();
        float f = input.nextFloat();
        System.out.println("The value of x = " + x);
        String name = input.next();
        name = input.nextLine();
        double c = input.nextDouble();
        Object object = input.nextInt();


    }
}
