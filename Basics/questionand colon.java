class QuestionAndColon{
    public static void main(String []args){
        int a = 100,b=200,c=30;

        int lessthan = (a<b) && (a<c)? a : (b<c) ? b : c;
        int greaterthan = (a>b) && (a>c)? a : (b>c) ? b : c;
        System.out.println("less number"+ lessthan+"\n greter number" + greaterthan);
    }
}