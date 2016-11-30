class Bank{
    //protected variabls can be access to its child class 
    protected String bname;
    protected String bloaction;
    protected String branch;
}

class Account extends Bank{ 
    //private access specifier  has scope only to  that class
    private String  accname;
    private String acctype;
    private int accno;
    {  
        //input is an private class so we cannot call from another class so calling it via inastance initilization block
        input();
    }
    //private method
    private void input(){
        bname = "Statebank of India";
        bloaction = "Vijayawada";
        branch = "Mahendranagar";
        accno = 1234567890;
        accname = "Surya kavutarapu";
        acctype = "Savings";
    }
    void display(){
        System.out.println("\n======Bank Details=======================\nBank Name: "+bname+"\nBank Location: "+bloaction+"\nBank Branch: "+branch+"\n======Account Details====================\nAccount Holder No: "+accno+"\nAccount Holder Name: "+accname+"\nAccount Type: "+acctype+"\n=========================================");
    }
}

class BankAndCustomer{
  public static void main(String []args){
     Account A = new Account();
     A.display();
  }
}