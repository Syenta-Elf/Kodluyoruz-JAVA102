import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        String yazi = "\nBisiler deniyoruz iste kekw.";

        
        try (FileOutputStream output = new FileOutputStream("file.txt",true)) {
        byte[] yaziByte = yazi.getBytes();
        output.write(yaziByte);
        
        output.close();
        } catch (IOException e) {
            
            System.out.println(e.getMessage());
        }

        try {
            FileInputStream input = new FileInputStream("file.txt");

            int i = input.read();
            while(i!=-1)
            {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (FileNotFoundException e1) {
            
            e1.printStackTrace();
        }
    }
}