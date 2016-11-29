class TransposeOfMatrix{
    public static void main(String []args){
        int [][]a = new int[2][2];
        a[0][0] = 10;
        a[0][1] = 20;
        a[1][0] = 50;
        a[1][1] = 20;
//just reverse the j and i in array like a[j][i] instead of a[i][j] then we get transpose of matrix
   for(int i = 0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print("  "+a[j][i]);
            }

             System.out.println();
        }
    }
}