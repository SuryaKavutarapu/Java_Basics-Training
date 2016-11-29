class AddingNnumbers{
   public static void main(String []args){
      int n = Integer.parseInt(args[0]),sum=0,i=1;

      while(i<=n){
        sum = sum+i;
        i++;
        System.out.println(sum);
      }
   }
}