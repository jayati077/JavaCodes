package userInputOutput;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j,k,div;
        System.out.println("Enter the value of j:");
        j=sc.nextInt();
        System.out.println("Enter the value of k:");
        k= sc.nextInt();
        div=j/k;
        System.out.println("The answer is :"+div);
    }
}
