class A{
    void a(){
        System.out.println("A class");
    }
}//parent class 
/*
   
   note : we cannot call child class methods in parent class

   i.e: 
     in void a(){
        System.out.println("A class");

        b(); calling B class methods is not possible
    }
 */

class B extends A{
    void b(){
        System.out.println("B class");
        a();// calling parent class method a();
    }
}//parent class to C but child class to A

class C extends B{
    void c(){
        System.out.println("C class");
        b();//calling parent class method B class
        a();//calling parent of parent class i.e A class methods
    }
}//Child class to B

class MultipleInheritance{
    public static void main(String []args)throws Exception{
       C c = new C();
        c.c();//calling own method
    }
}