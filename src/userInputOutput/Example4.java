package userInputOutput;
import java.util.Scanner;
public class Example4 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int x,y,sub;
        System.out.println("Enter value of x:");
        x=input.nextInt();
        System.out.println("Enter value of y:");
        y=input.nextInt();
        sub=x-y;
        System.out.println("The subtraction of x-y:"+sub);
    }
}
