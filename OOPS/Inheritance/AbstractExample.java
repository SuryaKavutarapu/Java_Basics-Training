class AbstractExample{
    public static void main(String []args){
        GometryFigure g;//parent class reference
        g = new Triangle();//child class object
        g.area(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        g = new Rectangle();//child class object
        g.area(Integer.parseInt(args[2]),Integer.parseInt(args[3])); 
    }
}


abstract class GometryFigure{
   int length,height;

   abstract void area(int length,int height);
   //declared an abstract method named area
}

class Triangle extends GometryFigure{
//implementation of abstract method in child class
  public void area(int length,int height){
      double area =  0.5 * (length * height);
      System.out.println("area of triangle "+area);
  }   
}

class Rectangle extends GometryFigure{
//implementation of abstract method in child class
  public void area(int length,int height){
      int area =  (length * height);
      System.out.println("area of rectangle "+area);
  }   
}