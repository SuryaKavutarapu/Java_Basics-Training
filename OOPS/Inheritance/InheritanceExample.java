class Parts{
   void car(){
       System.out.println("you have selected car");
   }
   void bike(){
        System.out.println("you have selected bike");
   }
}

class Selection extends Parts{
    void select(){
      Selection s = new Selection();
      s.car();
      s.bike();
    }
}

class MyValue extends Selection{
    public static void main(String []args){
        MyValue MY = new MyValue();
        MY.select();
        MY.car();
    }
}