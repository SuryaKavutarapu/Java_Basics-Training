import packageexample.FirstClass;
import packageexample.SecondClass;
//importing each class from package

/** 
 *  For User Defined packages only
 * 
 *  import packageexample.*;
 *  
 *  if we write like this we will get classname not found or path error this is becuase of file permissions
 *  
 *   
 */


//importing  packages from packageexamples package and accessing those classes and methods in the file
 
 /*
   note: while execution of this programme
     i.e java PackageExampleImplemetation

     on command line we get error because jvm dosent know where the clases are stored so we need to set the classpath for that instance 

    Ex :  set classpath = "C:\Surya\Packages\packageexample";

    To check path %classpath%

    then Execute java  PackageExampleImplemetation
 
 
 */
public class PackageExampleImplemetation{
   public static void main(String []args){
      FirstClass firstref = new FirstClass();
      SecondClass secref = new SecondClass();

      firstref.display();
      secref.display();
       }/*method main programm execution starts from here*/

}/*class PackageExampleImplemetation*/