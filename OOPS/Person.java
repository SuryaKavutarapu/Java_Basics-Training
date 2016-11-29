class Employee{
    String Ename,Eid;
    float Esalary;
    public static void main(String []args){
        Employee E = new Employee();
        E.Ename = args[0];
        E.Eid = args[1];
        E.Esalary = Float.parseFloat(args[2]);
        System.out.println("Employee name"+E.Ename+"\nEmployee ID"+E.Eid+"\nEmployee Salary"+E.Esalary);
    }
}