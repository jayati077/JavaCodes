package reflectionInJava;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

public class Example1 {
    public static void main(String[] args) throws Exception{
        int[] arr;
        Class<?> intArrayClass = Class.forName("[I");
        Class<?> floatArrayClass = Class.forName("[F");

        System.out.println(intArrayClass.getCanonicalName());
        System.out.println(floatArrayClass.getCanonicalName());

        // Accessing the methods
        Method[] m =  floatArrayClass.getMethods();
        for(Method x: m){
            System.out.println(x);
        }


    }
}
