class AbstractExample{
    public static void main(String []args){
        GometryFigure g;//parent class reference
        g = new Triangle();//child class object
        g.area(Integer.parseInt(args[0]),Integer.parseInt(args[1]));//calling area method in triangle class
        System.out.println(g.length);//prints args[0] value
        System.out.println(g.height);//prints args[1] value
        g = new Rectangle();//child class object
        g.area(Integer.parseInt(args[2]),Integer.parseInt(args[3]));//calling area method in rectangle class
        System.out.println(g.length);//prints args[2] value
        System.out.println(g.height);//prints args[3] value
    }
}

abstract class GometryFigure{
   int length,height;
   double area;
   abstract void area(int length,int height);
   //declared an abstract method named area
}

class Triangle extends GometryFigure{
  //implementation of abstract method in child class
  public void area(int length,int height){
      this.length = length;
      this.height = height;
      this.area =  0.5 * (length * height);
      System.out.println("area of triangle "+area);
  }   
}

class Rectangle extends GometryFigure{
  //implementation of abstract method in child class
  public void area(int length,int height){
      this.length = length;
      this.height = height;
      this.area =  (length * height);
      System.out.println("area of rectangle "+area);
  }   
}