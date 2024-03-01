package lambaFunction;

interface  SayHello{
    void sayHello();
}
class Person implements SayHello{
    public void talk(){
        System.out.println("The way you do one..The way you everything...");
    }
    @Override
    public void sayHello(){
        System.out.println("I'm a Complain Boy");
    }
}

class GymGuy implements SayHello{
    public void talk(){
        System.out.println("Don't do vegetables Do Stearoids ...");
    }
    @Override
    public void sayHello(){
        System.out.println("I'm a Family Guy");
    }
}

