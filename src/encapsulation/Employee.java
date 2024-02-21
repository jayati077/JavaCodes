package encapsulation;

public class Employee {
    private  String employee_Id;
     private String block;
     private String city;
     private String phone_No;
     private String emp_Id;


     public Employee(String employee_Id,String block,String city,String phone_No,String emp_Id){
         this.employee_Id="JA20373144";
         this.block="PDC2";
         this.city="Pune";
         this.phone_No="7620512709";
         this.emp_Id="jayat.dayaramani.1@wipro.com";}

         public void setEmployee_Id(String employee_id) {
             this.employee_Id = employee_id;
         }
          public String getEmployee_Id() {
                 return employee_Id;
             }

    public String getBlock() {

         return block;
    }

    public void setBlock(String block) {

         this.block = block;
    }

    public String getCity() {

         return city;
    }

    public void setCity(String city) {

         this.city = city;
    }

    public String getPhone_No() {

         return phone_No;
    }

    public void setPhone_No(String phone_No) {

         this.phone_No = phone_No;
    }

    public String getEmp_Id() {

         return emp_Id;
    }

    public void setEmp_Id(String emp_Id) {
        this.emp_Id = emp_Id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_Id='" + employee_Id + '\'' +
                ", block='" + block + '\'' +
                ", city='" + city + '\'' +
                ", phone_No='" + phone_No + '\'' +
                ", emp_Id='" + emp_Id + '\'' +
                '}';
    }
}


