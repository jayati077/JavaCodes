package userInputOutput;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int x;
        input.useRadix(2);
        System.out.println("Enter any Binary number");
        x=input.nextInt();
        String result;
        result=Integer.toBinaryString(x);
        System.out.println(result);
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toOctalString(x));
         float y ;
         input.useRadix(10);
         System.out.println("Enter any number:");
         y=input.nextFloat();
         System.out.println(Float.toHexString(y));
         char a;
         a=input.next().charAt(0);
        System.out.println("Enter any character:");
        Integer.toBinaryString((int)'a');
        System.out.println(Integer.toBinaryString(a));
         double b;
         input.useRadix(2);
        System.out.println("Enter any binary number:");
        b= input.nextDouble();
        System.out.println(Double.toHexString(b));
        boolean b1;
        input.useRadix(10);
        System.out.println("Enter any number:");
        b1=input.nextBoolean();
        System.out.println(Boolean.valueOf(b1));


    }
}
