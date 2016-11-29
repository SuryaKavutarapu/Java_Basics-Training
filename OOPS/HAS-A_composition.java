//Reletion b/w classes

/*
  it has 2 types 

  HAS-A => Compostion => in java it will be called as Aggerigation
  
  IS-A => Inheritance 
  note:- coverd in later sessions 
 
  Compostion in the sence reference of another class 

  HAS-A  has 2 types
   1. Strong composition
   2.Weak composition
    

   Strong Compostion : Some class must present to Execute 

   Ex:
     in .java file has more than one class

  
   Weak Compostion : without Some other classes we can Execute

    Ex:
      in .java file there is no need to another class we can done execution with one class
*/

//composition method(Strong)

// class 1
class A{
 int a;
 //creation of constructor for class A
  A(){
      System.out.println("A class Constructor invoked - meanse called");
      //calling show method in constructor
      show();
  }

 //non static show method
  public void show(){
    a=10;
    System.out.println("this is A class method");
    System.out.println("print 'a' varible value"+a);
  }
}

//class 2
class B{
 int b;
 A objA;//creating reference object

 //creation of constructor for class B
  B(){
      //reference variable to class A
      objA = new A();
      System.out.println("B class Constructor invoked - meanse called");
      //calling show method in constructor
      show();
  }

  // non static show method
  public void show(){
    b=10;
    System.out.println("this is b class method");
    System.out.println("print 'b' varible value"+b);
  }
}

//main class 
class HAS_A_composition {
  public static void main(String []args){
      //creating object for b class
      B  b =  new B();
      //calling show method on class B
      b.show();

      //calling A class show method by using sub referene objects
      b.objA.show();
  }
}