abstract class AnnonomusOuterClass{
   protected int a = 10;
   
   abstract public int getA();

}/*class AnnonomusOuter*/


class WithOutReferencevariables{
  public static void main(String []args){

      //with out using extends if we want to implement the abstarct class we have to implement the code as shown below
      //insted of extends keyword we use {}; after the object creation  and we just implement our code on it 

     //apparoching and calling inner methods we just creating a new object and extends it and calling it

     new AnnonomusOuter(){
          {
              System.out.println("In Constructor");
          }

          public int getA(){
             return a;
          }/*method getA  implementation from abstract class*/

          public void show(){
             System.out.println(getA());
          }/*method show*/
      }.show();//calling show method in AnnonomusOuterClass

       /**
        *  instead of calling show method Obj.show(); with refence variable we just calling it directly with object
        */
  }/*method main programm execution starts from here*/
}/*class AnonymousInnerClasses */