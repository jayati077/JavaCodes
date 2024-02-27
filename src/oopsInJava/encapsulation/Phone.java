package oopsInJava.encapsulation;

import java.util.Objects;

public abstract class Phone {
    private final String IMEI;
    private  String Ph_no;
    private float balance;




    public Phone(){
        this.IMEI="NIN9679000";
    }
    public Phone( String IMEI,String ph_no, float balance){
        this.IMEI=IMEI;
        this.Ph_no=ph_no;
        this.balance=balance;
    }
     public  void sendSMS(){
         System.out.println("HELLO");

    }
    public void makeCall(){

        System.out.println("You can now make a call");
    }

    public String getIMEI() {

        return IMEI;
    }

    public String getPh_no() {

        return Ph_no;
    }

    public void setPh_no(String ph_no) {

        Ph_no = ph_no;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {

        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Phone{" +
                "IMEI='" + IMEI + '\'' +
                ", Ph_no='" + Ph_no + '\'' +
                ", balance=" + balance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Float.compare(phone.balance, balance) == 0 && Objects.equals(IMEI, phone.IMEI) && Objects.equals(Ph_no, phone.Ph_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IMEI, Ph_no, balance);
    }

    public abstract void makecall();
}
