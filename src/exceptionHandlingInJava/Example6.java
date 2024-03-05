package exceptionHandlingInJava;

public class Example6 {
     static void foo(){
         System.out.println("Error statement");
         System.out.println(10/0);
     }
     static void foo1(){
         System.out.println("Calling foo");
         foo();
     }
     static void foo2(){
         try {foo1();

         }catch (Exception e){
             System.out.println(e.getMessage());
             e.printStackTrace();

         }
         System.out.println("Calling foo1");
         foo1();
     }
     static void foo3(){
         System.out.println("Calling foo2");
     }

    public static void main(String[] args) {
        System.out.println("Calling foo3()");
        foo3();
    }
}
