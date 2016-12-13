package package3;

import package2.Package2Class;

public class Package3Class extends Package2Class{
   public void output(){
     System.out.println("method in package3.Package3Class");

     display();//calling package2Class methods
   }/*method  output*/

}/*class Package3Class */