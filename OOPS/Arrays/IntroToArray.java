class IntroToArrays{
    void array(){
        //array decleration
        
        int []i = {10,20,20,30,50,10,40,30,50};

        // int i[] = new int[]{10,20,20,30,50,10,40,30,50};
        // int i[];
        // i = new int[5];
        
        for(int a=0;a <= 8; a++){
            System.out.println(i[a]);
        }
    }
    public static void main(String []args){
        IntroToArrays ITA = new IntroToArrays();
        ITA.array();
    }
}