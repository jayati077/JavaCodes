package loopsInJava;

public class Example8 {
    public static void main(String[] args) {
        int number=5;
        int factorial =1;
        for (int i=1;i<=number;i++){
            factorial= i*factorial;
            System.out.println(factorial);
        }
    }
}
