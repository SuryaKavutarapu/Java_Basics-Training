class University{
    String ucode,uname,ulocation;
    //initializing three variables

    //common setting method for all three variabes it returns 
    public void setUniversity(String ucode,String uname,String ulocation){
        this.ucode = ucode;
        this.uname = uname;
        this.ulocation = ulocation;
        //asigns each value to its corresponding variable
    }
   
   public String getucode(){
       return ucode;
       //returns ucode variable of type string
   }

   public String getuname(){
       return uname;
       //returns uname variable of type string
   }

   public String getulocation(){
       return ulocation;
       //returns ulocation variable of type string
   }
}

class College{
    String Cname,Clocation;
   String Ccode;
    //initializing three variables

    University university;
    // creating University refence variable

    //creating Constructor
   College(){
        university =  new University();
        //allocating memory in constructor because class instance variables cannot be created with assignment of value
        //so we just initializing the University reference variable  in class and alloating memory in Constructor 
    }

   //common setting method for all three variabes it returns 
    public void setCollege(String Cname,String Clocation,String Ccode){
        this.Cname = Cname;
        this.Clocation = Clocation;
        this.Ccode = Ccode;
         //asigns each value to its corresponding variable
    }
 

   public String getCname(){
       return Cname;
   }

   public String getClocation(){
       return Clocation;
   }

   public String getCcode(){
       return Ccode;
   }
}
class Student{
    String Sname,Sid;
   String Sbranch;
    //initializing three variables

    College college;
    // creating University refence variable

    //creating Constructor
    Student(){
        college =  new College();
        //allocating memory in constructor because class instance variables cannot be created with assignment of value
        //so we just initializing the University reference variable  in class and alloating memory in Constructor 
    } 

    //common setting method for all three variabes it returns 
    public void setStudent(String Sid,String Sname,String Sbranch){
        this.Sid = Sid;
        this.Sname = Sname;
        this.Sbranch = Sbranch;
         //asigns each value to its corresponding variable
    }
 

   public String getSname(){
       return Sname;
   }

   public String getSid(){
       return Sid;
   }

   public String getSbranch(){
       return Sbranch;
   }
}

class StudentComposition{
    public static void main(String []args){
     
       Student EC = new Student();
       EC.setStudent("12H71AO2A8","Surya Kavutarapu","EEE");
       EC.college.setCollege("MIC College of Technology","Kanchikacherala","H7");
       EC.college.university.setUniversity("Jntuk","JNTU","kakinada");
       System.out.println("\n================Student Details=====================");

        System.out.println("Student name: "+EC.getSname()+"\nStudent ID: "+EC.getSid()+"\nStudent salary: "+EC.getSbranch());
        /*
          EC is reference  variable created to the class Student and We accessing those variables and methods of that Studente class 
        

          University is reference  variable created to the class University and We accessing those variables and methods of that University  class  but here we created that object in the College class

          So we are calling that adress reference variable via EC variable created in main class

          So EC.college..University will call all values in the University Class 
          
        
        */
        System.out.println("================Student Details=====================");
        System.out.println("Student Cname: "+EC.college.getCname()+"\nStudent Clocation: "+EC.college.getClocation()+"\nStudent Ccode: "+EC.college.getCcode());
        System.out.println("===================University Details===============");
        System.out.println("Student uname: "+EC.college.university.getuname()+"\nStudent ucode: "+EC.college.university.getucode()+"\nStudent ulocation: "+EC.college.university.getulocation());

    //    System.out.println(EC.getId);
    System.out.println("====================================================");
       
    }
}