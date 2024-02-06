package userInputOutput;
import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        String src="99 ninenine 1010 tenten oneone 11";
        Scanner input = new Scanner(src);
        while(input.hasNext()){
            if(input.hasNextInt()){
                System.out.println(input.nextInt());


            }
            else {
                input.next();
            }
        }
    }
}
