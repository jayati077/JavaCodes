package exceptionHandlingInJava;

public class Example4 {
    public static void main(String[] args) {
        int A[] = {22, 67, 90, 7, 10};
        int c = 0;
        try {
            c = A[2] / A[4];
            System.out.println(A[2] / A[4]);
            System.out.println(A[100 % 3]);


        } catch (ArithmeticException e) {
            System.out.println("Division not possible    " + c);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("oops!!! index out of bound.....");
        }
    }
}
