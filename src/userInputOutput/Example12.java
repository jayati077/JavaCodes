package userInputOutput;
import java.util.Scanner;

public class Example12 {
    public static void main(String[]args){

        String source = "99 ninenine 1010 tenten oneone 11";
        Scanner input= new Scanner(source);
        while (input.hasNext()){
            if(input.hasNextInt()){
                input.next();
        }
            else {

                System.out.println(input.next());

            }

            }
    }
}
