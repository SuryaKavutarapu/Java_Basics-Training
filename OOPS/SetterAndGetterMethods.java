class SetterAndGetterMethod{
    // int a,b;
    // instance variable

    static int a,b;
    //static variables
    

    //About static
    //1.declaring static then it's go for complete class
    //2.static variable till end of the programm untill the jvm exits
    //3.if we want to work effiecient memory then go for static deleration
    //if any method is declared as static it can be called with out creating objects ex: SetterAndGetterMethod.getA();


    //setter methods has min one augument and it returns nothing meanse void
    public void setA(int a){
   
       this.a =a;
    }

    public void setB(int b){
        this.b = b;
    }


    //getter methods has no augument and it returns one value or more than one
    public static int getA(){
        return a;
    }

    public int getB(){
        return b;
    }

    public static void main(String []args){
        SetterAndGetterMethod SG = new SetterAndGetterMethod();
        SetterAndGetterMethod SG1 = new SetterAndGetterMethod();
        SetterAndGetterMethod SG2 = new SetterAndGetterMethod();

        SG.setA(10);
        SG.setB(20);
        

        //here im declaring SG object values and calling SG1 values so i am getting values 0,0 as output because  in the heap memory each and every objcet is allocted seperate  memory so we get 0,0

        //but instead  we want to set from one object and get from one object we have to declare those values the varables as "Static"  instead of declaring instance variables in that class

        // note :  static int a,b;  like this

        System.out.println(SG1.getA()+"\n"+SG1.getB()+"\ncalling with class name without creating object by declaring it as ststic method "+SetterAndGetterMethod.getA());

    }
}