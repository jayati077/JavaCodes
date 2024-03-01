package lambaFunction;

public class Example2 {

    @FunctionalInterface
    interface  Lambda1{
        public abstract void display();
    }

    interface  Lambda2{
        public abstract void display(Object o);
    }


        public static void main(String[] args) {
            Lambda1 m = () -> {
                System.out.println("Display method");
            };

            Lambda2 m1 = (object)->{System.out.println(object);};

            Lambda2 m2 = System.out::println;


        }
    }

