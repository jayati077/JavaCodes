package oopsInJava.encapsulation.abstractClass.entity;

public class Hyndai extends Carr {
    private String colour;
    public Hyndai(String colour){
        super();
        this.colour=colour;


    }
    @Override
    public void startengine(){
        System.out.println("Engine is started");
    }
    public void selfDrive(){
        System.out.println("Drive safely:");
    }
}