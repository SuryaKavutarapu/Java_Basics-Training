class ArraysofArrays{
    public static void main(String []args){
        int [][]a = new int[3][];
        a[0] = new int[]{10,20};
        a[1] = new int[]{10,20,50,60,40};
        a[2] = new int[]{100,200,500,200};
//just reverse the j and i in array like a[j][i] instead of a[i][j] then we get transpose of matrix
   for(int i = 0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print("  "+a[i][j]);
            }

             System.out.println();
        }
    }
}