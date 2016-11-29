class StringSorting{
    public static void main(String []args){
        String temp;
        int a,b;
        String s[] = new String[args.length];
        for(int x =0; x<args.length;x++){
            s[x]=args[x];
        }

          for(a=0;a<s.length;a++){      
           for(b=a+1;b<=s.length-1;b++){
               if(s[a].compareTo(s[b]) > 0){
                   temp = s[a];
                   s[a] = s[b];
                   s[b] = temp;
               }
           }
       }

       for(int i = 0;i<=s.length-1;i++){
           System.out.println(s[i]);
       }
    }
}