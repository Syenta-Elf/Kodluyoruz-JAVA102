import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Text.txt");
            FileWriter fw = new FileWriter("Text.txt",true);
            fw.write("\nitem"); // bunla yazmak daha kolay 
            fw.close();

            int i = fr.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i = fr.read();
            }
            fr.close();
            
        } catch (IOException e) {
         
            e.printStackTrace();
        }
    }
}