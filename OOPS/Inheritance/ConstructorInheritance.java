class A{
    public A(){
        System.out.println("A class Constructor");
    }//default constructor
    //argumented constructor
     public A(int x){
        System.out.println("A class Constructor with value of" +x);
    }
}

class B extends A{
     public B(){
        System.out.println("B class Constructor");
    }//default constructor

     public B(int x){//argumented constructor
        super(10000);
        System.out.println("B class Constructor with value of" +x);
    }
}


class C extends B{
     public C(){
        super(1000);
        //calling parent class argument constructor 
        System.out.println("C class Constructor");
    }//default constructor

    public C(int x){//argumented constructor
        this();
        System.out.println("C class Constructor with value of" +x);
    }
}


class ConstructorInheritance{
    public static void main(String []args){
        C c;
        
         //c = new C();
        //calling C class Empty parameter

        /**
          output for Empty constructor calling

                A class Constructor
                B class Constructor
                C class Constructor
         */
        //c = new C(100);
        //calling C class arugumented type constructor
        /**
          output for argumented constructor calling of c class

                A class Constructor
                B class Constructor
                C class Constructor with value of 100

           Note:
             here we are just calling C class Argumented parmeter only c will be executed
         */
         

         c = new C(100);

         /**
          * But we want to call the parameter constructor using c class and it will have to call all the parameterised constructor of its parent class we have to use 

              "SUPER"  keyword 

              and pass the value  to it

              Ex: 
                super(100);
          */

    }
}