package exceptionHandlingInJava;
//using try and catch block for error handling
public class Example2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int c=a/b;

     try{
         c=a/b;
         System.out.println(c);

     }catch (Exception e){
         System.out.println("Denominator cannot be zero");
         System.out.println(e.getMessage());
     }finally {
         c=a/b;
         System.out.println(c);
     }

    }
    }

