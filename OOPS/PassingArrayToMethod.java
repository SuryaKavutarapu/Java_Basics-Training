import java.util.*;

class PassingArrayToMethod{
   int d[];
     
     public int[] arrayPassing(int []a){
         d = new int[a.length];
         for(int i =0;i<a.length;i++){
              //making a copy of a array to new b array
              d[i] = a[i]; 
         }

            //sorting array b
            Arrays.sort(d);
            //returning b array
            return d ;
     }
   public static void main(String []args){
       PassingArrayToMethod b = new PassingArrayToMethod();
       int c[];
           c = new int[args.length];
       for(int i =0;i<args.length;i++){
              c[i] = Integer.parseInt(args[i]);
         }

       int e[]=b.arrayPassing(c);

       for(int z : e){
           System.out.println(z);
       }
   }
}