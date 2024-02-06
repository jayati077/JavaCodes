import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Student sc = new Student();
        System.out.println("Details of Student are:");
        details(3,67,"PREET");
        College cc = new College();
        System.out.println("College details of Student is:");
        collegeDetails(2023,100000,"First Year","YCCE");
    }
    public static  void details(int x,int y,String b){
        System.out.println("Name:"+b );
        System.out.println("Roll No:"+x);
        System.out.println("Marks:"+y);
    }
    public static void collegeDetails( int a,int b,String c,String d){
        System.out.println("Admission Year:"+a);
        System.out.println("Fees:"+b);
        System.out.println("Studying in year:"+c);
        System.out.println("College Name:"+d);

    }
}
