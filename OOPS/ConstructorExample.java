class ConstructorExample{
    int a;
    float x;
    //constructors dont have any return type you have to declare as public if else it takes public as default.constructors Should not be declared as static 
    // constructors can be overlaoded but cannot be overrided
    // constructors cannot be inherited
    // we can call the class instance methods through constructors
    
    // Note:- "this" keyword is available in non static member function of the class and also in Constructor

    //constructor creation
     public ConstructorExample(){
        //constructor for same class
        a=100;//initializing instance variables
        display();//calling instance method with no parameter
    }
    
    //constructor overloading
    public ConstructorExample(int a){
        //constructor for same class
        this.a=a;//initializing instance variables
        //this references that particular executing object
        display(a);//calling instance method with int value as parameter
    }

    public ConstructorExample(float x){
        //constructor for same class
        this.x=x;//initializing instance variables
        display(x);//calling instance method with float value as a parameter
    }

    //methods overloading
    void display(float z){
       System.out.println(z); 
    }

    void display(int y){
       System.out.println(y); 
    }
  
    void display(){
       System.out.println(a); 
    }
    

    public static void main(String []args){
        //common approach for creating objects with various referance variables
        ConstructorExample CE =  new ConstructorExample(10);
        ConstructorExample CE1 =  new ConstructorExample(10.00f);
        ConstructorExample CE2 =  new ConstructorExample();
        //another type of approach for creating multiple objects with single variable
        ConstructorExample SCE ;
        SCE   =  new ConstructorExample(10);
        SCE =  new ConstructorExample(10.00f);
        SCE  =  new ConstructorExample();
    }
}