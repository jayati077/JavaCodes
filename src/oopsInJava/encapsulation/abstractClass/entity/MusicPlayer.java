package oopsInJava.encapsulation.abstractClass.entity;

public interface MusicPlayer {

     default String play(){
         return "Playing Real Slim Shady";
     }
    public  String next();
    public abstract void pause();
    public String previous();

    default public void sayHello(){
        System.out.println("Hello Spotify");
    }

    public default void musicplayerBrand(){
        System.out.println("Sony");

    }







}
