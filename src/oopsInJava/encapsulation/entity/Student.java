package oopsInJava.encapsulation.entity;

public class Student {
    //Data members
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;

    public Student() {
        this.firstName = null;
        this.middleName = null;
        this.lastName = null;
        this.email = null;
        this.phone = null;
    }
    //parameterised Contructors
    public Student(String firstName,String middleName,String lastName,String email,String phone){
           this.firstName=firstName;
           this.lastName=lastName;
           this.middleName=middleName ;
            this.email=email;
             this.phone=phone;


    }


    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getMiddleName() {

        return middleName;
    }

    public void setMiddleName(String middleName) {

        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }




    }

