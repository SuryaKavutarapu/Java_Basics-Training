import java.util.*;

class ArraySort{
    public static void main(String []args){
      String s[] = new String[args.length];

      for(int i= 0;i<=args.length-1;i++){
          s[i] = args[i];
      }
      Arrays.sort(s);

      for(String i : s){
          System.out.println(i);
      }
     }

     //string bufffers are thread safe && String builders are not thread safe
     //string buffers and string builders both are mutable 
}