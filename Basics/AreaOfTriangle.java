class AreaOfTriangle {
  public static void main(String []args){

    int a  = Integer.parseInt(args[0]);
    int b  = Integer.parseInt(args[1]);
    int c  = Integer.parseInt(args[2]);
    float s = (float) (a+b+c)/2 ;
    float area = (float) Math.sqrt(s*(s-a)*(s-b)*(s-c));   
 
    System.out.println("Area of traiangle"+ area);
    
  } 
 
}