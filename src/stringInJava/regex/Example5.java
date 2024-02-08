package stringInJava.regex;

import java.util.Scanner;
enum Organisation{
    GOOGLE,
    YAHOO,
    HOTMAIL,
    OUTLOOK,
    WIPRO,
    UNKNOWN
}

public class Example5 {
    public static void main(String[] args) {
        Organisation org;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the email");
        String res=input.nextLine();
        res= res.trim();




        if(res.matches("\\w*@google.com")){
            org = Organisation.GOOGLE;

        }
        else if (res.matches("\\w*@yahoo.com")){
            org = Organisation.YAHOO;
        }
        else if (res.matches("\\w*@outlook.com")){
            org = Organisation.OUTLOOK;

        }
        else if (res.matches("\\w*@hotmail.com")){
            org = Organisation.HOTMAIL;

        }else if (res.matches("\\w*@wipro.com")){
            org = Organisation.WIPRO;
        }else{
            org = Organisation.UNKNOWN;
        }
        System.out.println("You are an employee of "+org);


        System.out.println("Getting Started With Java");
    }
}
