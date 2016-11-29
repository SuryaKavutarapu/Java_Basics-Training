class  PerfectNumber{
    public static void main(String []args){
        int n,i=1,sum =0;
        n = Integer.parseInt(args[0]);
        while(i<n){
            if((n %i) == 0){
                sum= sum + i;
            }
            i++;
        }
         if(sum == n){
             System.out.println("perfect number");
         }else {
           System.out.println("not perfect");
         }  
    }
}