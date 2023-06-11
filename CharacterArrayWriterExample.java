import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharacterArrayWriterExample {
    public static void main(String args[]) throws Exception {
        CharArrayWriter out = new CharArrayWriter();
        out.write("Welcome to this training");
        FileWriter f1 = new FileWriter("G:\\JAVA FULL STACK\\Day-11\\File Handling\\a.txt");
        FileWriter f2 = new FileWriter("G:\\JAVA FULL STACK\\Day-11\\File Handling\\b.txt");
        FileWriter f3 = new FileWriter("G:\\JAVA FULL STACK\\Day-11\\File Handling\\c.txt");
        FileWriter f4 = new FileWriter("G:\\JAVA FULL STACK\\Day-11\\File Handling\\d.txt");
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success.....");
    }

}
