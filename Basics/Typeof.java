class Typeof{
    public static void main(String []args){
      String x = "surya";
      TypeChecker t = new TypeChecker();
      t.printType(x);
    }
}


class TypeChecker{
  public void printType(int x){
      System.out.println(x+ "is an int");
  }
  public void printType(char x){
      System.out.println(x + "is an character");
  }
  public void printType(String x){
      System.out.println(x+ "is an string");
  }
  public void printType(float x){
      System.out.println(x+ "is an float");
  }

  public void printType(double x){
      System.out.println(x + "is an double");
  }

  public void printType(boolean x){
      System.out.println(x + "is boolean");
  }
}