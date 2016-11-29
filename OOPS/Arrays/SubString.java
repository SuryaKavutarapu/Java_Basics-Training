class SubString{
    public static void main(String []args){
        String str = new String("Hello World");
        System.out.println(str.substring(6));
        //it will print the characters from index of 6 "world";

         System.out.println(str.substring(0,5));
        //it will print the characters from index from 0 to 5 "hello";
        
        // string should be converted into lowercase and uppercase by using the two methods
        System.out.println(str.toUpperCase());    
        System.out.println(str.toLowerCase());   


        //String with function Start with it checks the Starting characters and returns TRUE of FALSE

        System.out.println(str.startsWith("H")); 
        System.out.println(str.endsWith("ld")); 
    }
}