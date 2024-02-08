package stringInJava.regex;
import java.lang.*;
public class Example1 {
    public static void main(String[] args) {
            String str1="a";
            boolean result = str1.matches(".");
            System.out.println(result);

            result = str1.matches("[pqr]");
            System.out.println(result);

            result = str1.matches("[pqr][da]");
            System.out.println(result);

            result = str1.matches("[^pqr]");
            System.out.println(result);

            result=str1.matches("[a-z]");
            System.out.println("The symbol is between a-z"+result);


            result = str1.matches("[a-z0-9]");
            System.out.println("The symbol is between a-z or 0-9"+result);

            result=str1.matches("A-Z0-9");
            System.out.println("The symbol is between A-Z or 0-9");


            str1="R8";
            result=str1.matches("[A-Z][0-9]");//validfor 260 patterns
            System.out.println("The symbol is between A-Z and second symbol is between 0-9");

            str1="c";
            result=str1.matches("[a/b]");
            System.out.println(result);

            str1="abc";
            result=str1.matches("abc");//checks for exact match
            System.out.println(result);

        }

    }

