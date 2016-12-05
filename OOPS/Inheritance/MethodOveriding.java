/**
 * 
 * when a method is  redefined or multiple implementation in inheritance is called methodOveriding
 * 
 * methodOveriding:
 * ===============
 * common method name with same signatures(parameters and return type) but multiple implementations used in inheritance is called methodOveriding
 */


/**
 *         polymorphism
 *               one object many forms is called polymorphism
 * 
 *         it is of 2types
 *             1.compile time polymorphism,early binding,static binding ==> method overloading
 *             2.runtime polymorphism,late binding/dynamic linkage  ==> method overriding
  *           
 */


class A{
    int x;
    //  {
    //      show();
    //  }
    void display(){
       show();//calling show method because its private class it's scope is up to its class only'
       System.out.println("value of x  "+x);
    }
     private void show(){
         x=10;//assigning value to x
         System.out.println("A class Show method");
     }
}

class B extends A{
    //  {
    //      show();
    //  }
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


class methodOveriding{
    public static void main(String []args){
        A obj;//creating parent class reference varaible

        obj = new A();//assigning child class object to reference variable
        obj.display();
        System.out.println("========================");
        obj = new B();//assigning child class object to reference variable
        obj.display();
   
    }
}


/**
 * 
 * At runtime we are linking / dispatching  ie(seperating methods) with one referenece varaible
 * is called dynamic method dispatch
 */