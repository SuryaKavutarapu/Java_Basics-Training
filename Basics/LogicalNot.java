class LogicalNot{
    public static void main(String []args){
        int a = 100,b=200,c=30, d =50;

        boolean result = !((a<b) && (a<c) || (a<d));
        System.out.println(result);
    }
}