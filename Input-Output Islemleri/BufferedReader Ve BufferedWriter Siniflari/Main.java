import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main{
    public static void main(String[] args) {
        
        try {
            FileReader fr = new FileReader("Patika.txt",Charset.forName("UTF8"));
            BufferedReader br = new BufferedReader(fr);
            String line=br.readLine(); 
            while(line  != null)
            {
                System.out.println(line);
                line = br.readLine();
            }   
            br.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());    
        }
            try {
                FileWriter fw = new FileWriter("Patika.txt",Charset.forName("UTF8"),true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("\ntest");
                bw.close();
                fw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
    }
}