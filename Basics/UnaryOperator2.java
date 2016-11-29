class UnaryOperator2{
    public static void main(String []args){
        int a = -10,b = -3,c=0;
        int output = (++a > ++b) && (a++ > c) ? ++a : (b-- > --c) ? --b : c-- ;
        System.out.println("Result"+ output +"\na:"+ a+"\nb:"+ b+"\nc:"+c);
    }
}