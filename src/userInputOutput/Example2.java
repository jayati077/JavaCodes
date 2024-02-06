package userInputOutput;
import java.lang.*;
import java.util.Date;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner scanner  = null;
        scanner = new Scanner(System.in);
        System.out.println("Getting Started With the User Input In Java");
        /**
         * int (byte, short, int , long) , float , double, char, String, Object , bool
         */
        System.out.println("Enter the value of int x : ");
        int x = scanner.nextInt();
        System.out.println("Enter the value of byte x1 : ");
        byte x1= scanner.nextByte();
        System.out.println("Enter the value of  short y:");
        short y = scanner.nextShort();
        System.out.println("Enter the value of float y1:");
        float y1= scanner.nextFloat();
        System.out.println("Enter the value of  double d1:");
        double d1= scanner.nextFloat();
        System.out.println("Enter the value of char c:");
        char c = scanner.next().charAt(0);
        System.out.println("Enter the value of String a:");
        String a= scanner.next();
       //56 Object object= scanner.next();

        System.out.printf("the value of x= %d \n",x);
        System.out.printf("the value of x1=%d\n",x1);

        System.out.printf("the value of y=%d\n",y);
        System.out.printf("the value of y1=%f\n",y1);
        System.out.printf("the value of d1=%f\n",d1);
        System.out.printf("The value of c=%c\n",c);
        System.out.printf("the value of a=%s\n",a);

        System.out.println(new Date().toString());




    }
}
