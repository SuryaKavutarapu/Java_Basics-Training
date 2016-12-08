interface InterfaceExample{
   public static final int  a = 100;//global constants can be accessed by any class which implememts this interface
   
   public abstract void show();

   /**
    * ## NOTE:  
       interface only contains Abstract and public static final declared variables
    */
}//interface 

class Something implements InterfaceExample{
      public void show(){
            System.out.println("Interface variable a value is : "+a);
      }//overiding Interface methods in child class because interface itself an pure abstract class so every method in the interface is of Abstract
}
class InterfaceClass{
    public static void main(String []args){
       new Something().show();//directly calling method via object

       //#general calling of methods       
       Something  S = new Something();
       S.show();

       //taking interface as refecence because something class implements InterfaceExample interface
       InterfaceExample IE = new Something();
       IE.show();
    }/*method main  programm execution starts from here*/
}


/**
 * ## Note:
 * 
 * 1.If a class implememts some Interface that class should provide functionality for all the methods on that interface
 * 
 * 2.In case we does  not  provide that implementation in child class then that child class should also declared as abstract class
 * 
 * 
 * 
 */