class  PerfectNumberForLoop{
    public static void main(String []args){
        int n,i,sum =0;
        n = Integer.parseInt(args[0]);
        for(i=1;i<n;i++){
            if((n %i) == 0){
                sum= sum + i;
            }
        }
         if(sum == n){
             System.out.println("perfect number");
         }else {
           System.out.println("not perfect");
         }  
    }
}