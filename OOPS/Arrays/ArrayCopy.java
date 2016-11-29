class ArrayCopy{
    public static void main(String []args){
        int a[] = {10,20,30,40,50};
        int b[] = new int[a.length];

        System.arraycopy(a,0,b,0,5);
        for(int z=0;z<b.length;z++){
           System.out.println(b[z]);
       }
    }
}