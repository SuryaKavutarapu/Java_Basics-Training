/**
 *   package are containers which stores interfaces and classes and Organized for ease od access with out having any problem with naming convenctions
 *   
 *   packages are of two types
 * ============================
 * 
 *    1.Pre defined packages
 *    2.user defined packages
 *  
 * 
 * 
 *    Pre defined packages 
 *      Ex.java.lang;
 *     
 *      In the above  ex we have an Pre Defined Packages in which Java is an main package and            lang is of sub package 
 *      
 *      lang package is available for all programms
 * 
 *      predefined packages in java
 * ======================================================================================      
 *      packagename    |  Example classes
 * ======================================================================================
 *      java.lang      |  System, String, Object, Thread, Exception etc.
 *      
 *      java.util      |  These are called as utility (service) classes and are used very                                  frequently in coding.	
 *      
 *      java.net       |   URL, ServerSocket, Socket, DatagramPacket, DatagramSocket etc.
 *=======================================================================================

    User Defined packages
    =====================

    Declaring or Creating package

    Syntax :  package PackageName;
        we have  to declare it on the top of that  file
        and all the individual class should be declared as "Public"

        and in case of inheritance we can declare only to one class as "public"

    Compiling
      javac -d . filename.java
 
    " -d " is for creating a directory with that package name
     " . " is to place what ever the output comes from that programme i.e .class files will be send to that package folder
     
 */


/**
 *  Importing user defined package
 *   
 *     Syntax : import packageName.ClassName;
 *              loads that particular class in that current program where you imported
 *              
 *              import packageName.*;
 * 
 *              loads all the classes available on that package but it would not be recommended                  because it palced load on JVM
 *           
 *     
 *     Syntax  for Subpackages
 *       
 *           import packageName.subPackage.ClassName;
 *           
 *           import packageName.subPackage.*;
 *      
 */