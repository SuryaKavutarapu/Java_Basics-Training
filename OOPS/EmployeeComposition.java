class Address{
    String state,city,country;
    //initializing three variables

    //common setting method for all three variabes it returns 
    public void setAddress(String state,String city,String country){
        this.state = state;
        this.city = city;
        this.country = country;
        //asigns each value to its corresponding variable
    }
   
   public String getState(){
       return state;
       //returns state variable of type string
   }

   public String getCity(){
       return city;
       //returns city variable of type string
   }

   public String getCountry(){
       return country;
       //returns country variable of type string
   }
}//address class

class Employee{
    String Eid,Ename;
    float Esalary;
    //initializing three variables

    Address address;
    // creating Address refence variable

    //creating Constructor
    Employee(){
        address =  new Address();
        //allocating memory in constructor because class instance variables cannot be created with assignment of value
        //so we just initializing the address reference variable  in class and alloating memory in Constructor 
    }


   

    //common setting method for all three variabes it returns 
    public void setEmployee(String Eid,String Ename,float Esalary){
        this.Eid = Eid;
        this.Ename = Ename;
        this.Esalary = Esalary;
         //asigns each value to its corresponding variable
    }
 

   public String getEname(){
       return Ename;
   }

   public String getEid(){
       return Eid;
   }

   public float getEsalary(){
       return Esalary;
   }
}//Employee class

class EmployeeComposition{
    public static void main(String []args){
       //object creation for Employee class
       Employee EC = new Employee();

       EC.setEmployee("ORITS-332","Surya Kavutarapu",20000.00f);
       EC.address.setAddress("Andhra Pradesh","Vijayawada","India");
       System.out.println("===============================");

        System.out.println("Employee name: "+EC.getEname()+"\nEmployee ID: "+EC.getEid()+"\nEmployee salary: "+EC.getEsalary());
        /*
          EC is reference  variable created to the class Employee and We accessing those variables and methods of that Employeee class 
        

          address is reference  variable created to the class Address and We accessing those variables and methods of that Address  class  but here we created that object in the Employee class

          So we are calling that adress reference variable via EC variable created in main class

          So EC.address will call all values in the Address Class 
          
        
        */
        System.out.println("Employee city: "+EC.address.getCity()+"\nEmployee State: "+EC.address.getState()+"\nEmployee Country: "+EC.address.getCountry());

    //    System.out.println(EC.getId);
       System.out.println("===============================");
       
    }
}//main class