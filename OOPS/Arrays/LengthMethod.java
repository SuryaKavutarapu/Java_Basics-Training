class LengthMethod{
    void arrayLenght(){
        //array decleration
        
        int i[] = {10,20,20,30,50,10,40,30,50};

        for(int a=0;a < i.length; a++){
            System.out.println(i[a]);
        }
    }
    public static void main(String []args){
        LengthMethod ITA = new LengthMethod();
        ITA.arrayLenght();
    }
}