import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        File newfile=new File("ahsan");

        try {
            newfile.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter write = new FileWriter("ahsan");
            write.write("asjaisjaisjaisjaio");
            write.close();
        }catch (IOException e){

        }
        try {
            File f =new File("ahsan");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                String line= sc.nextLine();
                System.out.println(line);
            }
        }catch (IOException e){

        }
    }
}