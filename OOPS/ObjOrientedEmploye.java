import java.io.*;
class OEmployee{
    String Ename,Eid;
    float Esalary;
    void employeeDetails(String x,String y,Float z){
        Ename  = x;
        Eid = y;
        Esalary = z;
    }
    void display(){
      System.out.println("Employee name "+Ename+"\nEmployee ID "+Eid+"\nEmployee Salary "+Esalary);
    }
 //with out invoking the class costructor the object will not be created
 //constructor is nothing but creting an method with same name of class.
 //java compiler will takes palce defaulty but if we wanna make change while invoking the method you have to instantiate the method
    public static void main(String []args){
        OEmployee E = new OEmployee();
        E.employeeDetails(args[0],args[1],Float.parseFloat(args[2]));
        E.display();
        E.employeeDetails(args[3],args[4],Float.parseFloat(args[5]));
        E.display();
    }
}   