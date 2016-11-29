class SortingofArray{
    public static void main(String []args){
       int a,b,temp;
       int i[];
       i = new int[args.length];
       for(int p=0;p<=args.length-1;p++){
           i[p] = Integer.parseInt(args[p]);
        //    System.out.println(i[p]);
       }

       for(a=0;a<i.length;a++){      
           for(b=a+1;b<=i.length-1;b++){
               if(i[a] < i[b]){
                   temp = i[a];
                   i[a] = i[b];
                   i[b] = temp;
               }
           }
       }

       //enchanced for loop
       for(int z:i){
           System.out.println(z);
       }
    }
}