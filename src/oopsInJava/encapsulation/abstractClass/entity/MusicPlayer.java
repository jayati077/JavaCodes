package oopsInJava.encapsulation.abstractClass.entity;

public interface MusicPlayer {

     String play();
    public  String next();
    public abstract void pause();
    public String previous();

    public default void musicplayerBrand(){
        System.out.println("Sony");
    }







}
