abstract class AnnonomusOuter{
   protected int a = 10;
   
   abstract public int getA();

}/*class AnnonomusOuter*/


class AnonymousInnerClasses{
  public static void main(String []args){

      //with out using extends if we want to implement the abstarct class we have to implement the code as shown below
      //insted of extends keyword we use {}; after the object creation  and we just implement our code on it 

      //2nd type of implementation for abstract class using object based approach

      AnnonomusOuter AO = new AnnonomusOuter(){
          {
              System.out.println("In Constructor");
          }

          public int getA(){
             return a;
          }/*method getA  implementation from abstract class*/
      };

      {
          System.out.println(AO.getA());
      }
  }/*method main programm execution starts from here*/
}/*class AnonymousInnerClasses */