package oopsInJava.encapsulation;

import java.util.Objects;

public class SmartPhone extends Phone{
    private String Ip;
    private  String bodyColor;
    private int RAM;
    private String network_type;
    private final String IMEI;

    public SmartPhone(){
        super();
        this.IMEI="3456hIk99";
    }
    public SmartPhone(String IMEI,String Ip,String network_type,String bodyColor,int RAM){

        this.IMEI=IMEI;
        this.Ip=Ip;
        this.network_type=network_type;
        this.bodyColor=bodyColor;
        this.RAM=RAM;
    }
    @Override
    public void makecall(){
        System.out.println("hey , are u there");
    }
    public void makevideocall(){
        System.out.println("Am i visible");
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String ip) {
        Ip = ip;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getNetwork_type() {
        return network_type;
    }

    public void setNetwork_type(String network_type) {
        this.network_type = network_type;
    }



    @Override
    public String getIMEI() {
        return IMEI;

    }
    @Override
    public String toString() {
        return "SmartPhone{" +
                "Ip='" + Ip + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", RAM=" + RAM +
                ", network_type='" + network_type + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return RAM == that.RAM && Objects.equals(Ip, that.Ip) && Objects.equals(bodyColor, that.bodyColor) && Objects.equals(network_type, that.network_type) && Objects.equals(IMEI, that.IMEI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Ip, bodyColor, RAM, network_type, IMEI);
    }
}
