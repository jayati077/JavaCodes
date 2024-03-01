package oopsInJava.encapsulation.abstractClass.entity;

import oopsInJava.encapsulation.Mobile;

public class App2 {
    public static void main(String[] args) {
        Hyndai hyndai = new Hyndai("white");
        System.out.println(hyndai);
        Carr carr1 = new Carr() {
            @Override
            public void startengine() {

            }
        };
        Carr carr = (Carr) hyndai;
        carr.onAc();
        carr.startengine();

        System.out.println(carr);

        Mobile mobile = new Mobile();
        MusicPlayer musicPlayer = (MusicPlayer) mobile;
          musicPlayer.play();
          musicPlayer.pause();
          musicPlayer.next();
        System.out.println(musicPlayer);

          Camera cc = (Camera) mobile;
          cc.clickPicture();
          cc.recordVideo();
        System.out.println(cc);

          Iphone iphone=new Iphone();
          Mobile mobile1=(Mobile) iphone;
          mobile1.clickPicture();
          mobile1.recordVideo();
          mobile1.previous();
          mobile1.pause();
          mobile1.next();
          mobile.play();
        System.out.println(mobile1);

    }
}
