package reflectionInJava;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Car implements Vehicle {

    public String brand_name;


    public Car() {
        brand_name = "Swift";
    }

    public Car(String brand_name) {
        this.brand_name = brand_name;

    }


        @Override
        public void startEngine() {
            System.out.println("Engine has started");
        }

        @Override
        public void stopEngine() {
            System.out.println("Engine has stopped");
        }
    }

    class App {
        public static void main(String[] args) throws Exception {
            Class<?> MyClazz = Class.forName("reflectionInJava.Car");
            Method[] m = MyClazz.getMethods();
            for (Method c : m) {
                System.out.println(c);
            }

            Constructor<?>[] c = MyClazz.getConstructors();

            for (Constructor C : c
            ) {
                System.out.println(C);
            }
            Field[] fields = MyClazz.getFields();
            for (Field v: fields
                 ) {
                System.out.println(v);
            }

          Class<?>[] Interface =   MyClazz.getInterfaces();
            for (Class v:Interface
                 ) {
                System.out.println(v);

            }
        }

    }