class FindingGivenCharacter{
    public static void main(String []args){
        String s = args[0];
        char ch[] = s.toCharArray();

        for(int i = 0;i <= s.length()-1  ;i++){
            if((ch[i] >= 48) && (ch[i] <= 57)){
                System.out.println(ch[i]+ "is an integer");
            }else if((ch[i] >= 65) &&(ch[i] <= 90) ){
                System.out.println(ch[i]+ "is an uppercase letter");
            }else if((ch[i] >= 97) &&(ch[i] <= 122) ){
                System.out.println(ch[i]+ "is an lowercase letter");
            }else{
                System.out.println(ch[i]+ "is an specialcharacter");
            }
        }


         if((ch[0] >= 48) && (ch[0] <= 57)){
                System.out.println(s+ " is an integer");
            }else if((ch[0] >= 65) &&(ch[0] <= 90) || (ch[0] >= 97) && (ch[0] <= 122)){
                System.out.println(s+ " is an String");
            }else{
                System.out.println(s+ " is an specialcharacter");
            } 
    }
}