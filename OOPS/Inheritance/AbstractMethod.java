 /**
 * 
 * when a method is  redefined or multiple implementation in inheritance is called methodOveriding
 * 
 * methodOveriding:
 * ===============
 * common method name with same signatures(parameters and return type) but multiple implementations used in inheritance is called methodOveriding
 */


/**
 *       Abstract class and abstract methods
 * 
 *       Abstract class wont have a objects
 *       
 * 
 *      abstract method can be declared but not implemented
 *           
 */


abstract class A{
    //we cannot create objects for abstract classes
    abstract public void display();//if we declared any method as abstract then class must be declared as abstract
    //abstact class cannot be istanciated
      
}

class B extends A{
    //if we declare any abstract method we have to implement it on its child class
    public void display(){
         System.out.println("B class Show method");
     }
}


class AbstractMethods{
    public static void main(String []args){
        A obj;//referencing parent object
        obj = new B();//assigning child class object
        obj.display();
    }
}

