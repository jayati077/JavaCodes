package userInputOutput;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        String src ="11 11 10 1010 Apple 9090 Samsung";
        Scanner input = new Scanner(src);
        while (input.hasNext()){
            if (input.hasNextInt()) {
                System.out.println(input.nextInt());
                input.hasNext();
            }
            else {
//
                input.next();

            }
//
        }
    }
}
