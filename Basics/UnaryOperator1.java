class UnaryOperator1{
    public static void main(String []args){
        int a = 5,b = 6;
        int output = (++a > b++) ? a++ : ++b;
        System.out.println("Result"+ output +"\na:"+ a+"\nb:"+ b); 
    }
}