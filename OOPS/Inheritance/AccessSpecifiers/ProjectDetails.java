class Company{
  protected String Cname;
  protected String Ctype;
  protected String Clocation;
  //initializing protected strings

  //method readCompanyDetails
  public void readCompanyDetails(String Cname,String Ctype, String Clocation){
     this.Cname = Cname;
     this.Ctype = Ctype;
     this.Clocation =Clocation;
     //assigning values to corresponding variables
  }
}//parent class

class Employee extends Company{
  protected String Ename;
  protected String Eid;
  protected String Edesegnation;
  //initializing protected strings
  public void readEmployeeDetails(String Ename,String Eid, String Edesegnation){
     this.Eid = Eid;
     this.Ename = Ename;
     this.Edesegnation =Edesegnation;
       //assigning values to corresponding variables
     readCompanyDetails("Orchesys","Service Based","Banglore");
     //calling parent class method readCompanyDetails and passing argumets
  } 
}//parent class  to project and child class to Company


class Project extends Employee{
   private String Pname;
   private String PId;
   private String Pduration;
   //initializing protected strings only we can access in that class only
   { 
       //assigning private String values in Instance initialization block because of private keyword
       Pname = "Railway";
       PId ="P-1617";
       Pduration="3months";
       readprojectDetails();
       //calling private method in its own class
   }

   private void readprojectDetails(){
        readEmployeeDetails("SuryaKavutarapu","ORITS-332","Java Developer");  
        //calling parent class method readEmployeeDetails and passing argumets      
   }

   public void display(){
       System.out.println("\n==========Project Details==============");
       System.out.println("\nProject Name: "+Pname+"\nProject ID: "+PId+"\nProject Duration: "+Pduration);
        System.out.println("\n==========Employee Details=============");
       System.out.println("\nEmployee Name: "+Ename+"\nEmployee ID: "+Eid+"\nEmployee Designation: "+Edesegnation);
        System.out.println("\n==========Company Details==============");
       System.out.println("\nCompany Name: "+Cname+"\nCompany Type: "+Ctype+"\nCompany location: "+Clocation);
        System.out.println("\n==========Thank you====================");
   }
}


class ProjectDetails{
    public static void main(String []args){
       Project p = new Project();
       p.display();// calling Display method
    }
}

