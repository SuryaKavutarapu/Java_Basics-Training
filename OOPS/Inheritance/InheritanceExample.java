class Parts{
    //created a parent class parts 
   int a;
   //parent class methods car and bike 
   void car(){
       System.out.println("you have selected car");
   }
   void bike(){
        System.out.println("you have selected bike");
   }
}
//child class selection whit extends parent class Parts
class Selection extends Parts{
 
    void select(){
      // s now can access parts class methods because selection class extends parts class
      car();
      bike();
    }
}
//child class Myvalue whit extends parent class Selection note that selection is a child to the parts class so we can  access the parts method via Myvalue class reference variable
class MyValue extends Selection{
    public static void main(String []args){
 //object creation and calling methods using reference variable
        MyValue MY = new MyValue();
        // MY now can access parts class methods because selection class extends parts class as well as MY can access selection methods because Myvalue class Extends selection class
        MY.select();
        MY.car();
        MY.a = 10;

        System.out.println(MY.a);
    }
}