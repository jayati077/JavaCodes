package oopsInJava.encapsulation.abstractClass.entity;

public abstract class Carr {
    private String colour;
    private String fuel_Type;


    public Carr(String colour,String fuel_Type){
       this.fuel_Type=fuel_Type;
       this.colour=colour;
    }

    public Carr() {

    }

    public abstract void startengine();
    public void onAc(){
        System.out.println("Cooling");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuel_Type() {
        return fuel_Type;
    }

    public void setFuel_Type(String fuel_Type) {
        this.fuel_Type = fuel_Type;
    }

    @Override
    public String toString() {
        return "Carr{" +
                "colour='" + colour + '\'' +
                ", fuel_Type='" + fuel_Type + '\'' +
                '}';
    }
}
