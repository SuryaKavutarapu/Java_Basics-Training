import java.util.*;
class StringBuffers{
    public static void main(String []args){
        StringBuffer sb =new  StringBuffer(args[0]);

        String s = new String(args[1]);

        sb.append(s);//apppend is used for concate strings IN STRINGBUFFES instead of using tocONCATE();

        System.out.println(sb);


        sb.insert(5,"java");//inserts the string at particular location
        System.out.println(sb);

        sb.replace(0,4,"Surya");//it will replace the string from starting location to ending location as shown in the above example
        System.out.println(sb);
        sb.delete(0,5);//deletes particular characters in a string
        System.out.println(sb + "\nreverse string: "+sb.reverse());
        System.out.println(sb.capacity());

        // we can also use these methods in chain

        sb.append("surya").append(sb.reverse());
        System.out.println(sb);
    }
}