class LuckeyNum{
    public static void main(String []args)
    {
      int num = Integer.parseInt(args[0]),sum=0,rem=0;
      while(num>9){
          sum = 0 ;
          while(num>0){
            rem = num%10;
            sum = sum+rem;
            num= num/10;
          }
          num = sum;
      }
      System.out.println("LuckeyNum "+num);
    }
}