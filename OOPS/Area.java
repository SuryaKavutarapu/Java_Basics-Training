class Area{
    int area(int square){
         int  result = square*square;
         return result;
    }
    double area(double b ,double h){
         double  result = (0.5*b*h);
         return result;
    }
     float area(float circle){
         float  result = (float) Math.PI*(circle*circle);
         return result;
    }


  
}

class Areas{
    public static void main(String []args){
        Area A = new Area();
        System.out.println("area of square : "+ A.area(10)+"area of square : "+ A.area(20,30)+"area of square : "+ A.area(20.0f));

    }
}
 