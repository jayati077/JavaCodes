package lambaFunction;


import java.io.Console;

@FunctionalInterface
interface Console{
    int run();
}
class ConsoleRunner implements Console{

     public String gameData;

    public ConsoleRunner(String data) {
    }

    void setGameData(String Data){
        this.gameData=gameData;
    }

    @Override
    public int run() {
        System.out.println(this.gameData+"is running");
        return 1;
    }

}

class NintendoCD {
    String data;

    public int run() {
        System.out.println("Running Nintendo game directly:");
        return 1;
    }
}


public class Example5 {


    public static void main(String[] args) {
        NintendoCD game= new NintendoCD();
        Console c = new ConsoleRunner(game.data);
        c.run();
        ConsoleRunner v= new ConsoleRunner(game.data);



    }


}