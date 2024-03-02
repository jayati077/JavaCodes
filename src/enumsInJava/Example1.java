package enumsInJava;


enum Color {
    RED{
        @Override
        public void family() {
            System.out.println("I m  RED, from sRGB");
        }
    },
    GREEN{
        @Override
       public void family(){
            System.out.println("I am green");
        }

    },
    BLUE{
        @Override
       public void family(){
            System.out.println("I m BLUE from sRGB");
        }
    };

    String name;
    Color(){
        System.out.println("Representing default constructor");
    }
    Color(String name){
        System.out.println(name);
    }
    public abstract void family();
}







public class Example1 {
    public static void main(String[] args) {
        Color c1=Color.RED;
        System.out.println(c1.name);
        c1.family();

    }
}
