class EnhancedforLoop{
    public static void main(String []args){
        int a[] = {10,20,30,40,50};
        int b[] = new int[a.length];

        System.arraycopy(a,0,b,0,5);
        //enhanced for loop used for arrays and it automatic
        // length of array and takes each value internally and prints the value of z;
        for(int z:b){
           System.out.println(z);
       }
    }
}