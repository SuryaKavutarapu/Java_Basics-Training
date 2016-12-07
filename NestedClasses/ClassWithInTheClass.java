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
   
}/*class Outer*/


class IntroToNestedClass{
   public static void main(String []args){
    /**
     * in the previous IntroToNestedClass programe we created object to inner class with in the getDisplay method to call nested inner class method getA();
     * 
     *  but here in this peogramme we are approaching in a different way 
     * 
     *  by creteing the outer class object 
     * 
     *  we are creating the inner class object as shown below 
     */
       
       Outer o = new Outer();
       Outer.Inner i = o.new Inner();
       i.getA(); 
   }/*method main  programm execution starts from here*/
}/*class IntroToNestedClass*/