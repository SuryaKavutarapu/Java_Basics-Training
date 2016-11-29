class TwoDimensional{
    public static void main(String []args){
        int [][]a = new int[2][2];
        a[0][0] = 10;
        a[0][1] = 20;
        a[1][0] = 50;
        a[1][1] = 20;
  //normal array
        // for(int i = 0;i<a.length;i++){
        //     for(int j =0;j<a[i].length;j++){
        //         System.out.print("  "+a[i][j]);
        //     }

        //      System.out.println();
        // }


//reversing array
        for(int i = a.length-1;i>=0;i--){
            for(int j=a[i].length-1;j>=0;j--){
                System.out.print("  "+a[i][j]);
            }

             System.out.println();
        }
    }
}