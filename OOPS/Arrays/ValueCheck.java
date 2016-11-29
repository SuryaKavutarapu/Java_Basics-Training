class ValueCheck{
    public static void main(String []args){
        int i[] = {20,30,10,50,40};
        boolean isThere = false;
        int a,b;
        if((Integer.parseInt(args[0]) >= 0)&&(Integer.parseInt(args[0]) <= 50) ){
            a = Integer.parseInt(args[0]);
            for(b = 0;b<i.length;b++){
                if(i[b] == a){
                    isThere = true;
                }
            }
            if(isThere == true){
                System.out.println("value is in the array");
            }else{
                System.out.println("value is not in the array");
            }
        }else{
            System.out.println("value is in b/w 0 to 50");
        }
    }
}