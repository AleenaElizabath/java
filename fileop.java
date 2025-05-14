import java.io.*;
public class fileop {
    public static void main(String[] args) {
        String fname=args[0];
        File f1=new File(fname);
        System.out.println("File name:"+f1.getName());
        System.out.println("File name:"+f1.getPath());
        System.out.println("File name:"+f1.exists());
    }
}
