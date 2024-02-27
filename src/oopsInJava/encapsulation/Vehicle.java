package oopsInJava.encapsulation;

public abstract class Vehicle {

        private String brand;
        private String model;
        private String fuel;
        private int wheels;

        public Vehicle(){
            System.out.println("Horn Ok");
        }

        public Vehicle(String brand, String model, String fuel, int wheels) {
            this.brand = brand;
            this.model = model;
            this.fuel=fuel;
            this.wheels = wheels;
        }

        public void display() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("fuel " + fuel);
            System.out.println("wheels" + wheels);
        }
       public void colour(){
           System.out.println("Available in 3 colors:blue,black,white");
        }
        public void speed(){
            System.out.println("two wheeler-50,four wheeler-100");
        }

    public abstract void color();
}

