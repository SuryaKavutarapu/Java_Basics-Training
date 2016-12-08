interface MainInterface{
    public abstract void methodOne();
    public abstract void methodTwo();

    /**
     * in this interface we have declared two abstract methods
     */
}//interface


abstract class A implements MainInterface{
   /**
    *   # class A implements MainInterface interface but ghere we are not providing implementation for all the methods in the interface 

       # But according to interfaces Structure we have to implement all the functionalities in its child class so we are extending this class A by declaring A class as abstract so we can implement that remaining non implememted interface methods in furthur child classes
    */
   public void methodOne(){
       System.out.println("interface methodOne implemented");
   }
}/*class A*/


//implementing remaining interface methods in class B which extends A
class B extends A{
    public void methodTwo(){
       System.out.println("interface methodTwo implemented");
   }
}/*class B */

class InterfaceClassInheritance{
    public static void main(String []args){

        //Taking Interface as Reference
        MainInterface MI = new B();//creating object for b class
        System.out.println(MI);
        MI.methodOne();//calling method two from class a
        MI.methodTwo();//calling method two from class b
        
    }/*method main programm execution starts from here*/
}/*class InterfaceInheritance */