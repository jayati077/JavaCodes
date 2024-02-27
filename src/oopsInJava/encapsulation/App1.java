package oopsInJava.encapsulation;

public class App1 {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(4, 4, "TATA", "Petrol");
        car1.color();
        car1.musicplayer();
        Vehicle vehicle = new Car() {
        };
    }
}
