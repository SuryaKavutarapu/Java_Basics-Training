class UsingArgs{
    public static void main(String []args){
      int i[];
      i =new int[args.length];
      for(int s = 0;s<args.length;s++){
          i[s]= Integer.parseInt(args[s]);
      }
      for(int  a=0; a<i.length;a++){
          System.out.println(i[a]);
      }
      for(int  a=(i.length-1); a>=0;a--){
          System.out.println(i[a]);
      }
    }
}