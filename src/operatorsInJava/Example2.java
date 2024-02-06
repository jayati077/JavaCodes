package operatorsInJava;

public class Example2 {
    //Arithmetic operator
    public static void main(String[] args) {
        int a=9,b=10,c=8;
        int sum;
        sum=(a+b-c+(2*b)-3+(5%180));
        System.out.println(sum);
    }
}
//In arithmetic operation precedence is from left to right!