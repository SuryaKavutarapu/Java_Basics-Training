interface EmployeeInterface{
    public abstract void input();
    public abstract void display();
}

class Student implements EmployeeInterface{
    public  int Sid;
    public  String Sname,Sbranch;
    
    public void setStudent(int Sid,String Sname,String Sbranch){
        this.Sid = Sid;
        this.Sname = Sname;
        this.Sbranch = Sbranch;
    }
    public void input(){
        setStudent(322,"SuryaKavutarapu","EEE");
    }

    public void display(){
        System.out.println("Student Id: "+Sid+"\nStudent Name: "+Sname+"\nStudent branch: "+Sbranch);
    }
}

class Employee implements EmployeeInterface {
    public  int Employeeid;
    public  String Employeename,Employeebranch,EmployeeCompany;
    
    public void setEmployee(int Employeeid,String Employeename,String Employeebranch,String EmployeeCompany){
        this.Employeeid = Employeeid;
        this.Employeename = Employeename;
        this.Employeebranch = Employeebranch;
        this.EmployeeCompany = EmployeeCompany;
    }
    public void input(){
        setEmployee(322,"SuryaKavutarapu","Banglore","Orchesys IT");
    }

    public void display(){
        System.out.println("Employee Id: "+Employeeid+"\nEmployee Name: "+Employeename+"\nEmployee Company"+EmployeeCompany+"\nEmployee branch: "+Employeebranch);
    }
}



class EmployeeInterfaceExample{
  public static void main(String []args){
      EmployeeInterface student =  new Student();
      student.input();
      student.display();
      EmployeeInterface employee =  new Employee();
      employee.input();
      employee.display();
  }/*method main programm execution starts from here*/
}/*class EmployeeInterfaceExample*/