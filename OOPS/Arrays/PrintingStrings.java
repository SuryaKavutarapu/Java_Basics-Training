class PrintingStrings{
    public static void main(String []args){
        String i[];
        i = new String[args.length];
        for(int x= 0; x<args.length;x++){
            i[x]= args[x];
            System.out.println(i[x]);
        }
    }
}