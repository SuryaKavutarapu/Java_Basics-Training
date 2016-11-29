class CurrentBill{
    public static void main (String []args){
       int previousReading =  Integer.parseInt(args[0]);
       int currentReading =  Integer.parseInt(args[1]);
       int no_of_units = previousReading - currentReading; 
       if(no_of_units > 50){
          System.out.println("Your Current bill for"+no_of_units+"units is"+(no_of_units  * 0.50));           
       }else if((no_of_units > 50) && (no_of_units <= 100)){
          System.out.println("Your Current bill for"+no_of_units+"units is"+(no_of_units  * 1.10));  
       }
       else if((no_of_units > 100) && (no_of_units <= 200)){
          System.out.println("Your Current bill for"+no_of_units+"units is"+(no_of_units  * 1.10));  
       }
       else{
          System.out.println("Your Current bill for"+no_of_units+"units is"+(no_of_units  * 1.10));  
       }
    }
}