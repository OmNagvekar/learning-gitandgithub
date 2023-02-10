//package h;
import java.io.*;
import java.util.Scanner;
public class CreateFile{
    public static void main(String[] args) {
        try {
            File f= new File("C:/Users/Om Nagvekar/OneDrive/Desktop/temp/Hi.txt");
            if (f.createNewFile()){
                System.out.println("File "+f.getName()+" is Created sucessfully" );
                System.out.println(f.getAbsolutePath());
            }
            else{
                System.out.println("File is already exist in the directory.");
                System.out.println(f.getAbsolutePath());
                System.out.println(f.canWrite());
                System.out.println(f.canRead());
                System.out.println(f.length());
            }
            try {
                FileWriter fwrite = new FileWriter("Hi.txt");
                fwrite.write("Hi there this is first file handling code\nkkkk");
                fwrite.close();
                File fx=new File("Hi.txt");
                Scanner sc = new Scanner(fx);
                while(sc.hasNextLine()){
                    String data = sc.nextLine();
                    System.out.println(data);
                }
                sc.close();
                System.out.println("File Size on Disk is: "+f.length());
                System.out.println("Succssfully Writen text in file ");
            } catch (IOException eb) {
                // TODO: handle exception
                System.out.println("Error");
                eb.printStackTrace();
            }
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("Error");
            e.printStackTrace();
        }
        File fe = new File("Hi.txt");
        if (fe.delete()){
            System.out.println(fe.getName()+" Deleted Successfully");
        }
        else{
            System.out.println("Error 2");
        }

    }
}