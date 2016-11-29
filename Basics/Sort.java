import java.io.*;
class Sort
{
    public static void main(String args[])
   xz {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        if((a>b) && (a>c))
        {
        System.out.println("a is bigger");
        }
        else if((b>a) && (b>c))
        {
        System.out.println("b is bigger");
        }
        else if((c>a) && (c>b))
        {
        System.out.println("c is bigger");
        }
    }
}