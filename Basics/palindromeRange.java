class PalindromeRange{
    public static void main(String []args){
      int num, rem, reverse_num, temp, start, end;
        start = Integer.parseInt(args[0]);
        end = Integer.parseInt(args[1]);
        num=start;
        while(num<=end){
                temp=num;
                reverse_num=0;
                while(temp>0){
                    rem=temp%10;
                    temp=temp/10;
                    reverse_num=reverse_num*10+rem;
                }
                if(num==reverse_num){
                    System.out.println(num);
                }
          num++;
        }
    }
}