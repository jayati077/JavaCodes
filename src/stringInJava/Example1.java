package stringInJava;

public class Example1 {
    public static void main(String[] args) {
        String name1 ="Jayati";
        String name = new String("Jayati");
        String name3Intern =name.intern();
        System.out.println(name1==name);
        System.out.println(name1==name3Intern);
    }

}
