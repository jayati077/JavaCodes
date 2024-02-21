package loopsInJava;

import java.util.Scanner;

//count number of digits given by user
public class Example11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= scanner.nextInt();

        int count=0;
        for (int i=num;i!=0;i/=10){
            count++;
        }
        System.out.println(count);
    }
}
