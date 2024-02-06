package operatorsInJava;
import java.lang.*;


public class Example {

    static int count=0;
    static int logBaseRecursive(int targetValue){
        if(targetValue==1)
            return  count;
        else {
            count++;
            return logBaseRecursive(targetValue/10);
        }
    }
   static int logBase(int  targetValue){
       int count=0;
        while(targetValue!=1){
            targetValue=targetValue/10;
            count++;

        }
        return count;
    }
    public static void main(String[] args) {
       int y = logBase(100);
        System.out.println(y);
        int x=logBaseRecursive(100);
        System.out.println(x);

    }
}
