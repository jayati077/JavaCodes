package stringInJava.regex;

public class Example2 {
    public static void main(String[] args) {
        String phone ="$";
        boolean result;
        result = phone.matches("\\w");//alphabet or number//returns false for special characters

        phone="1";
        result = phone.matches("\\d");//check single symbol as digit

        result = phone.matches("\\D");//returns true, if given symbol is not a number
        System.out.println(result);
    }
}
