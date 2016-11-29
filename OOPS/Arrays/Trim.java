class Trim{
    public static void main(String []args){
        String str = new String("Hello");

        String str1 = new String("  world   ");

        //use trim method to trim the white spaces
        System.out.println(str+str1.trim()); 


        //compare strings returns an positive value if true else return a negative value
        System.out.println(str.compareTo(str1));// if the values are exactly same it will return 0 value


    }
}