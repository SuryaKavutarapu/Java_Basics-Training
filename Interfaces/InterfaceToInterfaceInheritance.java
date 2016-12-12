interface Interface1{
  public abstract void methodOne();
}//Interface1 contains one method 


interface Interface2 extends Interface1{
    public abstract void methodTwo();
}//Interface2 has 1 method and it extends Interface1 interface


class A{
   public A(){
       System.out.println("A class Constructor");
   }
  

   public void display(){
     System.out.println("this is an A class Method");
    }/*method display*/
   

   //parent class to B class
}/*class A*/

/**
 *   We can implememt one or more interfaces to a class as such
 * 
 *   Ex :
 * 
 *     class B extends A implements Interface1,Interface2{
 * 
 *    
 *     }
 * 
 *   ## Note :
 *     java doesn't support multiple inheritance in case of classes but 
 *     multiple inheritance can be implemented in case of interfaces 
 *
 */

//implementing  interface2  methods and Interface1 methods  in class B which extends A because Interface2 extends Interface1
class B extends A implements Interface2{
    public void methodOne(){
       System.out.println("interface methodOne implemented");
   }

   public void methodTwo(){
       System.out.println("interface methodTwo implemented");
   }
 
}/*class B */

class InterfaceToInterfaceInheritance{
    public static void main(String []args){

        //Taking Interface1 as Reference
        Interface2 I2 = new B();//creating object for b class
        System.out.println(I2);
        I2.methodOne();//calling method two from class a
        I2.methodTwo();//calling method two from class b 
        // I2.display();
        // A a = new B();
        // a.display();
    }/*method main programm execution starts from here*/
}/*class InterfaceToInterfaceInheritance */