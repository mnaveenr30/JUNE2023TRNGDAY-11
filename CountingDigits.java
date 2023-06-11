import java.io.*;
class CountingDigits{
    public static void main(String args[])throws Exception{
        FileReader r=new FileReader("G:\\JAVA FULL STACK\\Day-11\\File Handling\\b.txt");
        BufferedReader br=new BufferedReader(r);
        int i;
        int count=0;
        while((i=br.read())!=-1){
            if((char)i>='0'&&(char)i<='9'){
                count++;
            }
        }
        r.close();
        br.close();
        System.out.println("Digits are : "
        +count++);
    }
}