import java.io.*;
class FileRead1{
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("G:\\JAVA FULL STACK\\Day-11\\Add.java");
        BufferedReader r=new BufferedReader(fr);
        int i;
        while((i=r.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
        r.close();
    }
}