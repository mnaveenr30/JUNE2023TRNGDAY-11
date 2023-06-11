import java.io.*;
class CountingVowels{
    public static void main(String args[])throws Exception{
        FileReader r=new FileReader("G:\\JAVA FULL STACK\\Day-11\\File Handling\\a.txt");
        BufferedReader br=new BufferedReader(r);
        int i;
        int count=0;
        while((i=br.read())!=-1){
            if((char)i=='a'||(char)i=='e'||(char)i=='i'||(char)i=='o'||(char)i=='u'||(char)i=='A'||(char)i=='E'||(char)i=='I'||(char)i=='O'||(char)i=='U'){
                count++;
            }
        }
        r.close();
        br.close();
        System.out.println("Vowels are : "
        +count++);
    }
}