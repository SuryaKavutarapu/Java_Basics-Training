class AmstrongNumber{
    public static void main(String []args){
        int n = Integer.parseInt(args[0]), c= 0,a,temp;
        temp = n;
        while(n>0){
          a = n%10;
          n = n/10;
          c = c+(a*a*a);
        }

        if(temp == c){
            System.out.println(temp+" Is Amstrong");
        }else {
            System.out.println(temp+" Is not Amstrong");
        }
    }
}