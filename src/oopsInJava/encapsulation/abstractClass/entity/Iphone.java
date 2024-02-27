package oopsInJava.encapsulation.abstractClass.entity;

import oopsInJava.encapsulation.Mobile;

public class Iphone extends Mobile {
    @Override
    public void clickPicture(){
        System.out.println("Clicking better quality:");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording done");
    }
}
