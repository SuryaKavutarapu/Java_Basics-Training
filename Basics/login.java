class login{
    public static void main(String []args){
       String username = args[0];
       String password = args[1];
       String defaultuname = "Surya",defaultpass = "surya";
        if(username.equals(defaultuname)){
            if(password.equals(defaultpass)){
             System.out.println("Login success");
            }else{
                System.out.println("Invalid password");
            }
        }else{
         System.out.println("Invalid username");   
        }
    }
}