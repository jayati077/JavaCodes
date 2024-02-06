package operatorsInJava;

import java.util.Scanner;
import java.lang.*;
//even odd using bitwise operator
public class Example7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number to check whether the number is even or odd");
        int a=input.nextInt();
        if((a&1)==0){
            System.out.println("Even:"+a);

        }
        else {
            System.out.println("Odd:"+a);
        }
    }
}
