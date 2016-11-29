class StaticBlock{
   // instance variable;
   int a;
   //instance initializeer block  
   {
     System.out.println("this is an Instance Initializer block");
     // it will be executed or Initialized onle when an class instance is created.
   }


  //static block deleration. it will executed one when the class loads into classloader
  static {
      System.out.println("this is an Static block((1))  executed once and before main method");
  }
  // we can aslo delclare n no of static blocks in a class but all are executrd before main
  static {
      //we can only call Static methods  in Static blocks
      display();
      System.out.println("this is an Static block((2))  executed once and before main method");
  }
  public static void display(){
      System.out.println("this is an static method");
  }
  public static void main(String []args){
      //directly calling static method fromm class reference
      StaticBlock.display();

      //here the initializeer block will be executed  and allocates memory on heap;
      StaticBlock s = new StaticBlock();
  }
  static {
      System.out.println("this is an Static block((3)) executed once and before main method");
  }
}