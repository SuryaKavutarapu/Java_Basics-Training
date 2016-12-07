class SingleTonDesign{
  private static final SingleTonDesign  instance = new SingleTonDesign();
  //creating an object for final static. object we are creating in same class and returning it using another public get instance function because in single ton pattern the object of class is created only once so we declared an private static final reference variable instance and assigning an object to it

  //private SingleTonDesign class is also declared as private because there is no object creation for that class

  private SingleTonDesign(){
      System.out.println("In Constructor");
  }
  //get instance method to return SingleTonDesign class object
  public static SingleTonDesign getInstance(){
      return instance;
  } 
}/*class SingleTonDesign*/


class Sample{
  public static void main(String []args){
      //if we want create objects for that class with "N" of reference variables

      //we have to follow like this
       
       //reference variable SD1 
       SingleTonDesign SD1 = SingleTonDesign.getInstance();//it will return an object of SingleTonDesign class


        //reference variable SD2
       SingleTonDesign SD2 = SingleTonDesign.getInstance();//it will return an object of SingleTonDesign class

    
        /**   
         * 
         *      SingleTonDesign SD = new SingleTonDesign();
         * 
         *      if we create an object for an private Constructor  we will get error
         *      
         *     SingleTonDesign.java:23: error: SingleTonDesign() has private access in SingleTonDesign
                    SingleTonDesign SD = new SingleTonDesign();
                                        ^
                1 error

         */
  }/*method main method  programm execution starts from here*/
}/*class Sample*/
