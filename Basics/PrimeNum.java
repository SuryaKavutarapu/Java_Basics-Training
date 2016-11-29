class Prime {
    public static void main(String []args){
        boolean isPrime = false;
        int i = 2,n;
        int start = Integer.parseInt(args[0]),end = Integer.parseInt(args[1]);
        while(start <= end ){
            i= 2;
            isPrime = false;
            n = start;
            while(i < n){
              if((n%i) == 0){
                  isPrime = true;
              }
              i++;
            }
            if(!isPrime){
             System.out.println(n);    
            }
           start++;
        }  
    }
}