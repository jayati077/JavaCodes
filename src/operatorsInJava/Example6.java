package operatorsInJava;
//swapping technique in java without using third variable using bitwise operators

public class Example6 {
    public static void main(String[] args) {
        int a=9,b=12;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a=9...."+a);
        System.out.println("b=12...."+b);
    }
}
