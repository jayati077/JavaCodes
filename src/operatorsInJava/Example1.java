package operatorsInJava;

public class Example1 {
    public static void main(String[] args) {
        int x=100;
        double result = (Math.log10(x)+(200*x)+x)/((100*x*x)+(64*x)+25);
        System.out.println("Result= "+result);
    }
}
