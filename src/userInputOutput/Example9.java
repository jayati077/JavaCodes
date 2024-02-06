package userInputOutput;
import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fname;
        String lname;
        String myinfo;
        Boolean nature;
        System.out.println("Enter your First Name:");
        fname=input.next();

        System.out.println("Enter your last Name:");
        lname=input.next();

        System.out.println("Enter your info");
        myinfo=input.next();
        input.nextLine();

        System.out.println("Is your Nature good:");
        nature=input.nextBoolean();
        System.out.printf("First name=%s:",fname);


    }
}
