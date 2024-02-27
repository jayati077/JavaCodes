package oopsInJava.encapsulation;

import java.util.Objects;

public class Car extends Vehicle{
    private int noOfSeats;
    private int noOfDoors;
    private String brand;
    private String fuel;


    public Car(){
        super();
        System.out.println("Enter any brand");
    }
    public Car(int noOfDoors,int noOfSeats,String brand,String fuel){
        this.noOfDoors=noOfDoors;
        this.noOfSeats=noOfSeats;
        this.brand=brand;
        this.fuel=fuel;
    }
    @Override
    public void color(){
        System.out.println("Can be customised accordingly:");
    }
    public void musicplayer(){

    }

    public int getNoOfSeats() {

        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return noOfSeats == car.noOfSeats && noOfDoors == car.noOfDoors && Objects.equals(brand, car.brand) && Objects.equals(fuel, car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noOfSeats, noOfDoors, brand, fuel);
    }
}
