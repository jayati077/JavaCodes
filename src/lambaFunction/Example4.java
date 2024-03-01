package lambaFunction;

public class Example4 {
    @FunctionalInterface
    interface  LambdaExpression{
        int add(int a, int b);
    }



        public static void main(String[] args) {
            LambdaExpression e1 = (a,b)->a+b;
            LambdaExpression e2 = Integer::sum;

        }
    }

