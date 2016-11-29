class Address{
    String state,city,country;
    
    public void setAddress(String state,String city,String country){
        this.state = state;
        this.city = city;
        this.country = country;
    }
   
   public String getState(){
       return state;
   }

   public String getCity(){
       return city;
   }

   public String getCountry(){
       return country;
   }
}

class Employee{
    String Eid,Ename;
    float Esalary;
    Address address;
    Employee(){
        address =  new Address();
    }

    public void setEmployee(String Eid,String Ename,float Esalary){
        this.Eid = Eid;
        this.Ename = Ename;
        this.Esalary = Esalary;
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
}

class EmployeeComposition{
    public static void main(String []args){
     
       Employee EC = new Employee();
       EC.setEmployee("SuryaKavutarapu","ORITS-332",20000.00f);
       EC.address.setAddress("Andhra Paradesh","Vijayawada","India");
       System.out.println("===============================");

        System.out.println("Employee name: "+EC.getEname()+"\nEmployee ID: "+EC.getEid()+"\nEmployee salary: "+EC.getEsalary());

        System.out.println("Employee city: "+EC.address.getCity()+"\nEmployee State: "+EC.address.getState()+"\nEmployee Country: "+EC.address.getCountry());

    //    System.out.println(EC.getId);
       System.out.println("===============================");
       
    }
}