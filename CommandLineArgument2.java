class CommandLineArgument2{
    public static void main(String n[]){
        int sum=0;
        for(String i:n) sum+=Integer.parseInt(i);
        System.out.println(sum);
    }
}