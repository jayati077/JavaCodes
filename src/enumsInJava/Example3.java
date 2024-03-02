package enumsInJava;
enum  Gender{
    MALE,
    FEMALE,
    TRANSGENDER,
    AGENDER;
}















public class Example3 {
    public static void main(String[] args) {
        for (Gender g:Gender.values()) {
            System.out.println(g);
        }
    }
}
