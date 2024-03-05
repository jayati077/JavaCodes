package errorHandlingInJava;

public class Example3 {
    public static void main(String[] args) {
        int A[]={6,88,8,5,4};
        try {


            try{
                int c=A[1]/A[2];
                System.out.println("Division is"  + c);

            }catch (ArithmeticException e){
                System.out.println("Division by zero is not possible");

            }
            System.out.println(A[80]);


        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" oops!!Index out of bound.....");

        }
    }
}
