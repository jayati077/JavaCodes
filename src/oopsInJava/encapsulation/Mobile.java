package oopsInJava.encapsulation;

import oopsInJava.encapsulation.abstractClass.entity.Camera;
import oopsInJava.encapsulation.abstractClass.entity.Carr;
import oopsInJava.encapsulation.abstractClass.entity.MusicPlayer;

public class Mobile implements MusicPlayer, Camera {
    @Override
    public String play()
    {
        return "Chand balliyan...";
    }
    @Override
    public String next(){
        return "Rao Sahab...";
    }
    @Override
    public String previous(){
        return "kacha badam..";
    }
    @Override
    public void pause(){
        return;
    }
    @Override
    public void clickPicture(){
        System.out.println("say cheese");
    }
    @Override
    public void recordVideo(){
        System.out.println("Video started..");
    }

}
