class ToCharArray{
    public static void main(String []args){
        String  s = "SuryaKavutarapu";

        char ch[] = s.toCharArray();

        for(int i : ch){
          System.out.println(i);
        } 

        System.out.println(s.replaceAll("a","w"));
        String c =String.valueOf(100);//converts integer value to string
          System.out.println(c);
    }
}