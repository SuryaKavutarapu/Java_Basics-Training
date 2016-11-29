class OverLoading{
     void display(String x){
       System.out.println(x);
     }

     void display(int x){
       System.out.println(x);
     }
//    common function with different parameters which performs same task in single class

    public static void main(String []args){
       OverLoading OL = new OverLoading();
       //overloading increase the readability in program
       OL.display("surya");
       OL.display(505);
    }
}