package oopsInJava.encapsulation;

public class App {
    public static void main(String[] args) {




        SmartPhone p9 = new SmartPhone("A034444JK", "14566dd", "5G", "greyblack", 8);
        System.out.println(p9);
        p9.makevideocall();
        p9.makecall();



        Phone phone1 = new SmartPhone("34gfddqq9","13456","4G","blue",4);
        System.out.println(phone1);
        phone1.sendSMS();
        phone1.makeCall();


        Phone p = new Phone() {
            @Override
            public void makecall() {

            }
        };





    }
}
