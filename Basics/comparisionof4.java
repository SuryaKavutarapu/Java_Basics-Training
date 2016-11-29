class Comparisionof4{
    public static void main(String []args){
        int a = 100,b=200,c=30,d=300;

        int lessthan = (a<b) && (a<c) && (a<d)? a : (b<c) && (b<d) ? b : (c<d) ? c : d;
        int greaterthan = (a>b) && (a>c) && (a>d)? a : (b>c) && (b>d) ? b : (c>d) ? c : d;
        System.out.println("less number"+ lessthan+"\ngreater number" + greaterthan);
    }
}  