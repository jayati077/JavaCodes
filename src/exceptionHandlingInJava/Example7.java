package exceptionHandlingInJava;

public class Example7 {
    class MyException extends Exception {
        @Override
        public String getMessage() {
            return "This is my custom error";
        }
    }

    class MinBalanceException extends Exception {
        @Override
        public String getMessage() {
            return "Your Balance should be 50 rs at least";
        }
    }



        public static void main(String[] args) {
            System.out.println();
        }
    }

