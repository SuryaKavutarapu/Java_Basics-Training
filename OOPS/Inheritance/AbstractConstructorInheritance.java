/**
 * when ever we create instance variables in the base class that instance varibles or methods will be 
 * occupy the child class objects
 */


abstract class A{
    int x;
    
   final int z = 100;//defining constant in java we have to declare class with Final keyword 
   // final variables cannnot be overrided

   public A(){
         System.out.println("A - class Constructor"+getClass());//displays where memory will be allocated  for base class  variables and methods
    }//if abstract class has Constructor objects will not be created but memory allocation will be Done on on the child class objects but not in the super class

    void display(){
       show();//calling show method because its private class it's scope is up to its class only'
       System.out.println("value of x  "+x);
    }
     private void show(){
         x=10;//assigning value to x
         System.out.println("A class Show method");
     }

      public final void input(){
          System.out.println(z);
      }//final method cannot be overrided

    
}//abstract class has no objects
 
class B extends A{
    /**
     * z = 200;
     * 
     * error pops up : we can't override final variables
     */
    public B(){
         System.out.println("B - class Constructor"+getClass());//displays where memory will be allocated in case of abstract class
    }

     
  /*
     public void input(){
     z = 100//
    }
     

     if we do overiding for the final  class method we get error
  */

    void display(){
       show();//calling show method because its private class it's scope is up to its class only'
       System.out.println("value of x from superclass "+super.x);
       //calling and getting super class x varibale
    }
    private void show(){
         super.display();//calling super class method
         System.out.println("B class Show method");
     }
}



final class C{
  // final class cannot be a subclass 
  //i.e: we cannot extend anything to a final class
  /*
     final class C extends A {
       This kind of declaration is not possible
      for final classes

      if we declare any class as final inheritance gonna stop there itself
     }

  */ 
    {
      System.out.println("This is an Final Class");
      // invokes when a class instance is created i.e: object creation
    }//instance instanious block

} 

class AbstractConstructorInheritance{
    public static void main(String []args){
        A obj;//creating parent class reference varaible

        //obj = new A();//assigning child class object to reference variable not possible because it is an abstract class
    
        System.out.println("========================");
        obj = new B();//assigning child class object to reference variable
        obj.display();
        obj.input();
    }
}



/*
   Note:
   =====
   Constructors cannot be delared as STATIC , ABSTRACT , VOLATILE ,FINAL  

*/