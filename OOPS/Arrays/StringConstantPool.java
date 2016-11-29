class StringConstantPool{
    public static void main(String []args){
        String s1 = "surya",s2 = "surya";
        System.out.println(s1);
        System.out.println(s2);
        // here both the strings is having same value then the StringConstantPool is allocating the memory to the first one and checks the next string is weather avilable or not and make the first string as reference to the second with out reallocating the memory.This takes care by StringConstantPool.
        System.out.println(s1==s2);//reference comparision
      

        String s3 = "surya",s4 = new String("surya");
        //here we allocting the strings in differnt memory location so we get false when we compare the string by == 
       System.out.println(s3.equals(s4));  //content comparison




       //NOTE : strings are immutable because strings cannot be modified in same memomry location instead we use another memory locaction and the data will be updated 
    }
}