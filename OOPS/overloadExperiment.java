class OverloadingExperiment{
    void display(int a, int b){
        System.out.println((a+b));
    }
    void display(int a, float c){
        System.out.println((a*c));
    }
    public static void main(String []args){
      OverloadingExperiment OE = new OverloadingExperiment();
      OE.display(10,20);
      OE.display(20,30.00f);
    }
}