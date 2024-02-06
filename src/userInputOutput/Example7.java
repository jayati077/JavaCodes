package userInputOutput;
import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useRadix(8);
        System.out.println("Enter the binary number");
        int decimalnumber=input.nextInt();
        System.out.println(decimalnumber);
        input.useRadix(2);
        int number= input.nextInt();
        System.out.println(number);
        input.useRadix(16);
        int decimalNumber1= input.nextInt();
        System.out.println(decimalNumber1);

    }
}
