/**
 * nested classes
 * ===============
 * 
 *  nested classes are of two types
 *    1.Inner classes
 *    2.Static inner classes
 * 
 * 
 *   Again InnerClasses are of Three types
 *      i.class with in the class
 *      ii.member inner class
 *      iii.anonymous inner class
 *     
 */


//Example for class with in the class
class Outer{
   private int  a;
   //all the variables in the outer class can be accesble in the inner class Even thought they declared as STATIC OR FINAL
   //private inner class only called with in the Outer class
   private class Inner{
      public void getA(){
          a = 10;
         System.out.println("Value of a is :  "+a);
      }
   }/*class Inner*/
   

   public void getDisplay(){
       System.out.println("Inner method called");
       Inner  i = new Inner();
       i.getA();
   }
}/*class Outer*/


class IntroToNestedClass{
   public static void main(String []args){
       Outer o = new Outer();
       System.out.println("outer method called\n===================================");
       
       o.getDisplay();

   }/*method main  programm execution starts from here*/
}/*class IntroToNestedClass*/