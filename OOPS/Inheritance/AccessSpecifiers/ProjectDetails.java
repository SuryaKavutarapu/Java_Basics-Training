class Company{
  protected String Cname;
  protected String Ctype;
  protected String Clocation;
  
  public void readCompanyDetails(String Cname,String Ctype, String Clocation){
     this.Cname = Cname;
     this.Ctype = Ctype;
     this.Clocation =Clocation;
  }
}

class Employee extends Company{
  protected String Ename;
  protected String Eid;
  protected String Edesegnation;
  
  public void readEmployeeDetails(String Ename,String Eid, String Edesegnation){
     this.Eid = Eid;
     this.Ename = Ename;
     this.Edesegnation =Edesegnation;
     readCompanyDetails("Orchesys","Service Based","Banglore");
  } 
}


class Project extends Employee{
   private String Pname;
   private String PId;
   private String Pduration;
   {
       Pname = "Railway";
       PId ="P-1617";
       Pduration="3months";
       readprojectDetails();
   }
   private void readprojectDetails(){
        readEmployeeDetails("SuryaKavutarapu","ORITS-332","Java Developer");        
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
       p.display();
    }
}

