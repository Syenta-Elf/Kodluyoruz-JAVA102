import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main{
    public static void main(String[] args) {
        
       
        try {
            FileInputStream file = new FileInputStream("text.txt");
            InputStreamReader inputReader = new InputStreamReader(file,Charset.forName("UTF8"));
            System.out.println(inputReader.getEncoding());

            int i = inputReader.read();
            while(i != -1)
            {
                System.out.print((char)i);
                i = inputReader.read();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}