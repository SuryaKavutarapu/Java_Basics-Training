class UnaryOperator{
    public static void main(String []args){
        int a = 10,b = 20;
        boolean output = (a++ > b++) && (b++ > ++b) || (a++ > ++a);
        System.out.println("Result"+ output +"\na:"+ a+"\nb:"+ b); 
    }
}