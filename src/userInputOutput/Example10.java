package userInputOutput;
import java.util.Scanner;
public class Example10 {
    public static void main(String[] args) {
        String source = "01 10 1980 Kiran 07 10 2000 Jayati";
        Scanner input = new Scanner(source);
        while (input.hasNext())
        {
            if (input.hasNextInt()) {
              //  System.out.println(input.next());
                input.next();
            } else {
                System.out.println(input.next());


            }
        }
    }
}
