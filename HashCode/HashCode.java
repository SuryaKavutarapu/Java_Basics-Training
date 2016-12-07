class A{
  int id;
  String name;

  public A(int id,String name){
      this.id = id;
      this.name = name;
  }
}/*class A*/

class B{
  int id;
  String name;

  public B(int id,String name){
      this.id = id;
      this.name = name;
  }
  
  /**
   * 
   *   Our Requirement :
   * 
   *      we have to print the id and name 
   *      with object 
   *       ex:   System.out.println(b); b is class reference varible
   *       But actually it returns hash code
   *
   *       To make that possible we have to override the toString method available in object class
   *   
   *   object class contains toString method so im overriding that method in this class
   *   Also we know that Strings and Arrays are objects
   * 
   *   So we override toString class with String as Data type
   *  
   */
   //toString method is  availble in object class so when ever we create an object it will checks the toString method and returns that value
   public String toString(){
       return "Your Id: "+id+"\nYour Name :"+name;
       //this returns string as we know String is of Object
   }
    
}/*class B*/


class HashCode{
 public static void main(String []args){
   
   A a = new A(100,"Surya");
   System.out.println(a);//it will return hash code of that value

   //Required Way
  System.out.println("=======================");
   B b = new B(200,"Surya");
   System.out.println(b);//it will return  id and name values because we overided toString method in B class

 }/*method main programm execution starts from here*/
}/*class HashCode*/