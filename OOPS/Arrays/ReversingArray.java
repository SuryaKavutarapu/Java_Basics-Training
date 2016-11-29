class ReverseArray{
    void arrayLenght(){
        //array decleration
        
        int i[] = {10,20,20,30,50,10,40,30,50};

        for(int a=(i.length-1);a >= 0; a--){
            System.out.println(i[a]);
        }
    }
    public static void main(String []args){
        ReverseArray ITA = new ReverseArray();
        ITA.arrayLenght();
    }
}