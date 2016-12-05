/**
 * accessing super class variables and methods from child classes
 */ 

class A{
    int x;

    public A(){
        this(100);//calling parmetrized constructor
        System.out.println("method A");
    }//default constructor

    public A(int x){
        this.x = x;
        System.out.println("value of x: "+this.x);
    }//parmetrized constructor

    void show(){
        System.out.println("you have called super class show method from B class");
    }//show function
}

class B extends A{
    int x;

    public B(){
        this(100);//calling parameterized constructor
        System.out.println("method b");
    }//default constructor

    public B(int x){
        this.x = x; 
        //assigning values 
        System.out.println("value of x: "+x);
        super.show();//calling A class show method using super keyword
    }
}

class C extends B{
    int x;
    
    public C(){
        this(10);
        System.out.println("method c");
    }//default constructor

    public C(int x){
        super();//calling super class constructor
        this.x = x;
        System.out.println("value of x: "+x);
        System.out.println("value of super class x: "+super.x);//printing super class X variable
    }
}

class SuperUsage{
  public static void main(String []args){
    //object
     C c = new C();
  }
}