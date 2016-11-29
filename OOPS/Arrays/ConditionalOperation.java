class Calculation{
    void add(int a,int b){
      System.out.println(a+b);
    }

    void sub(int a,int b){
      System.out.println(a-b);
    }

    void mul(int a,int b){
      System.out.println(a*b);
    }
}

class ConditionalOperator{
    public static void main(String []args){
    Calculation d = new Calculation();
        String []a = new String[args.length];
        for(int i=0;i<=args.length-1;i++){
            a[i] = args[i];
        }

        char ch = a[2].charAt(0);
        int  b = Integer.parseInt(a[0]),c = Integer.parseInt(a[1]);

        switch (ch) {
            case '+' : d.add(b,c); break;
            case '-' :  d.sub(b,c); break;
            case 'x' : d.mul(b,c); break;
        }
    }
}